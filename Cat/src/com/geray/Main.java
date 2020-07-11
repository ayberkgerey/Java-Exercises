package com.geray;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setName("fury");
        cat1.setColor("black");
        cat1.setGender("male");
        cat1.setPlaying(true);
        cat1.setAge((byte) 4);
        cat1.setHungry(false);

        System.out.println(cat1.toString());

    }
}