package com.geray;

public class Car {

    private String color;
    private String brand;
    private String model;
    private String serie;
    private String caseNum;

    private int engineCapacity; //as mililitre
    private int horsePower;

    private byte wheelInch;

    private boolean isDiesel = true;

    private String fuelType;

    public boolean isDiesel() {
        if(isDiesel)
            fuelType = "Diesel";
        else
            fuelType = "Gasoline";
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public byte getWheelInch() {
        return wheelInch;
    }

    public void setWheelInch(byte wheelNumber) {
        this.wheelInch = wheelNumber;
    }


    @Override
    public String toString() {
        return "\n"+ brand+ "\n{" +
                "\n Color= '" + color + '\'' +
                ",\n Model= '" + model + '\'' +
                ",\n Serie= '" + serie + '\'' +
                ",\n Case Number= '" + caseNum + '\'' +
                ",\n Engine Capacity= " + engineCapacity +
                ",\n HP= " + horsePower +
                ",\n Wheel Size= " + wheelInch +
                ",\n Fuel type= " + fuelType +"\n"+
                '}';
    }
}
