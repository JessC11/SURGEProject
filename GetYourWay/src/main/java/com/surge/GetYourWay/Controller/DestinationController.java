package com.surge.GetYourWay.Controller;

import com.surge.GetYourWay.Service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

    @Autowired
    DestinationService destinationService;
}
