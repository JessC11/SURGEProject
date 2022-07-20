package com.surge.GetYourWay.Domain.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Image {

    @Id
    @GeneratedValue
    private int imageId;
    private String image;

//    @OneToMany(mappedBy = "image", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Destination> destinations;

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
