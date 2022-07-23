package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.DestinationRepository;
import com.surge.GetYourWay.domain.dto.Destination;
import com.surge.GetYourWay.domain.dto.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinationService {

    @Autowired
    DestinationRepository destinationRepository;

    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    public Destination getDestinationById(int id) {
        return destinationRepository.findById(id).get();
    }

    public Destination createDestination(Destination destination) {
        return destinationRepository.save(destination);
    }
}
