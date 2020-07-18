package com.geray.vehicles;

import com.geray.Vehicle;

public class LandVehicle extends Vehicle implements Modeling{

    private boolean isSteeringUK;
    private boolean isDiesel;
    private byte wheelNumber;
    private boolean isAutomatic;

    public boolean isSteeringUK() {
        return isSteeringUK;
    }

    public void setSteeringUK(boolean steeringUK) {
        isSteeringUK = steeringUK;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    public byte getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(byte wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public void engineSound() {
        if(isDiesel)
            System.out.println("Gurgurgurgurgurgurgurgur");
        else
            System.out.println("Bmbmbmbmbmbmbmbmbmbmbmbm");
    }

    @Override
    public void writeInfo() {
        System.out.println(toString() + super.toString());
    }

    @Override
    public String toString() {
        return "LandVehicle{" +
                "isSteeringUK=" + isSteeringUK +
                ", isDiesel=" + isDiesel +
                ", wheelNumber=" + wheelNumber +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}
