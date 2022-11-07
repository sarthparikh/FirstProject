package com.pragra.Day9;

import java.util.Scanner;

public class Greatest {

    public static void main(String[] args) {
        //int arr[]={1,3,4,6,5};
        Scanner Sc = new Scanner(System.in);
     int arr[] = new int[5];
        for( int i=0; i<arr.length;i++)
        {
            System.out.println("Enter the number");
            arr[i]=Sc.nextInt();
        }
        int max=arr[0];
       for (int i=0; i< arr.length;i++){

           if (arr[i]>max)
               max=arr[i];
       }
        System.out.println(max);
    }
}
