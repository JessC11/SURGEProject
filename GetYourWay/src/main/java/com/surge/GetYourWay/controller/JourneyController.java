package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JourneyController {

    @Autowired
    JourneyService journeyService;
}
