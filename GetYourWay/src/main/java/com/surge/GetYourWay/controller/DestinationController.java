package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.domain.dto.Destination;
import com.surge.GetYourWay.domain.dto.NewDestination;
import com.surge.GetYourWay.domain.dto.Programme;
import com.surge.GetYourWay.domain.dto.Weather;
import com.surge.GetYourWay.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class DestinationController {

    @Autowired
    DestinationService destinationService;

    @Autowired
    NewDestinationService NewDestinationService;

    @Autowired
    WeatherService weatherService;

    @Autowired
    ProgrammeService programmeService;

    @Autowired
    ImageService imageService;

    @GetMapping("/weather/{city}")
    public Weather getWeather(@PathVariable String city) {
        return weatherService.getWeatherInfo(city);
    }

    @GetMapping("/forecast/{city}")
    public List<Weather> getWeatherFuture(@PathVariable String city) {
        return weatherService.getWeatherForecastByDays(city, 4);
    }

    @GetMapping("/destination")
    public List<Destination> getDestinations() {
        return destinationService.getAllDestinations();
    }

    @GetMapping("/destination/{id}")
    public Destination getDestination(@PathVariable int id) {
        return destinationService.getDestinationById(id);
    }

    @PostMapping("/newdestination")
    public HttpStatus createDestination(@RequestBody NewDestination destination) {
        Destination newDestination = NewDestinationService.createDestination(destination);
        if (newDestination != null) {
            return HttpStatus.CREATED;
        }
        return HttpStatus.BAD_REQUEST;
    }
}
