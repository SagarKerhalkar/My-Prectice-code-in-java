package com.company;

class Emp{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println(" may Name is = "+name);
        System.out.println(" and my id is = "+id);
        System.out.println( "salary of "+name+" is = "+salary);

        }
//
//    public int salary() {
//        return salary;
//            }

}

public class Newclass {
    public static void main(String[] args) {
        Emp Ram = new Emp();
        Ram.id = 30;
        Ram.name =  "Shri ram jai ram jai jai ram";
        Ram.salary = 70000;
        Emp Sita = new Emp();
        Sita.id = 99;
        Sita.name = "Sita Ram ji ki jai";
        Sita.salary = 90000;
        //System.out.println(Ram.id +  Ram.name);
        Ram.printdetails();
        Sita.printdetails();


    }
}
