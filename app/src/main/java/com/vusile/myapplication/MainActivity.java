package com.vusile.myapplication;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vusile.myapplication.animals.AnimalsActivity;
import com.vusile.myapplication.lakes.LakesActivity;
import com.vusile.myapplication.mountains.MountainsActivity;
import com.vusile.myapplication.minerals.MineralsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        //Todo : Implement NationalParksActivity
        Snackbar.make(view, "This will Start NationalParksActivity", Snackbar.LENGTH_LONG)
                .setAction("Dismiss", null).show();
    }
}
