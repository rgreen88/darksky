package com.example.android.darkskyweather.view.activities.main_activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.darkskyweather.R;
import com.example.android.darkskyweather.model.DailyDatum;
import com.example.android.darkskyweather.model.WeatherInformation;
import com.example.android.darkskyweather.view.injection.main_activity.DaggerMainComponent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View{ // you need to add .View to this

    private RecyclerView weatherView;
    MainPresenter presenter;
    RecyclerView.ItemAnimator itemAnimator;
    private List<DailyDatum> weatherList = new ArrayList<>();
    private WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupDagger();

        ImageView icon = findViewById(R.id.iv_condition);
        TextView city = findViewById(R.id.tv_city);
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

    @Override
    public void showError(String error) {

    }

    @Override
    public void setupDagger() {
        DaggerMainComponent.create().inject(this);
    }

    @Override
    public void setupAdapter(WeatherInformation information) {

    }

    @Override
    public void showDetailedInformation() {

    }
}
