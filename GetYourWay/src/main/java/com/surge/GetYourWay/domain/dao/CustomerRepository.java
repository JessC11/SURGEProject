package com.surge.GetYourWay.domain.dao;

import com.surge.GetYourWay.domain.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "select * from customer where email = :email ", nativeQuery = true)
    Optional<Customer> findByEmail(@Param("email") String email);
}