package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.ProgrammeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgrammeService {

    @Autowired
    ProgrammeRepository programmeRepository;
}
