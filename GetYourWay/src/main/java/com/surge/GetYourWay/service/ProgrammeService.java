package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.ProgrammeRepository;
import com.surge.GetYourWay.domain.dto.Flight;
import com.surge.GetYourWay.domain.dto.Image;
import com.surge.GetYourWay.domain.dto.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammeService {

    @Autowired
    ProgrammeRepository programmeRepository;

    public Programme createProgramme(Programme programme) {
        Programme newProgramme = new Programme();
        newProgramme.setProgramme("example");
        Image image = new Image();
        image.setImage("example");
        newProgramme.setImage(image);
        return programmeRepository.save(newProgramme);
    }

    public List<Programme> getAllProgrammes() {
        List<Programme> programmes = programmeRepository.findAll();
        return programmes;
    }
}
