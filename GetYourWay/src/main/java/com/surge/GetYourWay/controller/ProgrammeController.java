package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.domain.dto.*;
import com.surge.GetYourWay.service.ProgrammeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.surge.GetYourWay.service.*;

import java.util.List;

@CrossOrigin
@RestController
public class ProgrammeController {

    @Autowired
    ProgrammeService programmeService;

    @Autowired
    NewProgrammeService NewProgrammeService;

    @GetMapping("/programmes")
    public List<Programme> showProgrammes(){
        return programmeService.getAllProgrammes();
    }

    @PostMapping("/newprogramme")
    public HttpStatus createProgramme(@RequestBody NewProgramme programme) {
        Programme newProgramme = NewProgrammeService.createProgramme(programme);
        if (newProgramme != null) {
            return HttpStatus.CREATED;
        }
        return HttpStatus.BAD_REQUEST;
    }
}
