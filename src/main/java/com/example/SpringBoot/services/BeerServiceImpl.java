package main.java.com.example.SpringBoot.services;

import main.java.com.example.SpringBoot.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Galaxy")
                .beerStyle("Pale Ale")
                .build();
    }
}
