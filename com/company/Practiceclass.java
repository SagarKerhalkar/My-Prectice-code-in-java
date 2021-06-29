package com.company;
class Empl{
    int salary;
    String Name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return Name;
    }
    public void setName(String n ){
        Name = n;
    }
}
class cellphone {
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vibrating ");
    }
    public void callafriend(){
        System.out.println("call wife ");
    }
}
class square{
    int side;
    public int area (){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tomy{
    public void run(){
        System.out.println("running run  ");
    }
    public void fire(){
        System.out.println("fire the class ");
    }public void hit(){
        System.out.println("hiting the enemy disum ");
    }

}

public class Practiceclass {
    public static void main(String[] args) {
        Empl Priti = new Empl();
        Priti.setName("Om Namha shivay ");
        System.out.println(Priti.getName());
        Priti.salary = 10;
        System.out.println(Priti.getSalary());
        System.out.println("problum 2");
        cellphone apple = new cellphone();
        apple.ringing();
        apple.callafriend();apple.vibrating();
        System.out.println("problum 3");
        square Sq = new square();
        Sq.side = 18;
        System.out.println("Area of Squar is : " +Sq.area());
        System.out.println("Peremetere of Squar is : "+ Sq.perimeter());
        System.out.println("problum 4 ");
        Tomy bab = new Tomy();
        bab.fire();
        bab.hit();
        bab.run();
    }
}


