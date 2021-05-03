package com.example.OtomationSystem.Classes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsRepository extends CrudRepository<Flights, Long> {
}
