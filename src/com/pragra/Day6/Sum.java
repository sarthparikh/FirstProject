package com.pragra.Day6;
import java.util.*;
public class Sum {
    public static void main(String args[]) {
        long sum=0;
        int n; int j;
        Scanner sc=new Scanner (System.in);
        System.out.print(" Sum of N numbers : ");
        j=sc.nextInt();

        for(n=1;n<=j;n++) {
            sum=sum+n;

        }
        System.out.print("Sum of N numbers: " +sum);
    }
}

