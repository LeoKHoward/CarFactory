package com.example.carfactory.parts;

public class FuelTank {

    private int capacity;
    private int currentLevel;

    public FuelTank(int capacity, int currentLevel) {
        this.setCapacity(capacity);
        this.setCurrentLevel(currentLevel);
    }

    public int getCapacity() {

        return this.capacity;
    }

    public int getCurrentLevel() {

        return this.currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void setCapacity(int newCapacity) {
        if (newCapacity <= 0) {
            System.out.println("The tank capacity must be greater than 0!");
        }
        this.capacity = newCapacity;
    }

    public void fillFuelTank(int newLevel) {
        if (newLevel <= 0) {
            System.out.println("There must be some fuel in the tank to run the car!");
        } else if (newLevel > this.getCapacity()) {
            System.out.println("Fuel tank level must be between 0 and " + this.getCapacity());
        } else {
            this.currentLevel = newLevel;
        }
    }

    public void decreaseLevel(int decreasedAmount) {

        this.fillFuelTank(this.getCurrentLevel() - decreasedAmount);
    }

    public void increaseLevel(int increasedAmount) {

        this.fillFuelTank(this.getCurrentLevel() + increasedAmount);
    }


}
