package com.example.OtomationSystem.Classes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class FlightsService {


    public List<Flights> getFlights() {
        return List.of(
                new Flights(
                        3L,
                        5
                )
        );
    }
}
