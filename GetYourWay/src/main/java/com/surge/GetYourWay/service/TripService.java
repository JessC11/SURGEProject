package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.TripRepository;
import com.surge.GetYourWay.domain.dao.viewModelRepository.TripViewModelRepository;
import com.surge.GetYourWay.domain.dto.Customer;
import com.surge.GetYourWay.domain.dto.Trip;
import com.surge.GetYourWay.viewModel.TripViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    @Autowired
    TripRepository tripRepository;

    @Autowired
    TripViewModelRepository tripViewModelRepository;

    public List<Trip> getAllTripsByCustomerId(int customerId) {
        return tripRepository.getAllTripsByCustomerId(customerId);
    }

    public List<TripViewModel> getAllTripsByCustomerId2(int customerId){
        return tripViewModelRepository.getAllTrips(customerId);
    }

    public Trip getTripById(int tripId) {
        return tripRepository.findById(tripId).get();
    }
}
