package com.surge.GetYourWay.domain.dao;

import com.surge.GetYourWay.domain.dto.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Integer> {

    @Query(value =  "select flight.origin, flight.depart_time, flight.arrive_time, destination.destination, programme.programme from trip\n" +
                    "join journey on trip.trip_id = journey.trip_id\n" +
                    "join flight on journey.flight_id = flight.flight_id\n" +
                    "join destination on flight.destination_id = destination.destination_id\n" +
                    "join programme on destination.programme_id = programme.programme_id\n" +
                    "where trip.customer_id = ?1;", nativeQuery = true)
    List<Trip> getAllTripsByCustomerId(int customerId);
}
