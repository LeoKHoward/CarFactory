package com.example.carfactory.parts;

public class Chassis {

    private String axle;
    private String suspension;


    public Chassis(String axle, String suspension) {
        this.axle = axle;
        this.suspension = suspension;
    }


    public String getAxle() {
        return axle;
    }

    public void setAxle(String axle) {
        this.axle = axle;
    }


    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }


}
