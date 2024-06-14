package main.java.com.example.SpringBoot.services;



import main.java.com.example.SpringBoot.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID customerId);
}
