package com.geray.vehicles;

import com.geray.Vehicle;

public class AirVehicle extends Vehicle implements Modeling {

    private boolean isTwoController;
    private boolean isOneEngine;
    private boolean isPassengerAvailable;
    private boolean isWinged;

    private byte wingNumber;



    @Override
    public String toString() {
        return "AirVehicle{" +
                "isTwoController=" + isTwoController +
                ", isOneEngine=" + isOneEngine +
                ", isPassengerAvailable=" + isPassengerAvailable +
                ", isWinged=" + isWinged +
                ", wingNumber=" + wingNumber +
                '}';
    }

    public boolean isTwoController() {
        return isTwoController;
    }

    public void setTwoController(boolean twoController) {
        isTwoController = twoController;
    }

    public boolean isOneEngine() {
        return isOneEngine;
    }

    public void setOneEngine(boolean oneEngine) {
        isOneEngine = oneEngine;
    }

    public boolean isPassengerAvailable() {
        return isPassengerAvailable;
    }

    public void setPassengerAvailable(boolean passengerAvailable) {
        isPassengerAvailable = passengerAvailable;
    }

    public boolean isWinged() {
        return isWinged;
    }

    public void setWinged(boolean winged) {
        isWinged = winged;
    }

    public byte getWingNumber() {
        return wingNumber;
    }

    public void setWingNumber(byte wingNumber) {
        this.wingNumber = wingNumber;
    }

    @Override
    public void engineSound() {
        if(isOneEngine)
            System.out.println("Prprprprprprpprpr");
        else
            System.out.println("Parrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }

    @Override
    public void writeInfo() {
        System.out.println(toString() + super.toString());
    }
}
