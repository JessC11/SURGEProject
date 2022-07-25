package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.TripRepository;
import com.surge.GetYourWay.domain.dao.viewModelRepository.TripViewModelRepository;
import com.surge.GetYourWay.domain.dto.Customer;
import com.surge.GetYourWay.domain.dto.Trip;
import com.surge.GetYourWay.viewModel.TripViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TripService {

    @Autowired
    TripRepository tripRepository;

    @Autowired
    TripViewModelRepository tripViewModelRepository;

    public List<ListTripViewModel> getAllTripsByCustomerId(int customerId){
        return convertTripsForJsonQuery(tripViewModelRepository.getAllTrips(customerId));
    }

    public Trip getTripById(int tripId) {
        return tripRepository.findById(tripId).get();
    }

    // This method converts the data for trips into a list of lists whereby each object in the enclosing list is
    // a trip and each object in the inner list is a flight
    private List<ListTripViewModel> convertTripsForJsonQuery(List<TripViewModel> modelList){

        Map<Integer, ListTripViewModel> dictionary = new HashMap<Integer, ListTripViewModel>();

        for(TripViewModel model : modelList){
            int key = model.getTripId();
            if(!dictionary.containsKey(key)){
                ListTripViewModel value = new ListTripViewModel();
                value.add(model);
                dictionary.put(key, value);
            } else {
                ListTripViewModel value = dictionary.get(key);
                value.add(model);
                dictionary.replace(key, value);
            }
        }

        List<ListTripViewModel> models = new ArrayList<>();

        for(ListTripViewModel tripViewModel : dictionary.values()){
            models.add(tripViewModel);
        }

        return models;
    }

    public class ListTripViewModel{
        private List<TripViewModel> flights;

        public ListTripViewModel() {
            this.flights = new ArrayList<>();
        }

        public List<TripViewModel> getList() {
            return flights;
        }

        public void setList(List<TripViewModel> list) {
            this.flights = list;
        }

        public void add(TripViewModel toAdd){
            flights.add(toAdd);
        }
    }
}
