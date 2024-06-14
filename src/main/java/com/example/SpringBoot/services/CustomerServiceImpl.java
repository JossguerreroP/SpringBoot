package main.java.com.example.SpringBoot.services;

import main.java.com.example.SpringBoot.web.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder().
                id(UUID.randomUUID())
                .Name("hello")
                .build();
    }
}
