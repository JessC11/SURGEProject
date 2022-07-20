package com.surge.GetYourWay.Domain.dto;

import javax.persistence.*;

public class Trip {

    @Id
    @GeneratedValue
    private int tripId;
    private int customerId;

//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
//    @JoinColumn(name="tripId")
//    private Journey journey;

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
