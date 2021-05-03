package com.example.OtomationSystem.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Routes {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String endingposition;

    public Routes() {
    }

    public Routes(Long id, String name, String endingposition) {
        this.id = id;
        this.name = name;
        this.endingposition = endingposition;
    }

    public Routes(String name, String endingposition) {
        this.name = name;
        this.endingposition = endingposition;
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

    public String getEndingposition() {
        return endingposition;
    }

    public void setEndingposition(String endingposition) {
        this.endingposition = endingposition;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", endingposition='" + endingposition + '\'' +
                '}';
    }
}