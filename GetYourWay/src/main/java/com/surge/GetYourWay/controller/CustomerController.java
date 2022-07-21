package com.surge.GetYourWay.controller;
import com.surge.GetYourWay.domain.dto.Customer;
import com.surge.GetYourWay.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public HttpStatus loginUser(@RequestBody Customer customerInput){
        Customer customer = customerService.checkExistsOrCreateCustomer(customerInput);
        return HttpStatus.OK;
    }

}
