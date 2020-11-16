package com.example.carfactory.parts;

public class ExtraFeatures {

    private boolean hasHorn;
    private String lightsType;
    private boolean hasGps;
    private boolean hasParkingSensors;


    public ExtraFeatures(boolean hasHorn, String lightsType, boolean hasGps, boolean hasParkingSensors) {
        this.hasHorn = hasHorn;
        this.lightsType = lightsType;
        this.hasGps = hasGps;
        this.hasParkingSensors = hasParkingSensors;
    }


    public boolean isHasHorn() {
        return hasHorn;
    }

    public void setHasHorn(boolean hasHorn) {
        this.hasHorn = hasHorn;
    }

    public String getLightsType() {
        return lightsType;
    }

    public void setLightsType(String lightsType) {
        this.lightsType = lightsType;
    }

    public boolean isHasGps() {
        return hasGps;
    }

    public void setHasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }

    public boolean isHasParkingSensors() {
        return hasParkingSensors;
    }

    public void setHasParkingSensors(boolean hasParkingSensors) {
        this.hasParkingSensors = hasParkingSensors;
    }

}
