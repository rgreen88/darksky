package com.example.android.darkskyweather.view.activities.main.injection;

import com.example.android.darkskyweather.view.activities.main.MainActivity;

import dagger.Component;

/**
 * Created by rynel on 3/8/2018.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}