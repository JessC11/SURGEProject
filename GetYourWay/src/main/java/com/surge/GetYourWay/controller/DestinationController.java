package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

    @Autowired
    DestinationService destinationService;
}
