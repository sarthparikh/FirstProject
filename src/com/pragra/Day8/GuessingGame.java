package com.pragra.Day8;

import static java.lang.Math.*;
import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("let's play the guessing game");
        //System.out.println(Math.random() * 100);
        int a = (int)(random()*10);
        System.out.println("I have thought this number.. you try guessing it" );
        Scanner sc = new Scanner(System.in);
   while(true) {
       int b = sc.nextInt();
       if (a == b) {
           System.out.println("You guessed right .. You win");
       } else {
           System.out.println("You were wrong .. Try guessing again");
           break;
       }
   }
    }

}
