package com.example.OtomationSystem.Classes;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AirportsService {


    public List<Airports> getAirports() {
        return List.of(
                new Airports(
                        2L,
                        "Sabiha Gökçen"
                )
        );

    }
}
