package com.company;
class base1{
    base1(){
        System.out.println("me ak constructor hu");
    }
    base1(int a){
        System.out.println(" i am a over loded constructor of value a base 1 :-"+a);
    }
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class drived1 extends base1{
    drived1(){
        super(9081987);
        System.out.println("me drive claas constructor hu ");
    }
    drived1(int a, int g){
        super(a);
        System.out.println("I am overloded constroctor of drived1 :"+g);
    }
    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class constructor_inharitance {
    public static void main(String[] args) {
        base1 b = new base1(97);
        drived1 d = new drived1();
        drived1 l = new drived1(98,32);

    }
}
