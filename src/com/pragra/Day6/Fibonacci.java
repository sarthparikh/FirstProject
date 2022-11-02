package com.pragra.Day6;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {

        int j;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number of Digits You Need For Fibonacci Series : ");
        j=sc.nextInt();
        for ( int i =1; i <= j; i++) {
            int a = 0;
           int  b = 1;
            int c = 0;
            for (int k = 1; k <= i; k++) {
                a = b;
                b = c;
                System.out.print(c+" ");
                c = a + b;
            }
            System.out.println();
        }
    }
}
