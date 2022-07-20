package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JourneyService {

    @Autowired
    JourneyRepository journeyRepository;
}
