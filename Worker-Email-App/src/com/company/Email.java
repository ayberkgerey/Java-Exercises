package com.company;

import java.util.Scanner;

public class Email {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "agcompany.com";

    //Constructor to receive first name and last name
    public Email(String firstName , String lastName)
    {
        Scanner in = new Scanner(System.in);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();

        //call a method asking for the department - and return the department
        this.password = randomPassword(defaultPasswordLength);

        //Combine elements to generate your e mail
         email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
    }
    //Ask for department
    private String setDepartment()
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the number of your department.\n1)Sales\n2)Development\n3)Accounting\n0)None");
        int depChoice = Scan.nextInt();
        if(depChoice==1){ return "sales";}
        else if(depChoice==2){ return "dev";}
        else if(depChoice==3){ return "acct";}
        else return "";
    }

    //Genarate a random password
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char []password = new char[length];
        for(int i=0 ; i<length ; i++)
        {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity)
    { this.mailboxCapacity = mailboxCapacity; }
    //Set the alternate email
    public void setAlternateEmail(String altEmail) {this.alternateEmail = altEmail; }

    //Change the password
    private void changePass(String password) { this.password = password; }
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo()
    {
        return "DISPLAY NAME : " + firstName + " " + lastName +"\n"+
               "COMPANY E-MAIL : " + email+"\n"+
                "YOUR PASSWORD : " + password+ "\n"+
               "MAILBOX CAPACITY " + mailboxCapacity + "mb";
    }
}