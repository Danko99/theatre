package com.example.theatre.repository;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

public class TheatreRepository {
    @Autowired
    private DSLContext dslContext;

}
