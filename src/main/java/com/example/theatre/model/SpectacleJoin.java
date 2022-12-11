package com.example.theatre.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

public class SpectacleJoin implements Serializable {
    @Column("name_spectacle")
    private String nameSpectacle; 
    @Column("name_hall")
    private String nameHall;

    public SpectacleJoin() {
    }

    public SpectacleJoin(String nameSpectacle, String nameHall) {
        this.nameSpectacle = nameSpectacle;
        this.nameHall = nameHall;
    }

    public String getNameSpectacle() {
        return nameSpectacle;
    }

    public void setNameSpectacle(String nameSpectacle) {
        this.nameSpectacle = nameSpectacle;
    }

    public String getNameHall() {
        return nameHall;
    }

    public void setNameHall(String nameHall) {
        this.nameHall = nameHall;
    }

    @Override
    public String toString() {
        return "Spectacle{" +
                "nameSpectacle='" + nameSpectacle + '\'' +
                ", nameHall='" + nameHall + '\'' +
                '}';
    }
}
