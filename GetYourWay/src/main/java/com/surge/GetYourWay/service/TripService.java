package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    @Autowired
    TripRepository tripRepository;
}
