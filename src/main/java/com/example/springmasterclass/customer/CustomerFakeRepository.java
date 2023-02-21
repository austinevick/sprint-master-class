package com.example.springmasterclass.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1, "James Bond", "password123", "email@gmail.com"),
                new Customer(2, "John Simon", "password01", "john@gmail.com")
        );
    }
}
