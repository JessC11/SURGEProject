package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.domain.dto.Flight;
import com.surge.GetYourWay.domain.dto.FlightInfo;
import com.surge.GetYourWay.service.FlightApiService;
import com.surge.GetYourWay.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@CrossOrigin
@RestController
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    FlightApiService flightApiService;

    @GetMapping("/flights/{depart}/{arrive}")
    public List<FlightInfo> getFlights(@PathVariable String depart, @PathVariable String arrive) {
        System.out.println("here");
        return flightApiService.getFlights(depart,arrive);
    }

    @GetMapping("/flight/{id}")
    public Flight getFlight(@PathVariable int id){
        return flightService.getFlightById(id);
    }

    @PostMapping("/flight")
    public HttpStatus createFlight(@RequestBody Flight flight){
        Flight newFlight = flightService.createFlight(flight);
        if(newFlight != null) {
            return HttpStatus.CREATED;
        }
        return HttpStatus.BAD_REQUEST;
    }
}

