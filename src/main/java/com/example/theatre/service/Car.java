package com.example.theatre.service;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public String getName() {
        return "car";
    }
}
