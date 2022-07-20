package com.surge.GetYourWay.domain.dto;

import javax.persistence.*;

@Entity
public class Destination {

    @Id
    @GeneratedValue
    private int destinationId;
    private String destination;
    private String info;

    @OneToOne(mappedBy = "destination")
    private Flight flight;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "programmeId")
    private Programme programme;

    public Destination() {

    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}