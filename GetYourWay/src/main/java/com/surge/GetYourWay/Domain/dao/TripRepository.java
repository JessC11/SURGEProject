package com.surge.GetYourWay.Domain.dao;

import com.surge.GetYourWay.Domain.dto.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {



}
