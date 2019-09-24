package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

  String[] inputArray = {"a",
          "abc",
          "cbd",
          "zzzzzz",
          "a",
          "abcdef",
          "asasa",
          "aaaaaa"};
  ArrayList<String> longStrings = new ArrayList<String>();

    int maxLength = 0;

        //finds the maximum length of the long string

    for(int i = 0 ; i<inputArray.length;i++) {
        if (maxLength < inputArray[i].length())
        {
            maxLength = inputArray[i].length();
        }
    }

    // stores the long string to an array

    for(int j = 0 ; j<inputArray.length; j++) {
        if (inputArray[j].length() == maxLength) {
            longStrings.add(inputArray[j]);
        }
    }

      System.out.println(longStrings);

    }
}
