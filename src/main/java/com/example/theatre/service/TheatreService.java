package com.example.theatre.service;

import com.example.theatre.repository.TheatreRepository;
import org.jooq.Record1;
import org.jooq.Result;
import org.springframework.stereotype.Service;

@Service
public class TheatreService {
    private TheatreRepository theatreRepository;

    public TheatreService(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }


    public Result<Record1<String>> getResult(){
        return theatreRepository.getJoinedTables();
    }

}
