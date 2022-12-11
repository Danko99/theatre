package com.example.theatre.model;

import javax.annotation.PostConstruct;

public interface Pet {
    public String getName();

    @PostConstruct
    default void construct(){
        System.out.println("I am a pet");
    }
}
