package com.surge.GetYourWay.Domain.dto;

import java.time.LocalDateTime;

public class Flight {

    private int flightId;

    private String origin;

    private String destinationId;

    private LocalDateTime departTime;

    private LocalDateTime arriveTime;

    public Flight() {
    }

    public int getFlightId() {
        return flightId;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public LocalDateTime getDepartTime() {
        return departTime;
    }

    public LocalDateTime getArriveTime() {
        return arriveTime;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public void setDepartTime(LocalDateTime departTime) {
        this.departTime = departTime;
    }

    public void setArriveTime(LocalDateTime arriveTime) {
        this.arriveTime = arriveTime;
    }
}
