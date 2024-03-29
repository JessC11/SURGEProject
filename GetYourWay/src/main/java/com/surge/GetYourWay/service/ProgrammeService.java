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

    public List<Programme> getAllProgrammes() {
        List<Programme> programmes = programmeRepository.findAll();
        return programmes;
    }
}
