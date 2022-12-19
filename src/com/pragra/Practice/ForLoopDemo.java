package com.pragra.Practice;
import java.util.Scanner;
import java.math.*;
public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner sc=new Scanner(System.in);
      long a = sc.nextInt();
        long fact=1;
        for( long i=1;i<=a;i++){
        fact*=i;
        }
        System.out.println(fact);
    }

}
