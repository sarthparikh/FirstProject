package com.pragra.Day9;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Random r =new Random();
        int marks[] = new int[1000];
        for (int i=0; i<marks.length;i++)

        {
            marks[i]= r.nextInt( 10);
        }
        System.out.println(Arrays.toString(marks));
    }

    public static void initializeArray(int [] marks) {
        Random r = new Random();


    }
}