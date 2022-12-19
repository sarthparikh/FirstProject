package com.pragra.Practice;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int [][] arr = new int[3][5];
        Random random=new Random();
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j]=random.nextInt(100);
            }
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0;j<5;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
