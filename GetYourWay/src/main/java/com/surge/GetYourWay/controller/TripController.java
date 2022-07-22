package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.domain.dto.Trip;
import com.surge.GetYourWay.service.TripService;
import com.surge.GetYourWay.viewModel.TripViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class TripController {

    @Autowired
    TripService tripService;

    @GetMapping("/trips/{customerId}")
    public List<TripViewModel> getAllTrips(@PathVariable int customerId){
        return tripService.getAllTripsByCustomerId2(customerId);
    }

    @GetMapping("/trip/{tripId}")
    public Trip getTrip(@PathVariable int tripId){
        return tripService.getTripById(tripId);
    }
}
