package com.surge.GetYourWay.viewModel;

import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Date;

public class TripViewModel {

    private String origin;
    private Date departTime;
    private Date arriveTime;
    private String destination;
    private String programme;
    private int tripId;

    public TripViewModel() {
    }

    public String getOrigin() {
        return origin;
    }

    public Date getDepartTime() {
        return departTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public String getDestination() {
        return destination;
    }

    public String getProgramme() {
        return programme;
    }

    public int getTripId() {
        return tripId;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDepartTime(Date departTime) {
        this.departTime = departTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }
}
