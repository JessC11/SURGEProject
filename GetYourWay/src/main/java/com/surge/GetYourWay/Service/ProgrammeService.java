package com.surge.GetYourWay.Service;

import com.surge.GetYourWay.Domain.dao.ProgrammeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgrammeService {

    @Autowired
    ProgrammeRepository programmeRepository;
}
