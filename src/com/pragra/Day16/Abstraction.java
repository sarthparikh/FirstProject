package com.pragra.Day16;
import java.util.Scanner;
import java.lang.String;


abstract class Computer{
   //it should have min of 1 abstract
    abstract void calculate();
    abstract void playGames();
    public void surfWebsite(){

    }
}
class Playstations extends Computer{

    @Override
    void calculate() {
        System.out.println("calculating number of palyers");
    }

    @Override
    void playGames() {
        System.out.println("Can play fifa2023");

    }
}
public class Abstraction {
    public static void main(String[] args) {
// Computer computer = new Computer();// We cannot create object of abstract class
        Computer computer=new Playstations(); //We are creating object of playstations. Polymorphism
    }
}
