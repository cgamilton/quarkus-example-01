package com.cgamilton.example01.producer.model;

import java.time.LocalDateTime;

public class OrderService {
    private String name;
    private String lastName;
    private LocalDateTime date;
    private String osNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getOsNumber() {
        return osNumber;
    }

    public void setOsNumber(String osNumber) {
        this.osNumber = osNumber;
    }

}
