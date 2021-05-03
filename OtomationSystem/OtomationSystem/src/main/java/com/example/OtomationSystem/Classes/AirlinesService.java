package com.example.OtomationSystem.Classes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AirlinesService {


    public List<Airlines> getAirlines() {

        return List.of(
                new Airlines(
                        1L,
                        "TürkHavaYolları"
                )
        );
    }

}