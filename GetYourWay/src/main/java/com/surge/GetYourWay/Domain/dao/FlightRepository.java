package com.surge.GetYourWay.Domain.dao;

import com.surge.GetYourWay.Domain.dto.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {



}
