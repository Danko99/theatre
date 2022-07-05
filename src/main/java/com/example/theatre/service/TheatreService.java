package com.example.theatre.service;

import com.example.theatre.model.Spectacle;
import com.example.theatre.repository.TheatreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {
    private TheatreRepository theatreRepository;

    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    public List<Spectacle> getAllSpectacles(){

        return theatreRepository.getAllSpectacles();
    }
}
