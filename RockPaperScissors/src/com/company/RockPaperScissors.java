package com.company;
import java.util.Scanner;

public class RockPaperScissors {

    public static void Game()
    {
          int PlayerCounter = 0 , ComputerCounter = 0 ,Player,Computer;
          while(PlayerCounter != 3 && ComputerCounter !=3)
          {
              System.out.println("1)Rock\n2)Paper\n3)Scissors");
              Scanner Scan = new Scanner(System.in);
              Player = Scan.nextInt();
              Computer = (int)(Math.random()*3+1);
              if(Player == Computer) { System.out.println("Same Selections! No Points");}
              else if(Player == 1 && Computer == 3)
              {
                  PlayerCounter++;
                  System.out.println("Computer choosed Scissors\nYour point is : " + PlayerCounter +"\nComputer's point is : "+ComputerCounter);
              }
              else if(Player == 1 && Computer == 2)
              {
                  ComputerCounter++;
                  System.out.println("Computer choosed Paper\nYour point is : " + PlayerCounter +"\nComputer's point is : "+ComputerCounter);
              }
              else if(Player == 2 && Computer == 1)
              {
                  PlayerCounter++;
                  System.out.println("Computer choosed Rock\nYour point is : " + PlayerCounter +"\nComputer's point is : "+ComputerCounter);
              }
              else if(Player == 2 && Computer == 3)
              {
                  ComputerCounter++;
                  System.out.println("Computer choosed Scissors\nYour point is : " + PlayerCounter +"\nComputer's point is : "+ComputerCounter);
              }
              else if(Player == 3 && Computer == 1)
              {
                  ComputerCounter++;
                  System.out.println("Computer choosed Rock\nYour point is : " + PlayerCounter +"\nComputer's point is : "+ComputerCounter);
              }
              else if(Player == 3 && Computer == 2)
              {
                  PlayerCounter++;
                  System.out.println("Computer choosed Paper\nYour point is : " + PlayerCounter +"\nComputer's point is : "+ComputerCounter);
              }
          }
    }
}
