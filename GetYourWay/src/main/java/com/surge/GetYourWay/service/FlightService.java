package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.FlightRepository;
import com.surge.GetYourWay.domain.dto.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public Flight getFlightById(int id) {
        return flightRepository.findById(id).get();
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
