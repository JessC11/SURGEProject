package com.surge.GetYourWay.domain.dao;

import com.surge.GetYourWay.domain.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {



}