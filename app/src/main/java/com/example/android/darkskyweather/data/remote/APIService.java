package com.example.android.darkskyweather.data.remote;


import com.example.android.darkskyweather.model.WeatherInformation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

//making call to retrieve information at coordinates
public interface APIService {
    @GET("forecast/{key}/{latitude},{longitude}")
    Call<WeatherInformation> weatherCall(@Path("key") String key, @Path("latitude") double lat, @Path("longitude") double lng);
}