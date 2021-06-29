package com.company;

public class recursion {
    static int factitr(int n){

    if ( n==0 || n == 1){
        return 1;
//    static int factorial (int n){
//        if (n==0 || n == 1){
//                        return 1;
//        }
//        else {
//            return n * factorial(n-1);

        }
    else {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p *= i;
        }
        return p;
    }

    }

    public static void main(String[] args) {
        System.out.println("the factorial n =" + factitr(4));

    }
}
