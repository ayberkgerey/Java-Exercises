package com.geray;

import com.geray.vehicles.Modeling;

//only land vehicles
public class Vehicle {

    private boolean hasWheels;
    private boolean isIronCase;
    private boolean isArmyVehicle;
    private boolean isHumanless;

    private String model = "No model has been given";
    private String brand = "No brand has been given";
    private String type = "No vehicle type has been given";


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public Vehicle(boolean hasWheels, boolean isIronCase, boolean isArmyVehicle, boolean isHumanless, String model, String brand, String type) {
        this.hasWheels = hasWheels;
        this.isIronCase = isIronCase;
        this.isArmyVehicle = isArmyVehicle;
        this.isHumanless = isHumanless;
        this.model = model;
        this.brand = brand;
        this.type = type;
    }

    public Vehicle(){ };

    public String toString() {
        return "Vehicle{" +
                "hasWheels=" + hasWheels +
                ", isIronCase=" + isIronCase +
                ", isArmyVehicle=" + isArmyVehicle +
                ", isHumanless=" + isHumanless +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public boolean isIronCase() {
        return isIronCase;
    }

    public void setIronCase(boolean ironCase) {
        isIronCase = ironCase;
    }

    public boolean isArmyVehicle() {
        return isArmyVehicle;
    }

    public void setArmyVehicle(boolean armyVehicle) {
        isArmyVehicle = armyVehicle;
    }

    public boolean isHumanless() {
        return isHumanless;
    }

    public void setHumanless(boolean humanless) {
        isHumanless = humanless;
    }
}
