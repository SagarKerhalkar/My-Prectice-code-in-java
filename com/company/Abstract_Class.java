package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Abstract_Class {
    public static void main(String[] args) {
        File myfile = new File("D:\\File folder");
        File filesList[] = myfile.listFiles();
        for (File file:filesList){
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
        }
       myfile = new File("D:\\File folder\\Sagar.txt");

//        try {
//            myfile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Having error ");
//            e.printStackTrace();
//        }


        //File myfile = new File("D:\\File folder\\Chat.txt");
        Scanner sc;

        {
            try {
                sc = new Scanner(myfile);
                while (sc.hasNext()) {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
