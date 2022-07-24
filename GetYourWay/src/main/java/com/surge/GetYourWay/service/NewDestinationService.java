package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.DestinationRepository;
import com.surge.GetYourWay.domain.dao.ProgrammeRepository;
import com.surge.GetYourWay.domain.dto.Destination;
import com.surge.GetYourWay.domain.dto.NewDestination;
import com.surge.GetYourWay.domain.dto.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewDestinationService {
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

    public Destination createDestination(NewDestination newdestination) {
        Destination destination = new Destination();
        destination.setDestination(newdestination.getDestination());
        destination.setInfo(newdestination.getInfo());
        int id = newdestination.getProgrammeId();
        Optional<Programme> possibleProgramme = programmeRepository.findById(id);
        Programme p = possibleProgramme.get();
        System.out.println(p.getProgramme());
        destination.setProgramme(p);
        return destinationRepository.save(destination);
    }
}
