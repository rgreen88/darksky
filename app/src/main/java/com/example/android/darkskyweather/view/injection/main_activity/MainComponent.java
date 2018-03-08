package com.example.android.darkskyweather.view.injection.main_activity;

import com.example.android.darkskyweather.view.activities.main_activity.MainActivity;

import dagger.Component;

/**
 * Created by rynel on 3/8/2018.
 */
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
