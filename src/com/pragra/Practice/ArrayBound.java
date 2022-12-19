package com.pragra.Practice;

import java.util.Arrays;
import java.util.Random;

public class ArrayBound {


    public static void initializeArray(int[] args) {
        Random R = new Random();

        int marks[] = new int[5];

        for (int i = 0; i <marks.length; i++) {
        marks[i]= R.nextInt(10);
        }
        System.out.println(Arrays.toString(marks));
    }


    }


