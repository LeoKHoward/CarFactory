package com.example.carfactory.parts;

public class Engine {

    private int mileage;
    private String fuelType;
    private String transmissionType;
    private int cylinders;
    private boolean engineTurnedOn;


    public Engine(int mileage, String fuelType, String transmissionType, int cylinders) {
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.cylinders = cylinders;
        this.setEngineTurnedOn(false);
    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }


    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public boolean isEngineTurnedOn() {
        return this.engineTurnedOn;
    }

    public void setEngineTurnedOn(boolean newState) {
        this.engineTurnedOn = newState;
    }


}
