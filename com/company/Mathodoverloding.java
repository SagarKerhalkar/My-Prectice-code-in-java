package com.company;

public class Mathodoverloding {
    static void change2 (int []arr){
        arr[0]= 5777;
    }
    static void change (int a){
        a= 5;
    }
    static void telljock (){
        System.out.println("good is weell");
    }
    public static void main(String[] args) {
       // telljock();
        int [] m = {12,77,89,52,94};
//        changing the int
//        int x = 45;
//        change(x);
//        System.out.println("the value of x is just copy over the change objact so a value will not effect to x =" +x);

        change2(m);
        System.out.println("if change in static arrey no thane ="+m[0] + "sd "+m[1]);
    }
}
