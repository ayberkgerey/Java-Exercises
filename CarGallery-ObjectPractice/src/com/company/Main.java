package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   // Type name = new type(writings);
        Scanner Scan = new Scanner(System.in);
        System.out.println("Welcome to German Car Gallery Program");
        System.out.println("1)Mercedes\n2)BMW\n3)Porsche\n4)Audi\n5)VolksWagen");

        int choice = Scan.nextInt();
        switch(choice)
        {
            case 1:
                Car Mercedes = new Car();
                Mercedes.setAge(2); //years old
                Mercedes.setColor("Black");
                Mercedes.setBrand("MERCEDES-BENZ");
                Mercedes.setHP(350);
                Mercedes.setGearType(true);//automatic
                Mercedes.setCarClass('S');
                new Car().showInfo(Mercedes);
            break;
            case 2:
                Car BMW = new Car();
                BMW.setAge(1);
                BMW.setColor("White");
                BMW.setBrand("Bayerische Motoren Werke");
                BMW.setHP(750);
                BMW.setGearType(false);
                BMW.setCarClass('A');
                new Car().showInfo(BMW);
                break;
            case 3:
                Car Porsche = new Car();
                Porsche.setAge(4);
                Porsche.setColor("Red");
                Porsche.setBrand("Porsche");
                Porsche.setHP(1200);
                Porsche.setGearType(true);
                Porsche.setCarClass('S');
                new Car().showInfo(Porsche);
            break;
            case 4:
                Car Audi = new Car();
                Audi.setAge(1);
                Audi.setColor("Black");
                Audi.setBrand("Audi");
                Audi.setHP(600);
                Audi.setGearType(true);
                Audi.setCarClass('S');
                new Car().showInfo(Audi);
            break;
            case 5:
                Car VW = new Car();
                VW.setAge(7);
                VW.setColor("Blue");
                VW.setBrand("VolksWagen");
                VW.setHP(110);
                VW.setGearType(false);
                VW.setCarClass('C');
                new Car().showInfo(VW);
            break;
            default:
                System.out.println("You have to enter between 1 and 5!");
            break;
        }
    }
}