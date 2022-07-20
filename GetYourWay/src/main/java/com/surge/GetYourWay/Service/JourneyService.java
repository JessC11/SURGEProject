package com.surge.GetYourWay.Service;

import com.surge.GetYourWay.Domain.dao.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JourneyService {

    @Autowired
    JourneyRepository journeyRepository;
}
