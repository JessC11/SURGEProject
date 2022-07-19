package com.surge.GetYourWay.Domain.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Trip {

    @Id
    @GeneratedValue

    private int tripId;
    private int customerId;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
