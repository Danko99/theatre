package com.example.theatre.model;

import java.io.Serializable;

public class Spectacle implements Serializable {
    private String nameSpectacle;
    private String nameHall;

    public Spectacle() {
    }

    public Spectacle(String nameSpectacle, String nameHall) {
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
