package com.geray;


public class Main {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes();
        BMW bmw = new BMW();

        mercedes.setColor("Black");
        mercedes.setBrand("Mercedes-Benz");
        mercedes.setModel("2012");
        mercedes.setSerie("E");
        mercedes.setCaseNum("1234A98B");
        mercedes.setEngineCapacity(2000);
        mercedes.setHorsePower(230);
        mercedes.setWheelInch((byte) 15);
        mercedes.isDiesel();

        mercedes.setAMD(false);

        System.out.println(mercedes.toString());

        bmw.setColor("Black");
        bmw.setBrand("Bayerische Motoren Werke");
        bmw.setModel("2016");
        bmw.setSerie("5");
        bmw.setCaseNum("912735JK");
        bmw.setEngineCapacity(2000);
        bmw.setHorsePower(300);
        bmw.setWheelInch((byte) 15);
        bmw.setDiesel(false);

        bmw.setMsport(true);

        System.out.println(bmw.toString());




    }
}