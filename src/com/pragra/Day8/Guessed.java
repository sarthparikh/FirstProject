package com.pragra.Day8;

import java.util.Scanner;

import static java.lang.Math.random;

public class Guessed {
    public static void main(String[] args) {
        System.out.println("let's play the guessing game");
        //System.out.println(Math.random() * 100);
        int thoughtno = (int) (random() * 10);
        System.out.println("I have thought this number.. you try guessing it");
        Scanner sc = new Scanner(System.in);
        int guessedno = sc.nextInt();
        while (thoughtno != guessedno) {
            System.out.println("Your guess was wrong .. guess again");
            guessedno = sc.nextInt();
        }

        System.out.print("you win guessed right");
    }

}


