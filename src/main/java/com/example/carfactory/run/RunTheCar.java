package com.example.carfactory.run;

import com.example.carfactory.parts.Door;
import com.example.carfactory.parts.FuelTank;

public class RunTheCar {

    private Door leftDoor;
    private Door rightDoor;
    private FuelTank fueltank;
    private EngineWorking engineWorking;
    private boolean isTurnedOn;
    private int currentSpeed;

    public RunTheCar(int fuelCapacity, int currentFuelLevel, boolean isTurnedOn, int currentSpeed) {
        this.leftDoor = new Door();
        this.rightDoor = new Door();
        this.fueltank = new FuelTank(fuelCapacity, currentFuelLevel);
        this.engineWorking = new EngineWorking();
        this.isTurnedOn = isTurnedOn;
        this.currentSpeed = currentSpeed;
    }

    public void turnOn() {
        this.leftDoor.setState(true);
        this.rightDoor.setState(false);

        if (this.fueltank.getCurrentLevel() > 0) {
            this.engineWorking.setEngineTurnedOn(true);
            this.isTurnedOn = true;

        } else {
            System.out.println("The car does not have enough fuel...please fill it up!");
        }
    }

    public void turnOff(int currentSpeed) {
        if (currentSpeed > 0) {
            System.out.println("\nYour current speed is: " + currentSpeed + "mph...please stop the car before turning it off!");
        } else {
            this.engineWorking.setEngineTurnedOn(false);
            this.isTurnedOn = false;
        }
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void viewDashboard() {
        System.out.println("\n\n---------- Car Dashboard ----------");
        if (this.isTurnedOn) {
            System.out.println("The car is turned on.");
        } else {
            System.out.println("The car is turned off.");
        }
        System.out.println("Current Speed: " + this.getCurrentSpeed() + "mph");
        System.out.println("Fuel: " + this.fueltank.getCurrentLevel() + "/" + this.fueltank.getCapacity() + "l");
        if (rightDoor.getState())
            System.out.println("The right door is opened");
        if (leftDoor.getState())
            System.out.println("The left door is opened");

        System.out.println("-----------------------------------");
    }

}
