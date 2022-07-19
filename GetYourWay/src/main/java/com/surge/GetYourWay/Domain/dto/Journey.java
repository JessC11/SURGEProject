package com.surge.GetYourWay.Domain.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Journey {

    @Id
    @GeneratedValue
    private int journeyId;
    private int flightId;
    private int tripId;


    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }
}
