package com.pragra.Practice;

import java.util.Random;
import java.util.Scanner;

public class WhileSuperior {

    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(10);
        System.out.println(i);
        Scanner sc= new Scanner(System.in);
        int j;
        do {
            System.out.println("Keep Guessing");
            j = sc.nextInt();

        } while(j!=i);

        System.out.println("Guessed Number is equal to Lucky number");
    }

    }



