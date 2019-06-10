package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String year;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0 ;
    private int costOfCourse = 600;
    private static int id = 1000;

    //constructor prompt user to enter student's name and year
    public Student() {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter student's first name : ");
        this.firstName = Scan.nextLine();

        System.out.print("Enter student's last name : ");
        this.lastName = Scan.nextLine();

        System.out.print("1)Freshmen\n2)Sophmore\n3)Junior\n4)Senior\nEnter student's class level : ");
        this.gradeYear = Scan.nextInt();
        setStudentID();
    }


     //Generate ID
    private void setStudentID()
    {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

        //Enroll in courses
    public void enroll()
    {
        //Get inside a loop , user hits 0
     do {
         Scanner Scan = new Scanner(System.in);
         System.out.print("Enter course to enroll (Enter 'Q' to quit) :");
         String course = Scan.nextLine();
         if (!course.equals("Q")) {
             courses = course + "\t";
             tuitionBalance = tuitionBalance + costOfCourse;
         }
         else{break;}
        }while(true);
        }

    //View balance
    public void viewBalance()
    {
        System.out.println("Your balance is : "+tuitionBalance+"$");
    }

    //Pay tuition
    public void payTuition()
    {
        viewBalance();
        Scanner Scan = new Scanner(System.in);
        System.out.print("How much you want to pay: ");
        int payment = Scan.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of "+payment+"$");
        viewBalance();
    }

    //Show Status
    public String toString()
    {
        //It must be the remaining all informations
            return "Name : " + firstName+" "+lastName+
                   "\nStudent ID : "+studentID+
                   "\nCourses Enrolled : "+courses+
                   "\nBalance : $" + tuitionBalance+
                   "\nGrade Level : "+gradeYear;
    }
}