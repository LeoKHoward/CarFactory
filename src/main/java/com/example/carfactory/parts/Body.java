package com.example.carfactory.parts;

public class Body {

    private String colour;
    private int seats;
    private boolean cruiseControl;


    public Body(String colour, int seats, boolean cruiseControl) {
        this.colour = colour;
        this.seats = seats;
        this.cruiseControl = cruiseControl;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }


    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }


}
