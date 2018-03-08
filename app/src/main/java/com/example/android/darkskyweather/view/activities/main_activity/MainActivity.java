package com.example.android.darkskyweather.view.activities.main_activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.darkskyweather.R;
import com.example.android.darkskyweather.model.DailyDatum;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract{

    private RecyclerView weatherView;

    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;
    private List<DailyDatum> weatherList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        weatherView = findViewById(R.id.rv_weather);



        layoutManager = new LinearLayoutManager(this);
        itemAnimator = new DefaultItemAnimator();
        WeatherAdapter weatherAdapter = new WeatherAdapter(weatherList);

        weatherView.setLayoutManager(layoutManager);
        weatherView.setItemAnimator(itemAnimator);
        weatherView.setAdapter(weatherAdapter);


    }
}
