package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.ImageRepository;
import com.surge.GetYourWay.domain.dto.Image;
import com.surge.GetYourWay.domain.dto.Programme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public Image createImage(Image image) {
        return imageRepository.save(image);
    }
}
