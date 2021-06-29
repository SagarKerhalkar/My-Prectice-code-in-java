package com.company;
class base {
    int X;
    public int getX() {
        return X;
    }
    public void setX(int x) {
        System.out.println(" i am in base and seeting x now : ");
        X = x;
    }
    public void printme(){
        System.out.println("i am a constructor");
    }
}

class drived extends base{
    int y ;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(27);
        System.out.println(b.getX());
        // criting obj y class
        drived c = new drived();
        c.setX(9);
        System.out.println(" value of x from supper class or perents class : "+c.getX());
        c.setY(18);
        System.out.println("value of sub class or child class drive : "+c.getY());

    }
}
