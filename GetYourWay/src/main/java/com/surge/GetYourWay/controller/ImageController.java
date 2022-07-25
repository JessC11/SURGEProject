package com.surge.GetYourWay.controller;

import com.surge.GetYourWay.domain.dto.Image;
import com.surge.GetYourWay.domain.dto.Programme;
import com.surge.GetYourWay.service.ImageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @Autowired
    ImageService imageService;

    @PostMapping("/image")
    public HttpStatus createImage(@RequestBody Image image){
        Image newImage = imageService.createImage(image);
        if(newImage != null) {
            return HttpStatus.CREATED;
        }
        return HttpStatus.BAD_REQUEST;
    }
}
