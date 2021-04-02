package com.company;
//Just a little practise for my quiz.
public class Main {
    public static void main(String[] args) {

        BackEndDeveloper backEndDeveloper = new BackEndDeveloper("Jack","Summer","Male",24,true,"MongoDB",(byte)7);
        FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper("Russel","Black","Male",27,false,"Javascript",true);
        Designer designer = new Designer("Maria","Eingeladen","Female",23,true,"Adobe Photoshop");

        System.out.println(backEndDeveloper.toString());
        System.out.println(frontEndDeveloper.toString());
        System.out.println(designer.toString());
    }
}
