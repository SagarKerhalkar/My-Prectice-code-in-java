package com.company;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Loopinprectis {
    public static void main(String[] args) {
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am 10");
        }
        byte m1,m2,m3;
        Scanner v = new Scanner(System.in);

        System.out.println("inter your mark in EVS");
        m2 = v.nextByte();
        System.out.println("inter your mark in Maths");
        m3 = v.nextByte();
        System.out.println("inter your mark in SSC");
        m1 = v.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println( "your avarage = " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulation you are pass ");
        }
        else {
            System.out.println("try again you are fail ");
        }

        float tax = 0;
        float income = v.nextFloat();;
        if(income<=2.5){
            tax = tax+0;
        }
        else  if (income>2.5f && income <= 5.0f){
            tax = tax + 0.05f *  (income-2.5f);
        }
        else  if (income>5.0f && income <= 10.0f){
            tax = tax + 0.05f *  (5.0f-2.5f);
            tax = tax + 0.2f *  (income-5.0f);

        }
        else  if (income>10f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Tax is" + tax);

        int day =v.nextInt();
        switch (day){
            case 1:
                 System.out.println("Monday");
                 break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wensday");
                break;
            case 4 :
                System.out.println("Tuhsday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Sturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("write a proper week day");


        }

    }

}
