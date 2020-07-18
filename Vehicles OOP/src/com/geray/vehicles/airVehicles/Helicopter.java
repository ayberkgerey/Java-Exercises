package com.geray.vehicles.airVehicles;

import com.geray.vehicles.AirVehicle;

public class Helicopter extends AirVehicle {

    private String rotorType;
    private byte rotorNumber;

    public Helicopter(String rotorType, byte rotorNumber) {
        this.rotorType = rotorType;
        this.rotorNumber = rotorNumber;
    }

    public String getRotorType() {
        return rotorType;
    }

    public void setRotorType(String rotorType) {
        this.rotorType = rotorType;
    }

    public byte getRotorNumber() {
        return rotorNumber;
    }

    public void setRotorNumber(byte rotorNumber) {
        this.rotorNumber = rotorNumber;
    }
}
