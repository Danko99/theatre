package com.example.theatre.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "cinema\".\"theaterhall")
public class TheaterHall {

    @Id
    @Column("hall_id")
    private Integer hallId;
    @Column("name_hall")
    private String nameHall;

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    public String getNameHall() {
        return nameHall;
    }

    public void setNameHall(String nameHall) {
        this.nameHall = nameHall;
    }

    @Override
    public String toString() {
        return "TheaterHall{" +
                "hallId=" + hallId +
                ", nameHall='" + nameHall + '\'' +
                '}';
    }
}
