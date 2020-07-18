package com.geray.vehicles.airVehicles;

import com.geray.vehicles.AirVehicle;
import com.geray.vehicles.Modeling;

public class Airplane extends AirVehicle {

    private int cargoPlaceSize; // by meter square
    private int seatSize;
    private int parachuteNumber;

    public Airplane(int cargoPlaceSize, int seatSize, int parachuteNumber) {
        this.cargoPlaceSize = cargoPlaceSize;
        this.seatSize = seatSize;
        this.parachuteNumber = parachuteNumber;
    }

    public int getCargoPlaceSize() {
        return cargoPlaceSize;
    }

    public void setCargoPlaceSize(int cargoPlaceSize) {
        this.cargoPlaceSize = cargoPlaceSize;
    }

    public int getSeatSize() {
        return seatSize;
    }

    public void setSeatSize(int seatSize) {
        this.seatSize = seatSize;
    }

    public int getParachuteNumber() {
        return parachuteNumber;
    }

    public void setParachuteNumber(int parachuteNumber) {
        this.parachuteNumber = parachuteNumber;
    }
}
