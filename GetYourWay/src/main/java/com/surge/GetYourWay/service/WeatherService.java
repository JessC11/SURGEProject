package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dto.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    public Weather getWeatherInfo(String city) {
        final String uri = "http://api.weatherapi.com/v1/current.json?key=9948850abc994c449c9152057221007&q=" + city + "&aqi=no";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        Weather weather = new Weather();
        JSONObject obj = new JSONObject(result).getJSONObject("current");

        weather.setTempC(obj.getDouble("temp_c"));
        weather.setWindMph(obj.getDouble("wind_mph"));
        weather.setHumidity(obj.getInt("humidity"));
        weather.setFeelsLikeC(obj.getDouble("feelslike_c"));

        System.out.println(weather);
        return weather;
    }

    public List<Weather> getWeatherForecastByDays(String city, int days) {
        ArrayList<Weather> forecast = new ArrayList<>();
        final String uri = "http://api.weatherapi.com/v1/forecast.json?key=9948850abc994c449c9152057221007&q=" + city + "&days=" + days + "&aqi=no&alerts=no;";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        JSONArray objArray = new JSONObject(result).getJSONObject("forecast").getJSONArray("forecastday");

        for (int i = 0; i < objArray.length(); i++) {
            JSONObject obj = objArray.getJSONObject(i).getJSONObject("day");

            Weather weather = new Weather();
            weather.setTempC(obj.getDouble("avgtemp_c"));
            weather.setWindMph(obj.getDouble("maxwind_mph"));
            weather.setHumidity((int)obj.getInt("avghumidity"));
            weather.setFeelsLikeC(obj.getDouble("avgtemp_c"));
            weather.setConditionCode(obj.getJSONObject("condition").getInt("code"));
            forecast.add(weather);
        }

        return forecast;
    }

}

