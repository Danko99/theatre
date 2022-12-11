package com.example.theatre.model;

import liquibase.pro.packaged.A;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Table(value = "cinema\".\"spectacle")
public class Spectacle implements Serializable {

    @Id
    @Column("spectacle_id")
    private Integer id;
    @Column("name_spectacle")
    private String nameSpectacle;
    @Column("hall_id")
    private Integer hallId;

    public Spectacle() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSpectacle() {
        return nameSpectacle;
    }

    public void setNameSpectacle(String nameSpectacle) {
        this.nameSpectacle = nameSpectacle;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }

    @Override
    public String toString() {
        return "Spectacle{" +
                "id=" + id +
                ", nameSpectacle='" + nameSpectacle + '\'' +
                ", hallId=" + hallId +
                '}';
    }
}
