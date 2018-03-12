package com.example.android.darkskyweather.view.activities.main_activity;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.darkskyweather.R;
import com.example.android.darkskyweather.model.DailyDatum;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

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
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final DailyDatum datum = dailyDatums.get(position);

        String high = "High: " + datum.getTemperatureHigh();
        String low = "Low: " + datum.getTemperatureLow();
        String humidity = "Humidity: " + datum.getHumidity();
        String dewPoint = "Dew Point: " + datum.getDewPoint();
        String condition = datum.getIcon();

        holder.high.setText(high);
        holder.low.setText(low);
        holder.humidity.setText(humidity);
        holder.dewPoint.setText(dewPoint);
        holder.condition.setText(condition);


        //setting images from mipmap via picasso and if/else statements
        if(datum.getIcon() == null){
            if(datum.getIcon().toLowerCase().contains("part")){
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.partly_cloudy)
                        .into(holder.icon);
            }else if(datum.getIcon().toLowerCase().contains("cloud")){
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.cloudy)
                        .into(holder.icon);
            }else if(datum.getIcon().toLowerCase().contains("snow")){
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.snow)
                        .into(holder.icon);
            }else if(datum.getIcon().toLowerCase().contains("rain")){
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.rainy)
                        .into(holder.icon);
            }else {
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.sunny)
                        .into(holder.icon);

            }
        }

        //setting onClickListener in adapter
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("weather");
                Gson gson = new Gson(); //converting gson object to string
                intent.putExtra("weather", gson.toJson(datum));
                holder.itemView.getContext().sendBroadcast(intent);
            }
        });

        Log.d(TAG, "# " + position);
    }

    @Override
    public int getItemCount() {
        return dailyDatums.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView high;
        TextView low;
        TextView humidity;
        TextView dewPoint;
        TextView condition;
        RelativeLayout container;

        public ViewHolder(View itemView) {
            super(itemView);

            icon = itemView.findViewWithTag(R.id.iv_icon);
            high = itemView.findViewById(R.id.tv_high);
            low = itemView.findViewById(R.id.tv_low);
            humidity = itemView.findViewById(R.id.tv_humidity);
            dewPoint = itemView.findViewById(R.id.tv_dew_point);
            condition = itemView.findViewById(R.id.tv_condition);
            container = itemView.findViewById(R.id.layout_relative);
        }
    }
}