package com.company;

public class prcticeonmethod {
    static void starp(int x){
        if (x>0){
            for (int i = 0 ; i<x ; i++){
                System.out.print( " * ");
            }
            System.out.println();
            starp(x -1);
        }
    }

    static int sumrec(int n){
        if (n ==1 || n == 0 ){
            return  1;
        }
              return n+sumrec(n-1);
    }
    static void multi(int n){
        for (int i = 1 ; i<= 10; i++) {
            System.out.printf("%d * %d = %d   ", n, i, n * i );
        }
        System.out.println();
    }
    static void pat1 ( int p ){
        for (int i = 0 ; i< p ; i ++){
            for (int j = 0 ; j<i+1 ; j++){
                System.out.print( " * ");
            }
            System.out.println( );

        }

    }
    static void pat2 ( int p ){
        for (int i = 0 ; i< p ; i ++){
            System.out.println(i);
            for (int j = 0 ; j<p-i; j++){
                System.out.print(j);
                System.out.print( " om ");
            }
            System.out.println( );

        }

    }
    public static void main(String[] args) {
        //multi(21);
        //pat1(4);
        //System.out.println("sum of natural nu = " +sumrec(2));
        //pat2(4);
        starp(4);

    }
}
