package com.example.android.darkskyweather.data.remote;


import com.example.android.darkskyweather.model.WeatherInformation;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Retrofit2 setup
public class APIProvider {
    private static final String BASE_URL = "https://api.darksky.net/";
    private static final String API_KEY ="3115e1b5ecf87a70477ab1b50dca629a"; //secret key
    private static Retrofit create(){

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static Call<WeatherInformation> getWeatherCall(double lat, double lng){
        Retrofit retrofit = create();
        APIService services = retrofit.create(APIService.class);
        return services.weatherCall(API_KEY,lat,lng);
    }
}
