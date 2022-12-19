package com.pragra.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<=4;i++ )
        {
            System.out.println("Enter Marks");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
}
