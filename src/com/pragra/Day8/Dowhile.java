package com.pragra.Day8;

import java.util.Scanner;

import static java.lang.Math.random;

public class Dowhile {
    public static void main(String[] args) {
        System.out.println("let's play the guessing game");
        //System.out.println(Math.random() * 100);
        int thoughtno = (int) (random() * 10);
        System.out.println("I have thought this number.. you try guessing it");
        Scanner sc = new Scanner(System.in);
        int guessedno;
        do{
            System.out.println("Guess Your Number");
            guessedno=sc.nextInt();
        }while(thoughtno!=guessedno);
        System.out.println("you win, guessed right");
    }
}
