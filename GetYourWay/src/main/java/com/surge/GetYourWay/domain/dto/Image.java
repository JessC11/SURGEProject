package com.surge.GetYourWay.domain.dto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Image {

    @Id
    @GeneratedValue
    private int imageId;
    private String image;

    @OneToOne(mappedBy = "image", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Programme programme;

    public Image() {

    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}