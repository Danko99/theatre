package com.example.theatre.repository;

import com.example.theatre.model.Spectacle;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.generated.Tables.SPECTACLE;
import static org.jooq.generated.Tables.THEATERHALL;

@Repository
public class TheatreRepository {

    @Autowired
    private DSLContext jooq;

    public List<Spectacle> getAllSpectacles() {
        Result<Record> fetch = jooq.select()
                .from(SPECTACLE)
                .innerJoin(THEATERHALL)
                .on(SPECTACLE.HALL_ID.eq(THEATERHALL.HALL_ID)).fetch();

        List<Spectacle> spectacles = new ArrayList<>();
        for (Record record : fetch) {
            spectacles.add(new Spectacle(record.get(SPECTACLE.NAME_SPECTACLE), record.get(THEATERHALL.NAME_HALL)));
        }

        return spectacles;
    }

}
