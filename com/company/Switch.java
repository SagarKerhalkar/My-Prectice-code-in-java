package com.company;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int ch = l.nextInt();
        switch (ch) {
            case 100:
                System.out.println("you are grate");
                break;
            case 200:
                System.out.println("You are lovely");
                break;
            default:
                System.out.println("you are normal ");
        }

    }
}
