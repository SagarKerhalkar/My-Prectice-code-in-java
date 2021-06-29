package com.company;

public class constructor1 {
    public static void main(String[] args) {
        myemp tata = new myemp("Lata savai", 78);
        System.out.println(tata.getId() + " and name :- "+ tata.getName());

        myemp stata = new myemp();
        System.out.println(stata.getName());
        System.out.println(stata.getId());
    }
}
