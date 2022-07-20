package com.surge.GetYourWay.domain.dto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Journey {

    @Id
    @GeneratedValue
    private int journeyId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name="customerId")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="flightId")
    private Flight flight;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="tripId")
    private Trip trip;

    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

}
