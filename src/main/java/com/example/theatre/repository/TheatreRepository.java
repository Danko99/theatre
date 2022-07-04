package com.example.theatre.repository;

import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static org.jooq.generated.Tables.DEPARTMENT;
import static org.jooq.generated.Tables.PROGRAM;

@Repository
public class TheatreRepository {

    @Autowired
    private DSLContext jooq;

    public Result<Record1<String>> getJoinedTables() {


        Result<Record1<String>> fetch = jooq.select(DEPARTMENT.NAME_DEPARTMENT)
                .from(DEPARTMENT)
                .innerJoin(PROGRAM)
                .on(PROGRAM.DEPARTMENT_ID.eq(DEPARTMENT.DEPARTMENT_ID))
                .fetch();

        return fetch;

    }

}
