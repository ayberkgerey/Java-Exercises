package com.company;
import java.util.Scanner;


public class Account {
    private int MenuChoice;
    private int MainMoney , ProcessMoney , Password , ConfirmPass;
    private String Name;


    public void Entrance() {
        Scanner UserScan = new Scanner(System.in);
        System.out.println("Enter your name to Open Account");
        Name = UserScan.next();
        PassPart();
        firstAmount();
        if(MainMoney < 0){System.out.println("Enter a positive number !");firstAmount();}
        Menu();
    }
    private void Menu() {
        Scanner Scan = new Scanner(System.in);

        System.out.println("1) Ballance Inquiry");
        System.out.println("2) Draw Money");
        System.out.println("3) Deposit Money");
        System.out.println("4) EXIT");
        MenuChoice = Scan.nextInt();
        switch (MenuChoice) {
            case 1: ShowMoney();break;
            case 2: DrawMoney();break;
            case 3: Deposit();break;
            case 4: System.out.println("Have a good Day");break;
            default: System.out.println("You must Enter A Number between 1 and 4\n");Menu();break;
        }
    }
    private int firstAmount() {
        Scanner UserScan = new Scanner(System.in);
        System.out.println("Add your first Amount to account : ");
        MainMoney = UserScan.nextInt();
        return MainMoney;
    }
    private int PassPart() {
        Scanner ScanPassword = new Scanner(System.in);
        System.out.println("Enter Your Password : ");
        Password = ScanPassword.nextInt();
        System.out.println("Enter your Password again to Confirm : ");
        ConfirmPass = ScanPassword.nextInt();
        if(Password != ConfirmPass){System.out.println("Passwords are not the same!");PassPart();}
        return Password;
    }
    private int Deposit() {
        Scanner DepositScan = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit ");
        ProcessMoney = DepositScan.nextInt();
        if(ProcessMoney < 0){System.out.println("Enter a positive Value");Deposit();}
        MainMoney += ProcessMoney;
        ShowMoney();
        LastChoice();
        return MainMoney;
    }
    private int DrawMoney() {
        Scanner MoneyScan = new Scanner(System.in);
        System.out.println("Enter the amount you want to draw : ");
        ProcessMoney = MoneyScan.nextInt();
        if(ProcessMoney < 0){System.out.println("Enter a positive Value");DrawMoney();}
        if(MainMoney < ProcessMoney){System.out.println("You haven't got enough money in your account...\n Returning to Menu");Menu();}
        MainMoney -= ProcessMoney;
        ShowMoney();
        LastChoice();
        return MainMoney;
    }
    private void ShowMoney() {
        System.out.println("Your Current Money : " + MainMoney + "$");
        LastChoice();
    }
    private void LastChoice()
    {
        Scanner ChoiceScan = new Scanner(System.in);
        int choice;
        System.out.println("1) Return Menu");
        System.out.println("2) Exit");
        choice = ChoiceScan.nextInt();
        switch (choice){
            case 1: Menu(); break;
            case 2: System.out.println("Have a good day...");break;
          //  default : System.out.println("Enter '1' or '2' to continue !");LastChoice(); break;
        }

    }
}
