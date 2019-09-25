package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//binnary sort
        Scanner Scan = new Scanner(System.in);

        int [] numbers=new int[100];
        for (int i=0;i <100;++i){
            numbers[i]=i;
        }

        int stepCounter = 0;

        System.out.println("Enter the number you want to find");
        int inputNum = Scan.nextInt();

        if(numbers[numbers.length/2] == inputNum) System.out.println("Number is in the middle");


        else if(numbers[(numbers.length/2)-1] > inputNum)
        {
            for(int i = (numbers.length/2)-2; i>=0 ; i--)
            {
                stepCounter++;
                if(numbers[i] == inputNum) {
                    System.out.println("Number has found in " + stepCounter + ". step");
                    break;
                }
                }
        }

        else if(numbers[(numbers.length/2)+1] < inputNum)
        {
            for(int k = (numbers.length/2)+2; k<=numbers.length;k++)
            {
                stepCounter++;
                if(numbers[k] == inputNum)
                {
                    System.out.println("Number has found in " + stepCounter + ". step");
                    break;
                }

            }

        }

        else System.out.println("Number has not found");

    }
}
