package com.example.android.darkskyweather.view.activities.extended;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.darkskyweather.R;
import com.example.android.darkskyweather.model.DailyDatum;
import com.example.android.darkskyweather.view.activities.main.MainActivity;
import com.google.gson.Gson;

public class ExtendedWeather extends AppCompatActivity {

    TextView apparentHigh;
    TextView apparentLow;
    DailyDatum datum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extended_weather);

        apparentHigh = findViewById(R.id.tv_apparent_high);
        apparentLow = findViewById(R.id.tv_apparent_low);

        //calling to set text views
        Gson gson = new Gson();
        datum = gson.fromJson(getIntent().getStringExtra("weather"), DailyDatum.class);
        String appHigh = "Apparent high: " + datum.getApparentTemperatureHigh();
        String appLow = "Apparent low: " + datum.getApparentTemperatureLow();

        //set textviews
        apparentHigh.setText(appHigh);
        apparentLow.setText(appLow);
    }

    public void goBack(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);

    }
}