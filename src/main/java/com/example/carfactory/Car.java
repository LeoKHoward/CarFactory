package com.example.carfactory;

import com.example.carfactory.parts.*;

public class Car {

    private String colour;
    private String make;
    private double litre;
    private int topSpeed;
    private Engine engine;
    private Body body;
    private Wheels[] wheels;
    private Chassis chassis;
    private ExtraFeatures extraFeatures;
    private Door leftDoor;
    private Door rightDoor;

    public Car(String colour, String make, double litre, int topSpeed, Engine engine, Body body, Wheels[] wheels, Chassis chassis,
               ExtraFeatures extraFeatures) {
        this.colour = colour;
        this.make = make;
        this.litre = litre;
        this.topSpeed = topSpeed;
        this.engine = engine;
        this.body = body;
        this.wheels = wheels;
        this.chassis = chassis;
        this.extraFeatures = extraFeatures;
        this.leftDoor = new Door();
        this.rightDoor = new Door();

    }


    public boolean wheelsApproved() {

        boolean success = true;

        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i].getPressure() < 32) {
                System.out.println("Wheel # " + (i + 1) + " PSI is too low!");
                success = false;
            }
            if (wheels[i].getColour().isEmpty()) {
                System.out.println("Wheel # " + (i + 1) + " colour has not been determined!");
                success = false;
            }
            if (wheels[i].getDiameter() < 30) {
                System.out.println("Wheel # " + (i + 1) + " diameter (" + wheels[i].getDiameter() +
                        ") is less than minimum amount!");
                success = false;
            }
            if (wheels[i].getTread().isEmpty()) {
                System.out.println("Wheel # " + (i + 1) + " tread has not been determined!");
                success = false;
            }

        }
        return success;
    }

    public boolean bodyApproved() {

        boolean success = true;

        if (body.getSeats() < 2) {
            success = false;
        }

        return success;
    }

    public boolean chassisApproved() {

        boolean success = true;

        if (chassis.getSuspension().isEmpty() || chassis.getAxle().isEmpty()) {
            success = false;
        }

        return success;
    }

    public boolean engineApproved() {

        boolean success = true;

        if (engine.getMileage() > 1000) {
            System.out.println("Why does this car have " + engine.getMileage() + " miles on the clock?");
            success = false;
        }
        if (engine.getFuelType().isEmpty()) {
            System.out.println("Fuel type has not been determined!");
            success = false;
        }
        if (engine.getTransmissionType().isEmpty()) {
            System.out.println("Transmission type has not been determined!");
            success = false;
        }
        if (engine.getCylinders() < 4) {
            System.out.println("Number of cylinders (" + engine.getCylinders() + ") is less than minimum amount!");
            success = false;

        }

        return success;
    }

    public boolean extraFeaturesApproved() {

        boolean success = true;

        if (!extraFeatures.isHasHorn()) {
            System.out.println("All cars must have horns fitted for safety reasons!");
            success = false;
        }
        if (extraFeatures.getLightsType().isEmpty()) {
            System.out.println("All cars must be fitted with lights for safety reasons!");
            success = false;
        }

        return success;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Wheels[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheels[] wheels) {
        this.wheels = wheels;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public ExtraFeatures getExtraFeatures() {
        return extraFeatures;
    }

    public void setExtraFeatures(ExtraFeatures extraFeatures) {
        this.extraFeatures = extraFeatures;
    }


}
