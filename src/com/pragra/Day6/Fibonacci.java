package com.pragra.Day6;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int c = 0;
        int a = 0;
        int b = 1;
        int j;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number of Digits You Need For Fibonacci Series : ");
        j=sc.nextInt();
        for ( int i = 1; i <= j; i++) {
            a = b;
            b = c;
            System.out.println(c);
            c = a + b;


        }

    }
}
