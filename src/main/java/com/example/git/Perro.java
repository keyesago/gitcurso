package com.example.git;

public class Perro {
    private String raza;
    private String color;
    private int años;

    public Perro(String raza, String color, int años) {
        this.raza = raza;
        this.color = color;
        this.años = años;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }
}
