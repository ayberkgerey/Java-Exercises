package com.company;
import java.util.Scanner;

public class NumberWriter {
    public static void EnterNum()
    {
        System.out.print("3 Basamaklı Bir Sayı Girin : ");
        Scanner Scan = new Scanner(System.in);
        int num;
        num = Scan.nextInt();
        WriteNum(num);
    }
    public static void WriteNum(int num)
    {   int big = num-(num%100);
        int middle = (num%100)-num%10 ;
        int small = num%10;
        WriteBig(big);
        WriteMiddle(middle);
        WriteSmall(small); }
    public static void WriteBig(int big)
    { switch (big)
        {
            case 100: System.out.print("YÜZ");break;
            case 200: System.out.print("İKİ YÜZ");break;
            case 300: System.out.print("ÜÇ YÜZ");break;
            case 400: System.out.print("DÖRT YÜZ");break;
            case 500: System.out.print("BEŞ YÜZ");break;
            case 600: System.out.print("ALTI YÜZ");break;
            case 700: System.out.print("YEDİ YÜZ");break;
            case 800: System.out.print("SEKİZ YÜZ");break;
            case 900: System.out.print("DOKUZ YÜZ");break;
        }
    }
    public static void WriteMiddle(int middle)
    {
        switch (middle)
        {   case 10: System.out.print(" ON");break;
            case 20: System.out.print(" YİRMİ");break;
            case 30: System.out.print(" OTUZ");break;
            case 40: System.out.print(" KIRK");break;
            case 50: System.out.print(" ELLİ");break;
            case 60: System.out.print(" ALTMIŞ");break;
            case 70: System.out.print(" YETMİŞ");break;
            case 80: System.out.print(" SEKSEN");break;
            case 90: System.out.print(" DOKSAN");break;
        }
    }
    public static  void WriteSmall(int small)
    {
        switch (small)
        {   case 1: System.out.print(" BİR");break;
            case 2: System.out.print(" İKİ");break;
            case 3: System.out.print(" ÜÇ");break;
            case 4: System.out.print(" DÖRT");break;
            case 5: System.out.print(" BEŞ");break;
            case 6: System.out.print(" ALTI");break;
            case 7: System.out.print(" YEDİ");break;
            case 8: System.out.print(" SEKİZ");break;
            case 9: System.out.print(" DOKUZ");break;
        }
    }
}
