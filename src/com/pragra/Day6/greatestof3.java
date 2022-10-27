package com.pragra.Day6;

import java.util.Scanner;


public class greatestof3 {
    public static void main(String[] args) {
        int x=10;
        System.out.println("Enter A Number: ");
        Scanner sc = new Scanner(System.in);
        int capturedInput = sc.nextInt();
        System.out.println(capturedInput);
        //greatestofnumber(13, 12, 11);
        //checkIlligible(true);
    }

    public static void checkIlligible(boolean isactive) {
        if (isactive) {
            System.out.println("eligible");
        }

    }

    public static void greatestofnumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("Largest Number is " + a);
        } else if (b >= c && b >= a) {
            System.out.println("largest Number is " + b);
        } else {
            System.out.println("largest Number is " + c);
        }

    }

}