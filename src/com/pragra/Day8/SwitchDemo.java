package com.pragra.Day8;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Month No(1-12)");
        int monthNo = sc.nextInt();

        switch(monthNo){
            case 1:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("invalid");
        }


































    }
}
