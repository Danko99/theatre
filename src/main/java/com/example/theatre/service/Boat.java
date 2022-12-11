package com.example.theatre.service;

import org.springframework.stereotype.Component;

@Component
public class Boat implements Vehicle {
    @Override
    public String getName() {
        return "boat";
    }
}
