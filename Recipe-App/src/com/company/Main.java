package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("\t\t\t---RECIPE APP---");

        System.out.println("Do you want to add your personal information ? ");
        System.out.println("1)YES 2)NO");
        int firstAnswer = Scan.nextInt();
        if(firstAnswer == 1)
        {
            UserInfo User = new UserInfo();
        }

        RecipeList choiceList = new RecipeList();
        Recipes getRecipe = new Recipes();

        System.out.println("Thanks for trying...");

    }
}
