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

        ObjectAnimator lake_rotate = ObjectAnimator.ofFloat(lakeImageView, "rotation", 180f, 0f);
        lake_rotate.setRepeatCount(3);
        lake_rotate.setDuration(1000);
        lake_rotate.start();

        ImageView animalImageView = findViewById(R.id.animals);

        ObjectAnimator animal_rotate = ObjectAnimator.ofFloat(animalImageView, "rotation", 90f, 0f);
        animal_rotate.setRepeatCount(3);
        animal_rotate.setStartDelay(800);
        animal_rotate.setDuration(1000);
        animal_rotate.start();
    }
}
