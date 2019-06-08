package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\tNEW WORKER EMAIL GENERATOR");
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = Scan.next();
        System.out.println("Enter your last name");
        String lastName = Scan.next();
        Email em1 = new Email(firstName,lastName);

        System.out.println(em1.showInfo());
    }
}