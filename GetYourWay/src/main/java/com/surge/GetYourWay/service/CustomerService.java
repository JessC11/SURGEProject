package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.CustomerRepository;
import com.surge.GetYourWay.domain.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer checkExistsOrCreateCustomer(Customer customerInput) {
        Optional<Customer> optionalCustomer = customerRepository.findByEmail(customerInput.getEmail());
        
        if(optionalCustomer.isEmpty()){
            return customerRepository.save(fillBlankFields(customerInput));
        }

        return optionalCustomer.get();
    }

    public Customer fillBlankFields(Customer customer){
        if (customer.getFirstName() == null){
            customer.setFirstName("Example");
        };
        if (customer.getLastName() == null){
            customer.setLastName("Lastname");
        };
        if (customer.getPasswordHash() == null){
            customer.setPasswordHash("test password hash");
        };
        return customer;
    }
}
