package com.company;

import java.util.Scanner;

public class UserInfo {

    private String name;
    private int age;
    private int cookingYear;
    private String experience;
    private int expDecide;

    public UserInfo()
    {
        //Having the information from the User

        Scanner Scan = new Scanner(System.in);
        System.out.print("Would you bring us your name ? : ");
        name = Scan.next();
        System.out.print("How old are you ? : ");
        age = Scan.nextInt();
        System.out.print("How many years were you cooking ? : ");
        cookingYear = Scan.nextInt();

        System.out.println("What about your cooking Experience ? : ");
        System.out.println("1)Beginner 2)Intermediate 3)Advanced");
        Decider();
    }

    private void Decider()
    {
        Scanner Scan = new Scanner(System.in);
        expDecide = Scan.nextInt();

        switch (expDecide)
        {
            case 1:experience = "Beginner"; break;
            case 2:experience = "Intermediate"; break;
            case 3:experience = "Advanced"; break;
            default:
                System.out.println("You must enter a number between 1 and 3");
                Decider(); break;
        }
    }



}