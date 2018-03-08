package com.example.android.darkskyweather.view.activities.main_activity;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.darkskyweather.R;
import com.example.android.darkskyweather.model.DailyDatum;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by rynel on 3/8/2018.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    private List<DailyDatum> dailyDatums = new ArrayList<>();

    public WeatherAdapter(List<DailyDatum> dailyDatums) {
        this.dailyDatums = dailyDatums;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.weather_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DailyDatum datum = dailyDatums.get(position);
        Log.d(TAG, "# " + position);
    }

    @Override
    public int getItemCount() {
        return dailyDatums.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}