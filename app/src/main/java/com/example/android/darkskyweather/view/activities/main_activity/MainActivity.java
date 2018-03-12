package com.example.android.darkskyweather.view.activities.main_activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.darkskyweather.R;
import com.example.android.darkskyweather.model.DailyDatum;
import com.example.android.darkskyweather.model.WeatherInformation;
import com.example.android.darkskyweather.view.injection.main_activity.DaggerMainComponent;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    // remember this next time
    @Inject
    MainPresenter presenter;

    private RecyclerView weatherView;
    RecyclerView.ItemAnimator itemAnimator;
    RecyclerView.LayoutManager manager;
    private List<DailyDatum> weatherList = new ArrayList<>();
    private WeatherAdapter weatherAdapter;

    //TextView hyperlink
    TextView credit;

    //IntentFilter for broadcast receiver
    IntentFilter intentFilter = new IntentFilter("weather");

    //setting up receiver
    MyReceiver myReceiver = new MyReceiver();


    //lat long coordinates in et
    EditText et_lat;
    EditText et_lng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupDagger();


        //populate view
        presenter.addView(this);
        weatherView = findViewById(R.id.rv_weather);

        //lat long coordinates San Diego at start of app
        double lng = 117.1611;
        double lat = 32.7157;
        presenter.getWeatherInformation(lat, lng);

        //retrieve weather info
        //presenter.getWeatherInformation(lat, lng);

        //bind hyperlink textview to tv id
        credit = findViewById(R.id.tv_credit);

        //bind et
        et_lat = findViewById(R.id.et_lat);
        et_lng = findViewById(R.id.et_lng);

        credit.setText(
                Html.fromHtml(
                        "<a href=\"https://darksky.net/poweredby/\">Powered by Dark Sky</a> "));
        credit.setMovementMethod(LinkMovementMethod.getInstance());


    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setupDagger() {
        DaggerMainComponent.create().inject(this);
    }

    //method setting up recyclerview
    @Override
    public void setupAdapter(WeatherInformation information) {

        manager = new LinearLayoutManager(this);
        itemAnimator = new DefaultItemAnimator();
        weatherList.clear();
        //new dailydatum object pulling data from Currently to display current day
        DailyDatum dailyDatum = new DailyDatum(
                information.getCurrently().getIcon(),
                information.getCurrently().getTemperature(),
                information.getCurrently().getApparentTemperature(),
                information.getCurrently().getTemperature(),
                information.getCurrently().getApparentTemperature(),
                information.getCurrently().getDewPoint(),
                information.getCurrently().getHumidity());

        weatherList.add(dailyDatum);
        weatherList.addAll(information.getDaily().getData());

        //setting adapter
        weatherAdapter = new WeatherAdapter(weatherList);

        weatherView.setAdapter(weatherAdapter);
        weatherView.setLayoutManager(manager);
        weatherView.setItemAnimator(itemAnimator);


    }

    //pushing information from DailyDatum to ExtendedWeather Activity
    @Override
    public void showDetailedInformation(String information) {

        Intent intent = new Intent(this, ExtendedWeather.class);
        intent.putExtra("weather", information);
        this.startActivity(intent);

    }

    //registering and unregistering receiver
    @Override
    protected void onStart() {
        super.onStart();

        registerReceiver(myReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myReceiver);
    }

    //refresh button
    public void getRefresh(View view) {
        //refresh reverts to lat long coordinates San Diego
        double lng = 117.1611;
        double lat = 32.7157;
        presenter.getWeatherInformation(lat, lng);
    }

    //using edittext to set lat/lng to desired search
    public void getCoodinates(View view) {
        //conditional statement to check lat/lng values and calls to search for weather info
        // by input lat/lng and converts string to double. Adds error toasts for specific errors
        if (!et_lat.getText().toString().equals("") && !et_lng.getText().toString().equals("")) {
            double lat = Double.parseDouble(et_lat.getText().toString());
            double lng = Double.parseDouble(et_lng.getText().toString());
            if (lat > 90 || lat < -90) {
                showError("Latitude can not be more then 90 or less than -90");
            } else if (lng > 180 || lng < -180) {
                showError("Longitude can not be more then 180 or less than -180");
            } else {
                presenter.getWeatherInformation(lat, lng);
            }
        } else {
            showError("You must have both a Latitude and a Longitude");
        }
    }

    //weather as string reference to broadcast
    class MyReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {

            showDetailedInformation(intent.getStringExtra("weather"));

        }
    }
}
