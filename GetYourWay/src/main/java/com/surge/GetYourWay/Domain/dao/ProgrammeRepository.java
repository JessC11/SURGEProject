package com.surge.GetYourWay.Domain.dao;

import com.surge.GetYourWay.Domain.dto.Programme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammeRepository extends JpaRepository<Programme, Integer> {



}
