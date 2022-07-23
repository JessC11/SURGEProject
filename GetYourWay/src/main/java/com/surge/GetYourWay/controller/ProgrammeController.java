package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.domain.dto.Flight;
import com.surge.GetYourWay.domain.dto.Programme;
import com.surge.GetYourWay.service.ProgrammeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgrammeController {

    @Autowired
    ProgrammeService programmeService;

    @GetMapping("/programmes")
    public List<Programme> showProgrammes(){
        return programmeService.getAllProgrammes();
    }
    @PostMapping("/programme")
    public HttpStatus createProgramme(@RequestBody Programme programme){
        Programme newProgramme = programmeService.createProgramme(programme);
        if(newProgramme != null) {
            return HttpStatus.CREATED;
        }
        return HttpStatus.BAD_REQUEST;
    }
}
