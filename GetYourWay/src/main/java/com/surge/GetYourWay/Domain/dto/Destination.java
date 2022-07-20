package com.surge.GetYourWay.Domain.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Destination {

    @Id
    @GeneratedValue
    private int destinationId;
    private String destination;
    private int programmeId;
    private String info;
    private int imageId;

//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "programmeId")
//    private Programme programme

//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
//    JoinColumn(name = "imageId)
//    private Image image;

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

    public int getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(int programmeId) {
        this.programmeId = programmeId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}



