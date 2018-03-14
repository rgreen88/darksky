package com.example.android.darkskyweather.view.activities.main;

import com.example.android.darkskyweather.model.WeatherInformation;
import com.example.android.darkskyweather.view.BasePresenter;
import com.example.android.darkskyweather.view.BaseView;

/**
 * Created by rynel on 3/8/2018.
 */

public interface MainContract {
    interface View extends BaseView{
        void setupAdapter(WeatherInformation information);
        void showDetailedInformation(String information);//when you click on day

    }

    interface Presenter extends BasePresenter<View>{
        void getWeatherInformation(double lat, double lng);
    }
}
