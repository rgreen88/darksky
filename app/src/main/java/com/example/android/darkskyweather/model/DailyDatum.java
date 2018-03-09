
package com.example.android.darkskyweather.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DailyDatum {

    @SerializedName("time")
    @Expose
    private Double time;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("sunriseTime")
    @Expose
    private Double sunriseTime;
    @SerializedName("sunsetTime")
    @Expose
    private Double sunsetTime;
    @SerializedName("moonPhase")
    @Expose
    private Float moonPhase;
    @SerializedName("precipIntensity")
    @Expose
    private Float precipIntensity;
    @SerializedName("precipIntensityMax")
    @Expose
    private Float precipIntensityMax;
    @SerializedName("precipIntensityMaxTime")
    @Expose
    private Double precipIntensityMaxTime;
    @SerializedName("precipProbability")
    @Expose
    private Float precipProbability;
    @SerializedName("precipType")
    @Expose
    private String precipType;
    @SerializedName("temperatureHigh")
    @Expose
    private Float temperatureHigh;
    @SerializedName("temperatureHighTime")
    @Expose
    private Double temperatureHighTime;
    @SerializedName("temperatureLow")
    @Expose
    private Float temperatureLow;
    @SerializedName("temperatureLowTime")
    @Expose
    private Double temperatureLowTime;
    @SerializedName("apparentTemperatureHigh")
    @Expose
    private Float apparentTemperatureHigh;
    @SerializedName("apparentTemperatureHighTime")
    @Expose
    private Double apparentTemperatureHighTime;
    @SerializedName("apparentTemperatureLow")
    @Expose
    private Float apparentTemperatureLow;
    @SerializedName("apparentTemperatureLowTime")
    @Expose
    private Double apparentTemperatureLowTime;
    @SerializedName("dewPoint")
    @Expose
    private Float dewPoint;
    @SerializedName("humidity")
    @Expose
    private Float humidity;
    @SerializedName("pressure")
    @Expose
    private Float pressure;
    @SerializedName("windSpeed")
    @Expose
    private Float windSpeed;
    @SerializedName("windGust")
    @Expose
    private Float windGust;
    @SerializedName("windGustTime")
    @Expose
    private Double windGustTime;
    @SerializedName("windBearing")
    @Expose
    private Double windBearing;
    @SerializedName("cloudCover")
    @Expose
    private Float cloudCover;
    @SerializedName("uvIndex")
    @Expose
    private Double uvIndex;
    @SerializedName("uvIndexTime")
    @Expose
    private Double uvIndexTime;
    @SerializedName("visibility")
    @Expose
    private Double visibility;
    @SerializedName("ozone")
    @Expose
    private Float ozone;
    @SerializedName("temperatureMin")
    @Expose
    private Float temperatureMin;
    @SerializedName("temperatureMinTime")
    @Expose
    private Double temperatureMinTime;
    @SerializedName("temperatureMax")
    @Expose
    private Float temperatureMax;
    @SerializedName("temperatureMaxTime")
    @Expose
    private Double temperatureMaxTime;
    @SerializedName("apparentTemperatureMin")
    @Expose
    private Float apparentTemperatureMin;
    @SerializedName("apparentTemperatureMinTime")
    @Expose
    private Double apparentTemperatureMinTime;
    @SerializedName("apparentTemperatureMax")
    @Expose
    private Float apparentTemperatureMax;
    @SerializedName("apparentTemperatureMaxTime")
    @Expose
    private Double apparentTemperatureMaxTime;

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Double getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(Double sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public Double getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(Double sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public Float getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(Float moonPhase) {
        this.moonPhase = moonPhase;
    }

    public Float getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Float precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Float getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    public void setPrecipIntensityMax(Float precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    public Double getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(Double precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    public Float getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Float precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public Float getTemperatureHigh() {
        return temperatureHigh;
    }

    public void setTemperatureHigh(Float temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public Double getTemperatureHighTime() {
        return temperatureHighTime;
    }

    public void setTemperatureHighTime(Double temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    public Float getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(Float temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public Double getTemperatureLowTime() {
        return temperatureLowTime;
    }

    public void setTemperatureLowTime(Double temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    public Float getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(Float apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    public Double getApparentTemperatureHighTime() {
        return apparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime(Double apparentTemperatureHighTime) {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public Float getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    public void setApparentTemperatureLow(Float apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    public Double getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(Double apparentTemperatureLowTime) {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    public Float getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(Float dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Float getWindGust() {
        return windGust;
    }

    public void setWindGust(Float windGust) {
        this.windGust = windGust;
    }

    public Double getWindGustTime() {
        return windGustTime;
    }

    public void setWindGustTime(Double windGustTime) {
        this.windGustTime = windGustTime;
    }

    public Double getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(Double windBearing) {
        this.windBearing = windBearing;
    }

    public Float getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Float cloudCover) {
        this.cloudCover = cloudCover;
    }

    public Double getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Double uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Double getUvIndexTime() {
        return uvIndexTime;
    }

    public void setUvIndexTime(Double uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Float getOzone() {
        return ozone;
    }

    public void setOzone(Float ozone) {
        this.ozone = ozone;
    }

    public Float getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(Float temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public Double getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public void setTemperatureMinTime(Double temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    public Float getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(Float temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public Double getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public void setTemperatureMaxTime(Double temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    public Float getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public void setApparentTemperatureMin(Float apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public Double getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(Double apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public Float getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public void setApparentTemperatureMax(Float apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    public Double getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(Double apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

}
