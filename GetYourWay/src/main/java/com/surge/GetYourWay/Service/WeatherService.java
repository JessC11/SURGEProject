package com.surge.GetYourWay.Service;

import com.surge.GetYourWay.Domain.dto.Weather;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.*;

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

}

