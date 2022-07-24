package com.surge.GetYourWay.domain.dao.viewModelRepository;

import com.surge.GetYourWay.domain.dto.Trip;
import com.surge.GetYourWay.viewModel.TripViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public class TripViewModelRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<TripViewModel> getAllTrips(int customerId){
        return jdbcTemplate.query(  "select flight.origin, flight.depart_time, flight.arrive_time, destination.destination, programme.programme from trip\n" +
                                        "join journey on trip.trip_id = journey.trip_id\n" +
                                        "join flight on journey.flight_id = flight.flight_id\n" +
                                        "join destination on flight.destination_id = destination.destination_id\n" +
                                        "join programme on destination.programme_id = programme.programme_id\n" +
                                        "where trip.customer_id = " + customerId + ";", new TripViewModelRowMapper());
    }

    private class TripViewModelRowMapper implements RowMapper<TripViewModel> {
        @Override
        public TripViewModel mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            TripViewModel tripViewModel = new TripViewModel();
            tripViewModel.setDestination(resultSet.getString("destination"));
            System.out.println(resultSet.getString("depart_time"));
            tripViewModel.setDepartTime(resultSet.getDate("depart_time"));
//            tripViewModel.setArriveTime(Date);
            tripViewModel.setOrigin(resultSet.getString("origin"));
            tripViewModel.setProgramme(resultSet.getString("programme"));
            return tripViewModel;
        }
    }
}
