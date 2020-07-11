package com.geray;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AsciiArts arts = new AsciiArts();
        Scanner Scan = new Scanner(System.in);

        CatInfo catInfo = new CatInfo();

        Prompt prompt = new Prompt();

        System.out.println("Your door rings and you see a gift in front the door...");
        System.out.println("You are about the open it!");
        prompt.promptEnterKey();

        System.out.println(arts.getPRESENT());
        prompt.promptEnterKey();

        System.out.println(arts.getSLEEPINGCAT());
        System.out.println("There is a little Cat!");
        prompt.promptEnterKey();




        // The part if you are sure about your cat's name
        while(true){
            System.out.println("How do you want to call him ? (Write)");
            String name = Scan.next();

            System.out.println("Are you sure about this name - " + name + " ?(Yes/No)");
            String decide = Scan.next();

            if (decide.toUpperCase().equals("NO")) {
            }
             if(decide.toUpperCase().equals("YES"))
                break;
            else
                System.out.println("Type Yes or No...");
        }


    }
}