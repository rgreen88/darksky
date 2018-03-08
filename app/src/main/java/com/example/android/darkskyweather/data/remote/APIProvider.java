package com.example.android.darkskyweather.data.remote;

import com.example.android.darkskyweather.model.WeatherInformation;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rynel on 3/8/2018.
 */

public class APIProvider {
    //setup retrofit calls here

    private static final String BASE_URL = "https://api.darksky.net/";
    private static final String API_KEY ="3115e1b5ecf87a70477ab1b50dca629a";
    private static Retrofit create(){

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static Call<WeatherInformation> getWeatherCall(){
        Retrofit retrofit = create();
        APIServices services = retrofit.create(APIServices.class);
        return services.weatherCall(API_KEY, 117.1611,32.7157);//San Diego coordinates
    }
}
