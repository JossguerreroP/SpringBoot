package main.java.com.example.SpringBoot.services;

import main.java.com.example.SpringBoot.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
