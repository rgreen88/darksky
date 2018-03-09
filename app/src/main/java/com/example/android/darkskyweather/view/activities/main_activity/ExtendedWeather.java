package com.example.android.darkskyweather.view.activities.main_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.darkskyweather.R;

public class ExtendedWeather extends AppCompatActivity {

    String apparentHigh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extended_weather);


    }

    public void goBack(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);

    }
}


