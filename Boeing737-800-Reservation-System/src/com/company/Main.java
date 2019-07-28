package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("\n\n\t\t\t\tBOEING 737-800 SEAT RESERVATION SYSTEM");

        //Ask how many tickets user wants
        System.out.print("\nHow many tickets will you buy : ");
        int numOfTickets = Scan.nextInt();
        Reservation[] tickets = new Reservation[numOfTickets];

        for(int i = 0 ; i<numOfTickets ; i++)
        { tickets[i] = new Reservation(); }

        for(int j = 0 ; j<numOfTickets;j++)
        { System.out.println(tickets[j].toString() + "\n\n\n");}


    }
}
