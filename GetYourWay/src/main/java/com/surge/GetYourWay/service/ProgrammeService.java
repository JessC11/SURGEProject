package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.DestinationRepository;
import com.surge.GetYourWay.domain.dao.ImageRepository;
import com.surge.GetYourWay.domain.dao.ProgrammeRepository;
import com.surge.GetYourWay.domain.dto.Destination;
import com.surge.GetYourWay.domain.dto.Flight;
import com.surge.GetYourWay.domain.dto.Image;
import com.surge.GetYourWay.domain.dto.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammeService {

    @Autowired
    ProgrammeRepository programmeRepository;

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    DestinationRepository destinationRepository;

    public Programme createProgramme(Programme programme) {

        // Create a programme object

        Programme newProgramme = new Programme();
        newProgramme.setProgramme("example");

        // If they provide a new image then create this using the imageRepository.createImage(image) method

        // .... Emma defined this code

        // If they provide an image ID then do this;

        Image image = imageRepository.getReferenceById(1);

        newProgramme.setImage(image);

        // Same again with destination ... allow them to create new destination(s) and assign these to the new programme

        // ...

        // OR allow them to assign an existing destination

        Destination destination = destinationRepository.getReferenceById(1);

        List<Destination> destinations = new ArrayList<>();
        destinations.add(destination);

        // Assign the destinations that have been created to a list and add them to the programme

        newProgramme.setDestinations(destinations);

        // Save the new programme - this will create the programme AND the links between the image and destination objects

        return programmeRepository.save(newProgramme);
    }

    public List<Programme> getAllProgrammes() {
        List<Programme> programmes = programmeRepository.findAll();
        return programmes;
    }
}
