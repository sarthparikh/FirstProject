package com.pragra.Practice;

import java.util.Random;

public class SumOf2DArray {

    public static void main(String[] args) {
        int[][] arr=new int[3][5];

        Random r=new Random();
        int s;
        for (int i=0; i< arr.length;i++)
        {
            s=0;
            for(int j=0; j<arr[i].length;j++)
            {
                arr[i][j]=r.nextInt(100);
                s=s+arr[i][j];
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
            System.out.println("sum of student " +i +"  is " +s);
            }
        }
    }

