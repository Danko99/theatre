package com.example.theatre.repository;

import com.example.theatre.model.SpectacleJoin;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
public class TheatreRepository {

    @Autowired
    TransactionTemplate transactionTemplate;

    @Autowired
    private DSLContext jooq;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

//    public List<Spectacle> getAllSpectacles() {
//        Result<Record> fetch = jooq.select()
//                .from(SPECTACLE)
//                .innerJoin(THEATERHALL)
//                .on(SPECTACLE.HALL_ID.eq(THEATERHALL.HALL_ID)).fetch();
//
//        List<Spectacle> spectacles = new ArrayList<>();
//        for (Record record : fetch) {
//            spectacles.add(new Spectacle(record.get(SPECTACLE.NAME_SPECTACLE), record.get(THEATERHALL.NAME_HALL)));
//        }
//
//        return spectacles;
//    }


    public void getAllSpectacles() {
//            Result<Record> fetch = jooq.select()
//                    .from(SPECTACLE)
//                    .innerJoin(THEATERHALL)
//                    .on(THEATERHALL.HALL_ID.eq(SPECTACLE.HALL_ID)).fetch();
//
//
//            System.out.println(fetch);
        Connection connection =null;
        try {
            connection = dataSource.getConnection();
        }
        catch (Exception e){

        }

        System.out.println(connection);

        RowMapper<SpectacleJoin> spectacleRowMapper = (r, i) -> {
            SpectacleJoin spectacle = new SpectacleJoin();
            spectacle.setNameSpectacle(r.getString("name_spectacle"));
            spectacle.setNameHall(r.getString("name_hall"));
            return spectacle;
        };

        List<SpectacleJoin> query = jdbcTemplate.query("SELECT * FROM cinema.spectacle INNER JOIN cinema.theaterhall on cinema.theaterhall.hall_id=cinema.spectacle.hall_id", spectacleRowMapper);
        System.out.println(query);
    }


    public static void main(String[] args) {
        Set<SpectacleJoin> spectacleSet = new HashSet<>();
        spectacleSet.add(new SpectacleJoin());


    }


}
