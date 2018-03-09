package com.example.android.darkskyweather.view.activities.main_activity;

import com.example.android.darkskyweather.data.remote.APIProvider;

/**
 * Created by rynel on 3/8/2018.
 */

public class MainPresenter implements MainContract.Presenter{

    MainContract.View view;

    @Override
    public void addView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void getWeatherInformation(double lat, double lng) {
        APIProvider.getWeatherCall(lat, lng);
    }
}
