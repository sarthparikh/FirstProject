package com.pragra.Day9;

import java.util.Arrays;
import java.util.Random;

public class Array2DDemo {
    public static void main(String[] args) {


        int marks[][] = new int[3][5];
        Random random = new Random();
        for (int i = 0; i < marks.length; i++) {
            int total=0;
            for (int j = 0; j < marks[i].length; j++) {
                marks[i] [j]=random.nextInt(10);
                total+=marks[i][j];
            }
            System.out.println(total);
        }


        }
}
