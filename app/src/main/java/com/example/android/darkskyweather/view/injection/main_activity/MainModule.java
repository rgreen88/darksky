package com.example.android.darkskyweather.view.injection.main_activity;

import com.example.android.darkskyweather.view.activities.main_activity.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rynel on 3/8/2018.
 */
@Module
public class MainModule {
    @Provides
    public MainPresenter mainPresenterProvides(){
        return new MainPresenter();
    }
}

