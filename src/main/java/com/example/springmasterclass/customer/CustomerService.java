package com.example.springmasterclass.customer;

import com.example.springmasterclass.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService( CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    Customer getCustomer(Integer id) {
        return customerRepository.findById(id).
               orElseThrow(() -> new NotFoundException("customer with id " + id + " not found"));
    }
}
