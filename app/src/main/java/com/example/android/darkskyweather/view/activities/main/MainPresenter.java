package com.example.android.darkskyweather.view.activities.main;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.android.darkskyweather.data.remote.APIProvider;
import com.example.android.darkskyweather.model.WeatherInformation;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by rynel on 3/8/2018.
 */

public class MainPresenter implements MainContract.Presenter{

    private static final String TAG = "test";
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

        retrofit2.Call<WeatherInformation> weatherInformationCall = APIProvider.getWeatherCall(lat, lng);
        weatherInformationCall.enqueue((new retrofit2.Callback<WeatherInformation>() {
            @Override
            public void onResponse(@NonNull Call<WeatherInformation> call, @NonNull Response<WeatherInformation> response) {
                Log.d(TAG, "onResponse: " + response.body());
                view.setupAdapter(response.body()); //passing WeatherInformation using body() into adapter
            }

            @Override
            public void onFailure(@NonNull Call<WeatherInformation> call, @NonNull Throwable t) {
                view.showError(t.getMessage());
            }
        }));
    }
}