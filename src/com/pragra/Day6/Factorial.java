package com.pragra.Day6;

import java.util.*;
    public class Factorial {
        public static void main(String args[]) {
            double j,n;
                    double num=1;
            Scanner sc=new Scanner (System.in);
            System.out.print("Enter The Number : ");
            j=sc.nextInt();

            for(n=1;n<=j;n++) {
                num=n*num;

            }
            System.out.print("Factorial of Entered Number is: " +num);
        }
    }

