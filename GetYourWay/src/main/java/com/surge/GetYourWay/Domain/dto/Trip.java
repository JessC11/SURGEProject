package com.surge.GetYourWay.domain.dto;
import javax.persistence.*;
import java.util.List;

@Entity
public class Trip {

    @Id
    @GeneratedValue
    private int tripId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name="customerId")
    private Customer customer;

    @OneToMany(mappedBy = "trip", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Journey> journey;

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

}
