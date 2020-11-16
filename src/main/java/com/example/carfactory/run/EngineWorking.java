package com.example.carfactory.run;

public class EngineWorking {

    private boolean engineTurnedOn;


    public EngineWorking() {
        this.setEngineTurnedOn(false);
    }

    public boolean isEngineTurnedOn() {

        return this.engineTurnedOn;
    }

    public void setEngineTurnedOn(boolean newState) {

        this.engineTurnedOn = newState;
    }


}
