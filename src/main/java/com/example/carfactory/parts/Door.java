package com.example.carfactory.parts;

public class Door {

    private boolean isOpened;

    public Door() {
        this.setState(false);
    }

    public void setState(boolean newState) {
        this.isOpened = newState;
    }

    public boolean getState() {
        return this.isOpened;
    }
}
