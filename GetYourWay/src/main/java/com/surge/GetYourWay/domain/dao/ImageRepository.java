package com.surge.GetYourWay.domain.dao;

import com.surge.GetYourWay.domain.dto.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
}
