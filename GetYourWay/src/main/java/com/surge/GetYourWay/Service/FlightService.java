package com.surge.GetYourWay.Service;

import com.surge.GetYourWay.Domain.dao.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;
}