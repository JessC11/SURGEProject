package com.surge.GetYourWay.Controller;

import com.surge.GetYourWay.Domain.dto.Weather;
import com.surge.GetYourWay.Service.DestinationService;
import com.surge.GetYourWay.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DestinationController {

    @Autowired
    DestinationService destinationService;

    @Autowired
    WeatherService weatherService;

    @GetMapping("/weather")
    public Weather getWeather() {
        return weatherService.getWeatherInfo("Split");
    }

    @GetMapping("/forecast")
    public List<Weather> getWeatherFuture() {
        return weatherService.getWeatherForecastByDays("Split", 4);
    }

}
