
package com.example.android.darkskyweather.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("precipIntensity")
    @Expose
    private Integer precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private Integer precipProbability;
    @SerializedName("precipIntensityError")
    @Expose
    private Float precipIntensityError;
    @SerializedName("precipType")
    @Expose
    private String precipType;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Integer precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Integer getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Integer precipProbability) {
        this.precipProbability = precipProbability;
    }

    public Float getPrecipIntensityError() {
        return precipIntensityError;
    }

    public void setPrecipIntensityError(Float precipIntensityError) {
        this.precipIntensityError = precipIntensityError;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

}
