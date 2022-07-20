package com.surge.GetYourWay.domain.dao;

import com.surge.GetYourWay.domain.dto.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {



}
