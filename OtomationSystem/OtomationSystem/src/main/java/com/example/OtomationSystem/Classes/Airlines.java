package com.example.OtomationSystem.Classes;

import javax.persistence.*;

@Entity
public class Airlines {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)

   private Long id;
    private String name;

    public Airlines() {
    }

    public Airlines(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Airlines(String name) {
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
        return "Airlines{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
