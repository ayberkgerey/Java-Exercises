package com.company;

public class Car {

    private int age;            // age of car
    private String color;       //Color of car
    private String Brand;       // The brand of car "Mercedes , BMW , Audi , Porsche , VolksWagen..."
    private int hp;             //HorsePower of the vehicle
    private boolean gearType;   //The geartype of the car like automatic"true" , manual"false"
    private char carClass;      // The segments of the car for example A.Class , B.Class , S.Class...


    public void setAge(int age){this.age = age;}
    public void setColor(String color){this.color = color;}
    public void setBrand(String Brand){this.Brand = Brand;}
    public void setHP(int hp){this.hp = hp;}
    public void setGearType(boolean gearType){this.gearType = gearType;}
    public void setCarClass(char carClass){this.carClass = carClass;}

    public void showInfo(Car Carr){
        System.out.print(Carr.age+" Years old ");
        System.out.print(Carr.color + " "+Carr.hp +" HorsePower "+Carr.carClass + " Class " +Carr.Brand);
        if(Carr.gearType == true) {System.out.println(" The car is automatic"); }
        else{System.out.println(" The car is manual");}
    }
}