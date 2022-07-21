package com.surge.GetYourWay.domain.dao;

import com.surge.GetYourWay.domain.dto.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}
