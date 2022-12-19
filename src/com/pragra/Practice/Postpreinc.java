package com.pragra.Practice;


public class Postpreinc {
    public static void main(String[] args) {
        convertUpperCase("jinali");
    }

    public static void convertUpperCase(String s){
        if(s==null && s.isEmpty())
            System.out.println("Invalid Input");
        else
        System.out.println(s.toUpperCase());
    }

}
