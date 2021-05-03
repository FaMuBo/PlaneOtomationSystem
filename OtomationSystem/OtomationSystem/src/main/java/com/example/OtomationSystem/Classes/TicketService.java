package com.example.OtomationSystem.Classes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class TicketService {


    public List<Ticket> getTicket() {

        return List.of(
                new Ticket(
                        (long) 1f,
                        12345,
                        200,
                        "ANTALYA HAVALİMANI",
                        "TRABZON HAVALİMANI"
                )
        );
    }
}
