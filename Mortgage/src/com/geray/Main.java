package com.geray;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner Scan = new Scanner(System.in);
        int principal = 0;
        int numberOfPayments = 0;
        float monthlyInterest;

        while(true){
            System.out.print("Principal (1K-1M) : ");
             principal = Scan.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1,000,000");
        }

        while(true) {
            System.out.print("Annual Interest Rate : ");
            float annualInterest = Scan.nextFloat();
            Scan.nextByte();
            if(annualInterest > 0 && annualInterest <= 30){
                monthlyInterest = annualInterest / PERCENT /MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 0 and 30");
        }

        while(true){
            System.out.println("Period (Years) : ");
            byte years = Scan.nextByte();
            if(years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest , numberOfPayments) -1 );

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage : " + mortgageFormatted);

    }
}