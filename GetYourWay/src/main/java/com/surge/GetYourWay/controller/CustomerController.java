package com.surge.GetYourWay.controller;
import com.surge.GetYourWay.domain.dto.Customer;
import com.surge.GetYourWay.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Objects;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public HttpStatus loginUser(@RequestBody Customer customerInput){
        Customer customer = customerService.checkExistsOrCreateCustomer(customerInput);
        return HttpStatus.OK;
    }

    @PostMapping("/registration")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<?> createCustomer (@RequestBody Customer newCustomer){
        newCustomer.setPasswordHash(new BCryptPasswordEncoder().encode(newCustomer.getPasswordHash()));
        customerService.createCustomer(newCustomer);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCustomer);
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<?> loginCustomer(@RequestBody Customer customerInput) {
        Customer customer = customerService.checkExists(customerInput);
        if (customer != null) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String passwordInDB = customer.getPasswordHash();
            String passwordProvided = customerInput.getPasswordHash();
            if (passwordEncoder.matches(passwordProvided, passwordInDB)) {
                return ResponseEntity.status(HttpStatus.FOUND).body(customerInput);
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(customerInput);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(customerInput);
    }

}
