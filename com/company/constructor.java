package com.company;

class myemp {
   private int id;
    private String Name;
    public myemp() {
        Name = "Lala";
        id = 123;
    }
    public myemp(String Na , int ID ) {
        Name = Na;
        id = ID;
             }
    public String getName() {
        return Name;
    }
    public void setName(String n){        Name = n;    }
    public int getId(){        return id;    }
    public void setId(int i ){
         id= i;
    }
}
public class constructor {
    public static void main(String[] args) {
//        myemp aish = new myemp();
//        //aish.id = 2345;
//        //aish.Name = "taklya"; prived asses moddifier
//        aish.setId(12345);
//        aish.setName("Taklu");
//        System.out.println("Name of Emp :"+ aish.getName());
//        System.out.println(" Id of Emp : "+ aish.getId());

    }
}
