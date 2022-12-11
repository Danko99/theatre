package com.example.theatre.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Dog implements Pet {

    public Dog() {
    }

    public Dog(String name, String color) {
        this.name = name;
    }

    public String name = "Samba";


    @Override
    public String getName() {
        return name;
    }
}
