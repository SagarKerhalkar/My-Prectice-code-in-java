package com.company;
class one{
    public void name(){
        System.out.println("My Name is java");
    }
    public void grid(){
        System.out.println("My Name is good morning");
    }
}
class two extends one{
    public void swagat(){
        System.out.println(" apka swagat he");
    }
    @Override
    public void name(){
        System.out.println("My Name is java for class two");
    }
}

public class Dinemic_class {
    public static void main(String[] args) {
        one obj = new one();
        two smobj = new two();
        obj.name();
        one lal = new two();
        lal.grid();
        lal.name();
        //lal.swagat() Not Allowed due to refrance of main class but object of sub class .
        smobj.swagat();

    }
}
