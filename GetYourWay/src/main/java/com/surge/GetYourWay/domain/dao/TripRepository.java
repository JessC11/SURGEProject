package com.surge.GetYourWay.domain.dao;

import com.surge.GetYourWay.domain.dto.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {



}
