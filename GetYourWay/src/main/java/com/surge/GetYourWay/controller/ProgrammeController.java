package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.Service.ProgrammeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgrammeController {

    @Autowired
    ProgrammeService programmeService;
}
