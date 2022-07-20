package com.surge.GetYourWay.Service;

import com.surge.GetYourWay.Domain.dao.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {

    @Autowired
    DestinationRepository destinationRepository;
}
