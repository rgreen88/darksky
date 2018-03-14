package com.example.android.darkskyweather.view.activities.main;

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
import com.example.android.darkskyweather.view.activities.main.injection.DaggerMainComponent;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    //Injecting presenter into MainActivity
    @Inject
    MainPresenter presenter;

    //RV
    private RecyclerView weatherView;
    RecyclerView.ItemAnimator itemAnimator;
    RecyclerView.LayoutManager manager;
    private List<DailyDatum> weatherList = new ArrayList<>();
    private MainAdapter mainAdapter;

    //TextView hyperlink
    TextView credit;

    //lat long coordinates in et
    EditText etLat;
    EditText etLng;

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

        //bind hyperlink textview to tv id
        credit = findViewById(R.id.tv_credit);

        //bind et
        etLat = findViewById(R.id.et_lat);
        etLng = findViewById(R.id.et_lng);

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
        mainAdapter = new MainAdapter(weatherList);
        weatherView.setAdapter(mainAdapter);
        weatherView.setLayoutManager(manager);
        weatherView.setItemAnimator(itemAnimator);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.removeView();
    }

    //refresh button reverts to lat long coordinates San Diego
    public void getRefresh(View view) {

        double lng = 117.1611;
        double lat = 32.7157;
        presenter.getWeatherInformation(lat, lng);
    }

    //using edittext to set lat/lng to desired search
    public void getCoodinates(View view) {

        //conditional statement to check lat/lng values and calls to search for weather info
        // by input lat/lng and converts string to double. Adds error toasts for specific errors
        if (!etLat.getText().toString().equals("") && !etLng.getText().toString().equals("")) {
            double lat = Double.parseDouble(etLat.getText().toString());
            double lng = Double.parseDouble(etLng.getText().toString());
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
}