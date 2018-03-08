package com.example.android.darkskyweather.data.remote;

import com.example.android.darkskyweather.model.WeatherInformation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by rynel on 3/8/2018.
 */

public interface APIServices {
    //put your @GET calls here
    @GET("forecast/[key]/[latitude],[longitude")
    Call<WeatherInformation> weatherCall (@Path("user") String user, double lat, double lng);//hardcoded for now
}

