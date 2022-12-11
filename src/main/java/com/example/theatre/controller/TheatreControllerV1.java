package com.example.theatre.controller;

import com.example.theatre.model.Spectacle;
import com.example.theatre.model.SpectacleJoin;
import com.example.theatre.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TheatreControllerV1 {
    TheatreService theatreService;

    @Autowired
    private KafkaTemplate<String, Spectacle> kafkaTemplate;

    public TheatreControllerV1(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping(value = "/spectacles")
    public List<SpectacleJoin> getAllSpectacles(){
        theatreService.getAllSpectacles();
        return null;
    }

    @GetMapping("/spectacleByName")
    public List<Spectacle> getSpectacleByName(@RequestParam("spectacle_name") String spectacleName){
        return theatreService.getSpectacleByName(spectacleName);
    }

    @PostMapping("/spectacleKafka")
    public void sendOrder(@RequestBody Spectacle spectacle){
        kafkaTemplate.send("msg", spectacle);
    }
}
