package com.surge.GetYourWay.Service;

import com.surge.GetYourWay.Domain.dao.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    @Autowired
    TripRepository tripRepository;
}
