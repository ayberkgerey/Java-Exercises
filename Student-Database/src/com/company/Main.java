package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // Don't forget to ask how many new students we want to add
       System.out.println("Enter number of new students to enroll : ");
       Scanner Scan = new Scanner(System.in);
       int numOfStudents = Scan.nextInt();
       Student[] students = new Student[numOfStudents];

    //Create n number of new students
        for(int i = 0;i<numOfStudents;i++)
        {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println();
        }

        for(int j = 0 ; j<numOfStudents;j++)
        {System.out.println(students[j].toString()+"\n\n\n");}
    }
}
