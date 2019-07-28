package com.company;

import java.util.Scanner;

public class Reservation {

    //data for seats
    private char[][] seats = {
            {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'},
            {'X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X','X'}
    };
    private int seatCounter = 0;
    private int line,seatNum;

    //data for user
    private String name;
    private String lastName;
    private String id;
    private String phoneNum;
    private String mail;


    public Reservation() {
        //Have information of user
        userInfo();
        System.out.println("\n\n"+name+" "+lastName+"\n"+id+"\n"+phoneNum+"\n"+mail+"\n\n");

        //write seat plan
        writeSeats();
        replaceSeat();
        System.out.println("\nSeat has been selected");
        writeSeats();
    }

    //Printing of seatPlan
    private void writeSeats() {

        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0: System.out.print("A)  ");break;
                case 1: System.out.print("B)  ");break;
                case 2: System.out.print("C)  ");break;
                case 3: System.out.print("D)  ");break;
                case 4: System.out.print("E)  ");break;
                case 5: System.out.print("F)  ");break;
            }

            for (int j = 0; j < 24; j++) {
                seatCounter++;
                System.out.print(seats[i][j] + "\t");
                if(seatCounter % 4 == 0) System.out.print("\t");
            }
            System.out.println();
        }

        for (int z = 1; z < 25; z++) {
            if (z == 1) System.out.print("\t");
            System.out.print(z + "\t");
            if (z % 4 == 0) System.out.print("\t");
        }
    }

    //Scan all the information of users
    private void userInfo() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("\n\nEnter your name : ");
        name = Scan.next();
        System.out.print("\nEnter your last name : ");
        lastName = Scan.next();
        System.out.print("\nEnter your ID : ");
        id = Scan.next();
        System.out.print("\nEnter your phoneNum : ");
        phoneNum = Scan.next();
        System.out.print("\nEnter your E-Mail : ");
        mail = Scan.next();
    }

    //replace a person to an empty seat
    private void replaceSeat() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("\n\nEnter the line you want\nA)1 B)2 C)3 D)4 E)5 F)6");
        line = Scan.nextInt();
        System.out.print("\nEnter the seatnumber you want '1-24'");
        seatNum = Scan.nextInt();
        line--;
        seatNum--;
        seats[line][seatNum] = 'R';
        System.out.println();
    }

    public String toString()
    {
        return "\n\nName : " + name+" "+lastName+
               "\nID : "+ id+
               "\nPhone Number : "+phoneNum+
               "\nE-Mail : "+ mail;
    }



}