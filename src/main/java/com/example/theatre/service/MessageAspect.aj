package com.example.theatre.service;

import org.springframework.stereotype.Component;

@Component
public aspect MessageAspect {
    pointcut callWithDraw() :
            execution(* TheatreService.getAllSpectacles(..)));

    before() : callWithDraw() {
        System.out.println("Before method");
    }
}

