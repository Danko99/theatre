package com.example.theatre.repository;


import com.example.theatre.model.Spectacle;
import com.example.theatre.model.SpectacleJoin;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface TheatreCrudRepository extends CrudRepository<Spectacle,Integer> {



    @Query("SELECT * " +
            "FROM cinema.theaterhall INNER JOIN cinema.spectacle on spectacle.hall_id=theaterhall.hall_id"
            )
    List<SpectacleJoin> innerJoinSpectacleAndTheatreHallByHallId();

    List<Spectacle> findByNameSpectacle(String nameSpectacle);

}
