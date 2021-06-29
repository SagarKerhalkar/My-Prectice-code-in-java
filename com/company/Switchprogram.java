package com.company;
import java.util.Scanner;

public class Switchprogram {
    public static void main(String[] args) {
        Scanner la = new Scanner(System.in);
        System.out.print("Enter Your parsaintage = ");
        int pass = la.nextInt();
        if (pass <= 34){
        System.out.println("You are Fail");
        } else {
            if (pass <= 59 ){
                System.out.println("you are pass in second division ");
            }
            else {
                if (pass <= 90) {
                    System.out.println(" You pass in first division");
                }
                else {
                    System.out.println(" Pass in Merit ");
                }
            }
        }



    }
}
