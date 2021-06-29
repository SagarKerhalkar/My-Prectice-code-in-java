package com.company;

public class loop {
    public static void main(String[] args) {
  //      int la = 10;
//        while (la<=4){
//            System.out.print("," +la);
//            la++;
//        }
//        System.out.println("do wile loop");
//        do {
//            System.out.print("'" +la);
//            la++;
//        } while (la<9);
        for(int a = 4; a!=0 ; a-- ){
            System.out.print("," +a);
        }
        int n = 5;
        for (int i= 0;i < n ; i ++) {
            System.out.println("first five odd no = " + (2*i + 1));
            System.out.print("first five even no = " + (2*i));
        }

    }
}
