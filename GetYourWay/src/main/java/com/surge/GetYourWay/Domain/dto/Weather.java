package com.surge.GetYourWay.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private double tempC;
    private double windMph;
    private int humidity;
    private double feelsLikeC;

    public Weather() {

    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }

    public double getTempC() {
        return this.tempC;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }

    public double getWindMph() {
        return this.windMph;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setFeelsLikeC(double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public double getFeelsLikeC() {
        return this.feelsLikeC;
    }

    @Override
    public String toString() {
        return "Value{tempC="+tempC+", windMPH="+windMph+", humidity="+humidity+", feelsLikeC="+feelsLikeC+"}";
    }

}
