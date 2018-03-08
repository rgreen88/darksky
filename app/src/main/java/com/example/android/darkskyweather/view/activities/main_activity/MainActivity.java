package com.example.android.darkskyweather.view.activities.main_activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.android.darkskyweather.R;
import com.example.android.darkskyweather.model.DailyDatum;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract{

    private RecyclerView weatherView;


    RecyclerView.ItemAnimator itemAnimator;
    private List<DailyDatum> weatherList = new ArrayList<>();
    private WeatherAdapter weatherAdapter;

    TextView city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        city = findViewById(R.id.tv_city);
        weatherView = findViewById(R.id.rv_weather);

        //RecyclerView LinearLayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        weatherView.setLayoutManager(layoutManager);
        weatherView.setHasFixedSize(true);

        itemAnimator = new DefaultItemAnimator();

        weatherView.setLayoutManager(layoutManager);
        weatherView.setItemAnimator(itemAnimator);

        //setting adapter
        weatherAdapter = new WeatherAdapter(weatherList);
        weatherView.setAdapter(weatherAdapter);
    }
}
