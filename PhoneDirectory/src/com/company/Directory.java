package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Directory {

    Map<String,String> Directory = new HashMap<String,String>();

    public void Menu()
    {
        Directory.put("Ayberk Gerey", "5452945744");
        Scanner Scan = new Scanner(System.in);
        System.out.println("\n\n1)Add Name And Phone Number\n2)Show All Contacts\n3)Exit");
        int karar = Scan.nextInt();
        switch(karar){
            case 1:getName();Menu(); break;
            case 2:System.out.println(Directory);Menu(); break;
            case 3:System.out.println("Have a nice day!"); break;
            default:System.out.println("Enter a Number between 1 and 3");Menu();break;}
    }

    private void getName()
    {
        String name , number;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Add contact name : ");
        name = Scan.next();
        System.out.println("Add cellphone Number");
        number = Scan.next();
        Directory.put(name , number);
        System.out.println("Contact Added");
    }
}