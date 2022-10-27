package com.pragra.Day6;

public class positiveNeg {
    public static void main(String[] args) {
        posneg(0);
    }
    public static void posneg(int c){
        if(c>0)
        {
            System.out.println("Positive");
        }
        else if(c==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
