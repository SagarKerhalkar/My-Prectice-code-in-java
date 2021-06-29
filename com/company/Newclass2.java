package com.company;

public class Newclass2 {
    public static void main(String[] args) {
        Emp Ram = new Emp();
        Ram.id = 30;
        Ram.name =  "Shri ram jai ram jai jai ram";
        Emp Sita = new Emp();
        Sita.id = 99;
        Sita.name = "Sita Ram ji ki jai";
        //System.out.println(Ram.id +  Ram.name);
        Ram.printdetails();
        Sita.printdetails();

    }
}
