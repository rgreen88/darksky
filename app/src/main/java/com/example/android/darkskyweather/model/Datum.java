
package com.example.android.darkskyweather.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("time")
    @Expose
    private Double time;
    @SerializedName("precipIntensity")
    @Expose
    private Double precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private Double precipProbability;
    @SerializedName("precipIntensityError")
    @Expose
    private Float precipIntensityError;
    @SerializedName("precipType")
    @Expose
    private String precipType;

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Double precipProbability) {
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
