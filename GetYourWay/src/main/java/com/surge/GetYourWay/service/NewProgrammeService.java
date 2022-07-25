package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.DestinationRepository;
import com.surge.GetYourWay.domain.dao.ImageRepository;
import com.surge.GetYourWay.domain.dao.ProgrammeRepository;
import com.surge.GetYourWay.domain.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NewProgrammeService {
    @Autowired
    ProgrammeRepository programmeRepository;

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    DestinationRepository destinationRepository;

    public Programme createProgramme(NewProgramme newprogramme) {
        Programme programme = new Programme();
        Image img = new Image();
        programme.setProgramme(newprogramme.getProgramme());
        img.setImage(newprogramme.getImage());
        imageRepository.save(img);
        programme.setImage(img);
        return programmeRepository.save(programme);
    }
}