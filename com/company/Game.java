package com.company;
import java.util.Random;
import java.util.Scanner;

class lal{
    public  int number ;
    public int inputno;
    public int nomberofgesses =0;

    public int getNomberofgesses() {
        return nomberofgesses;
    }

    public void setNomberofgesses(int nomberofgesses) {
        this.nomberofgesses = nomberofgesses;
    }

    lal(){
        Random ran = new Random();
        number = ran.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("Guess The No :- ");
        Scanner sc = new Scanner(System.in);
        inputno = sc.nextInt();

    }
    boolean iscorrectnumber(){
        nomberofgesses++;
        if (number == inputno){
            System.out.format("you are right %d\n you geesed in %d attemts",number,nomberofgesses);
            return true;
        }
        else if (inputno<number){
            System.out.println("no is less ");
        }else if (inputno>number){
            System.out.println("no is High ");
        }
           return false;
    }

}

public class Game {
    public static void main(String[] args) {
        lal k = new lal();
        boolean b = false;
        while (!b) {
            k.takeuserinput();
            b = k.iscorrectnumber();
        }
    }
}
