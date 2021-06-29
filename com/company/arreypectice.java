package com.company;

public class arreypectice {
    public static void main(String[] args) {
//        float[] a = {22.3f,34.5f,64.f,34.5f,22.8f};
//        float sum = 0;
//        for(float x:a){
//            sum = sum + x ;
//        }
//        System.out.println(" total for a = " +sum);
//
//        float[] s = {22.3f,34.5f,64.f,34.5f,22.8f};
//        float x = 22.3f;
//        boolean isinarr = false;
//
//        for(float y:s){
//            if (x == y ){
//                isinarr = true;
//                break;
//            }
//        }
//        if (isinarr){
//            System.out.println( " Om sia ram ");
//        }
//        else {
//            System.out.println( "Ram ram");
//        }
//        float[] y = {22.3f,34.5f,64.f,34.5f,22.8f};
//        float l = 0;
//        for(float c:a){
//            sum = sum + c ;
//        }
//        System.out.println(" avag = " +sum/y.length);
//
//        int[][] mat1 = {{ 11 , 12 , 13},
//                        { 21 , 22,  23 }};
//        int [][] mat2 = {{31 , 32 , 33 },
//                         {41 , 42 , 43}};
//        int[][]res = {{ 0 , 0 , 0},
//                { 0 , 0,  0 }};
//
//        for (int i = 0; i< mat1.length;i++){
//          for( int j = 0; j<mat1[i].length;j++){
//              //System.out.format("setting valut = i = %d and j = %d\n ",i,j);
//              res[i][j] = mat1[i][j] + mat2[i][j];
//              System.out.print(res[i][j] + "  " );
//          }
//            System.out.println( " ");
//        }
//
                  int a [] = {1,2,3,4,5,6};
                  int n = Math.floorDiv(a.length,2);
                  int l = a.length;
                  int temp;
        System.out.println(n);
        for (int i = 0 ; i<n; i++) {
            temp = a[i];
            a[i] = a[l-i-1];
            a[l-i-1] = temp;
        }
        for(int x : a) {
            System.out.print(x + " ");
        }
        boolean sisort = true;
        int [] arr = {1,21,34,45};
        for (int k=0;k<arr.length-1;k++) {
            if (arr[k] > arr[k + 1]) {
                sisort = false;
                break;
            }
        }
            if (sisort){
                System.out.println("ok is arrey");
            }
            else {
                System.out.println("not ok");
        }

    }
}
