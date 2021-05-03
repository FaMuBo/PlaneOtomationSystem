package com.example.OtomationSystem.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airports {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name;

    public Airports() {
    }

    public Airports(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Airports(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}