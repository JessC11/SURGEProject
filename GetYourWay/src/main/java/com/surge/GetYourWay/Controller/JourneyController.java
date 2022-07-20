package com.surge.GetYourWay.Controller;

import com.surge.GetYourWay.Service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JourneyController {

    @Autowired
    JourneyService journeyService;
}
