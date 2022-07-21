package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.domain.dto.Flight;
import com.surge.GetYourWay.domain.dto.FlightInfo;
import com.surge.GetYourWay.service.FlightApiService;
import com.surge.GetYourWay.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    FlightApiService flightApiService;

    @GetMapping("/flights")
    public List<FlightInfo> getFlights() {
        return flightApiService.getFlights("MAN","PSA");
    }
}
