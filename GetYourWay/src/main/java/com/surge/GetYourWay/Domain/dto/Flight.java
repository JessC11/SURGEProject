package com.surge.GetYourWay.Domain.dto;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private int flightId;

    private String origin;

    private LocalDateTime departTime;

    private LocalDateTime arriveTime;

    @OneToOne(mappedBy = "flight", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Journey journey;

    @OneToOne
    @JoinColumn(name = "destinationId")
    private Destination destination;

    public Flight() {
    }

    public int getFlightId() {
        return flightId;
    }

    public String getOrigin() {
        return origin;
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

    public void setDepartTime(LocalDateTime departTime) {
        this.departTime = departTime;
    }

    public void setArriveTime(LocalDateTime arriveTime) {
        this.arriveTime = arriveTime;
    }
}
