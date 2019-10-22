package com.vusile.myapplication;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vusile.myapplication.animals.AnimalsActivity;
import com.vusile.myapplication.lakes.LakesActivity;
import com.vusile.myapplication.mountains.MountainsActivity;
import com.vusile.myapplication.minerals.MineralsActivity;
import com.vusile.myapplication.nationalparks.NationalParksActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotate_Clockwise();
    }

    public void startAnimalActivity(View view) {
        Intent i = new Intent(this, AnimalsActivity.class);
        startActivity(i);
    }

    public void startLakesActivity(View view) {
        Intent i = new Intent(this, LakesActivity.class);
        startActivity(i);
    }

    public void startMineralsActivity(View view) {
        Intent i = new Intent(this, MineralsActivity.class);
        startActivity(i);
    }

    public void startMountainsActivity(View view) {
        Intent i = new Intent(this, MountainsActivity.class);
        startActivity(i);
    }

    public void startNationalParksActivity(View view) {
        Intent i = new Intent(this, NationalParksActivity.class);
        startActivity(i);
    }

    public void rotate_Clockwise() {

        ImageView lakeImageView = findViewById(R.id.lakes);
        ImageView animalImageView = findViewById(R.id.animals);
        ImageView mountainsImageView = findViewById(R.id.mountains);
        ImageView mineralsImageView = findViewById(R.id.minerals);
        ImageView parksImageView = findViewById(R.id.national_parks);

        ObjectAnimator lake_rotate = ObjectAnimator.ofFloat(lakeImageView, "rotation", 180f, 0f);
        lake_rotate.setDuration(1000);
        lake_rotate.start();


        ObjectAnimator animal_rotate = ObjectAnimator.ofFloat(animalImageView, "rotation", 90f, 0f);
        animal_rotate.setStartDelay(1000);
        animal_rotate.setDuration(1000);
        animal_rotate.start();

        ObjectAnimator minerals_rotate = ObjectAnimator.ofFloat(mineralsImageView, "rotation", 90f, 0f);
        minerals_rotate.setStartDelay(2000);
        minerals_rotate.setDuration(1000);
        minerals_rotate.start();

        ObjectAnimator mountains_rotate = ObjectAnimator.ofFloat(mountainsImageView, "rotation", 90f, 0f);
        mountains_rotate.setStartDelay(3000);
        mountains_rotate.setDuration(1000);
        mountains_rotate.start();

        ObjectAnimator parks_rotate = ObjectAnimator.ofFloat(parksImageView, "rotation", 90f, 0f);
        parks_rotate.setStartDelay(4000);
        parks_rotate.setDuration(1000);
        parks_rotate.start();


    }
}
