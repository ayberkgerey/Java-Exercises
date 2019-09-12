package com.company;

import java.util.Scanner;

public class isPalindrome {

    public isPalindrome(String name)
    {

        Scanner Scan = new Scanner(System.in);
        name = Scan.nextLine();
        String reversedName = "";

        for(int i=name.length() -1  ; i>=0;i--)  reversedName = reversedName + name.charAt(i);

        boolean isequal = name.equals(reversedName);
        System.out.println(isequal);

    }

}
