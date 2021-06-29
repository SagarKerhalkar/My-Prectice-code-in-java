package com.company;

public class Condisonal {
    public static void main(String[] args) {
        int a = 18;
        if (a >= 18) {
            System.out.println("Can Drive");
        } else {
            System.out.println("can not Dirive");
        }
        boolean M = true;
        boolean Q = false;
        if (M && Q) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        if (M || Q){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        System.out.println(!M);
        System.out.println(!Q);
    }
}
