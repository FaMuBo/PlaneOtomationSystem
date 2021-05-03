package com.example.OtomationSystem.Classes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class RoutesService {


    public List<Routes> getRoutes() {
        return List.of(
                new Routes(
                        (long)1F,
                        "TK21",
                        "Ankara"
                )
        );
    }
}
