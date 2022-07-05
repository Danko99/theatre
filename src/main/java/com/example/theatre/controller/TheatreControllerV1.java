package com.example.theatre.controller;

import com.example.theatre.model.Spectacle;
import com.example.theatre.service.TheatreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheatreControllerV1 {
    TheatreService theatreService;

    public TheatreControllerV1(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping(value = "/spectacles")
    public List<Spectacle> getAllSpectacles(){
        return theatreService.getAllSpectacles();
    }
}
