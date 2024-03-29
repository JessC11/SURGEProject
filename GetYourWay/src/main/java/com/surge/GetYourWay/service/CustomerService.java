package com.surge.GetYourWay.service;

import com.surge.GetYourWay.domain.dao.CustomerRepository;
import com.surge.GetYourWay.domain.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements UserDetailsService {

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
        if (customer.getRole() == null){
            customer.setRole("USER");
        };
        return customer;
    }

    public void createCustomer(Customer newCustomer) {
        customerRepository.save(newCustomer);
    }


//    public Customer checkExists(Customer customerInput){
//        Optional<Customer> cust = customerRepository.findByEmail(customerInput.getEmail());
//        if (cust.isEmpty()) {
//            return null;
//        }
//        return cust.get();
//    }

    @Override
    public Customer loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Customer> cust = customerRepository.findByEmail(email);
        if (cust.isEmpty()){
            throw new UsernameNotFoundException(email);
        }
        return cust.get();
    }
}
