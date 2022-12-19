package com.pragra.Practice;

import java.util.Scanner;

public class TotalOfArray {

    public static void main(String[] args) {
        //int[] marks=new int[4];
        int n, s = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc1.nextInt();
        int marks[] = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            s = s + marks[i];
        }
        System.out.println("Sum: " + s);
        System.out.println("Avg: " + s / marks.length);
    }
}
