package com.surge.GetYourWay.Service;

import com.surge.GetYourWay.Domain.dao.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;
}
