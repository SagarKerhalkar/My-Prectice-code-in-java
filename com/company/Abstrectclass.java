package com.company;
abstract class parrent{
    public parrent() {
        System.out.println(" i am constructor ");
    }
    public void sayhello(){
        System.out.println("Helo");
    }
    abstract public void greet();
    abstract public void greet2();

}

class child2 extends parrent{
    @Override
    public void greet(){
        System.out.println("good Morning");
    }

    @Override
    public void greet2() {
        System.out.println(" Namste ");
    }
}
abstract class child3 extends parrent{
    public void howru(){
        System.out.println(" I am fine ");
    }
}

public class Abstrectclass {
    public static void main(String[] args) {

        child2 l = new child2();
        l.greet();
        l.greet2();
        System.out.println("______________________||__________________________");
        child3 p = new child3() {
            @Override
            public void greet() {
                System.out.println("Sakadcha Namaskar");
                System.out.println("_____________||_______________||_________");
            }

            @Override
            public void greet2() {
                toString();
               int a = 20+30+40;
                System.out.println(toString() +" __|__ "+a);

            }
        };
        p.greet();
        p.greet2();
    }
}
