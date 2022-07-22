package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.domain.dto.Flight;
import com.surge.GetYourWay.domain.dto.FlightInfo;
import com.surge.GetYourWay.service.FlightApiService;
import com.surge.GetYourWay.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

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
}
