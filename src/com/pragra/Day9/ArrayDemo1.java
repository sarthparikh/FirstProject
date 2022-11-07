package com.pragra.Day9;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int [] arr= new int[5];

            for (int i=0;i<=4;i++)
            {
                System.out.println("enter marks");
                arr[i]= sc.nextInt();
            }
        for (int i=0;i<=4;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        //int [] marks = {2,4,6,8};
        //int [] marks1= new int[] {1,3,5,7};

    }
}
