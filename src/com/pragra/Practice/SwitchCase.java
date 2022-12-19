package com.pragra.Practice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            default:
                System.out.println("Wrong Number Entered");
        }
    }
}
