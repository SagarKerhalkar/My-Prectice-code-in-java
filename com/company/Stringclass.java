package com.company;

import java.util.Locale;

public class Stringclass {
    public static void main(String[] args) {
        String a = "  Shri Ram   ";
        System.out.println(a);
        int va = a.length();
        System.out.println(va);
        String l = a.toLowerCase();
        System.out.println(l);
        String U = a.toUpperCase();
        System.out.println(U);
        System.out.println(a.trim());
        String T = a.trim();
        System.out.println(T);
        System.out.println(a.substring(6));
        System.out.println(a.substring(2,6));
        System.out.println(a.replace('R','S'));
        System.out.println(a.replace("Ram","Ganesh"));
        System.out.println(a.startsWith("  Shri"));
        System.out.println(a.endsWith("Ram   "));
        System.out.println(a.charAt(9));
        System.out.println(a.indexOf("r"));
        System.out.println(a.lastIndexOf(" "));
        System.out.println(a);
        System.out.println(a.lastIndexOf(" ",10));

    }
}
