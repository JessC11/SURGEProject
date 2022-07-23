package com.surge.GetYourWay.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Programme {

    @Id
    @GeneratedValue
    private int programmeId;
    private String programme;

    @OneToMany(mappedBy = "programme", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Destination> destinations;

    @OneToOne
    @JoinColumn(name="imageId")
    private Image image;


    public Programme() {

    }

    public int getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(int programmeId) {
        this.programmeId = programmeId;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}