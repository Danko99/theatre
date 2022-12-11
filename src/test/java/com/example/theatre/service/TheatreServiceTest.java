package com.example.theatre.service;

import com.example.theatre.repository.TheatreRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TheatreServiceTest {
    TheatreService theatreService;

    @Mock
    TheatreRepository theatreRepository;


//    @BeforeEach
//    public void init() {
//        theatreService = new TheatreService(theatreRepository, theatreCrudRepository);
//    }


    @Test
    void getAllSpectacles() {
//        when(theatreRepository.getAllSpectacles()).thenReturn(new ArrayList<>());
//
//        theatreService.getAllSpectacles();

    }
}
