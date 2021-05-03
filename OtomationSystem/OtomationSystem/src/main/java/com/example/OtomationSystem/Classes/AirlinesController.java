package com.example.OtomationSystem.Classes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/Airlines")
public class AirlinesController {

    private final AirlinesService airlinesService;

    public AirlinesController(AirlinesService airlinesService) {
        this.airlinesService = airlinesService;
    }

    @GetMapping
    public List<Airlines> getAirlines()
    {
        return airlinesService.getAirlines();
    }
}
