package com.example.calendar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    
    @Id
    private String country_code;
    @Column(nullable = false)
    private String name;

    // getters and setters
    public String getCountryCode() {
        return country_code;
    }
    public void setCountryCode(String country_code) {
        this.country_code = country_code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
