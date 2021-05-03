package com.example.OtomationSystem.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flights {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer quota;

    public Flights() {
    }

    public Flights(Long id, Integer quota) {
        this.id = id;
        this.quota = quota;
    }

    public Flights(Integer quota) {
        this.quota = quota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", quota=" + quota +
                '}';
    }
}
