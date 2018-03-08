package com.example.android.darkskyweather.view;

/**
 * Created by rynel on 3/8/2018.
 */

public interface BasePresenter <V extends BaseView>{

    void addView (V view);
    void removeView();
}
