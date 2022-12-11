package com.example.theatre.service;

import com.example.theatre.model.Spectacle;
import com.example.theatre.repository.TheatreCrudRepository;
import com.example.theatre.repository.TheatreRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {
    private final TheatreRepository theatreRepository;
    private final TheatreCrudRepository theatreCrudRepository;

    public TheatreService(TheatreRepository theatreRepository, TheatreCrudRepository theatreCrudRepository) {
        this.theatreRepository = theatreRepository;
        this.theatreCrudRepository = theatreCrudRepository;
    }

    public void getAllSpectacles() {
        //theatreRepository.getAllSpectacles();
//        List<Spectacle> spectacles = new ArrayList<>();
//        theatreCrudRepository.findAll().forEach(spectacles::add);
//        System.out.println(spectacles);

        System.out.println(theatreCrudRepository.innerJoinSpectacleAndTheatreHallByHallId());
    }

    public List<Spectacle> getSpectacleByName(String spectacleName) {
        return theatreCrudRepository.findByNameSpectacle(spectacleName);
    }

//    public void addSpectacle(String spectacleName) {
//        return theatreCrudRepository.findByNameSpectacle(spectacleName);
//    }
}
