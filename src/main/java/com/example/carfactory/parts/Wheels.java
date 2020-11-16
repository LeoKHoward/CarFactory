package com.example.carfactory.parts;

public class Wheels {

    private int pressure;
    private String colour;
    private int diameter;
    private String tread;


    public Wheels(int pressure, String colour, int diameter, String tread) {
        this.pressure = pressure;
        this.colour = colour;
        this.diameter = diameter;
        this.tread = tread;
    }


    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    public String getTread() {
        return tread;
    }

    public void setTread(String tread) {
        this.tread = tread;
    }

    public void inflate(int psi) {
        this.pressure = psi;
    }
}
