package com.helpmeproductions.willus08.darksky.data.remote;


import com.helpmeproductions.willus08.darksky.model.WeatherInformation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {
    @GET("forecast/{key}/{latitude},{longitude}")
    Call<WeatherInformation> weatherCall(@Path("key") String key, @Path("latitude") double lat, @Path("longitude") double lng);
}
