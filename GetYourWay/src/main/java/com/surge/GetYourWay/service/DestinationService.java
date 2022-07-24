package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.DestinationRepository;
import com.surge.GetYourWay.domain.dao.ProgrammeRepository;
import com.surge.GetYourWay.domain.dto.Destination;
import com.surge.GetYourWay.domain.dto.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinationService {

    @Autowired
    DestinationRepository destinationRepository;

    @Autowired
    ProgrammeRepository programmeRepository;

    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    public Destination getDestinationById(int id) {
        return destinationRepository.findById(id).get();
    }

    public Destination createDestination(Destination destination, int programmeId) {

        //Create a destination object
        Destination newDestination = new Destination();
        newDestination.setDestination(destination.getDestination());

        //If they provide a programme id then do this:
        Programme programme = programmeRepository.getReferenceById(programmeId);
        newDestination.setProgramme(programme);

        // save the new destination, this will also create the programme

        return destinationRepository.save(newDestination);
    }

}
