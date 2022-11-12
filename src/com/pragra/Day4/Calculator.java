package com.pragra.Day4;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("sum of two numbers is:"+sum(10.5,11.5));
        System.out.println("substraction of two number is:"+sub(10,15));
        System.out.println("Multiplication of two numbers is:"+mul(11.2,44.3));
        System.out.println("Division of two Numbers is:"+div(33.4,22.5));
        System.out.println("Vivek Changes");
    }

    public static double sum(double a,double b)  {
        return a+b;
    }

    public static double sub(double a, double b) {
        return a-b;

    }

    public static double div(double a,double b) {
        return a/b;

    }
    public static double mul(double a, double b) {
        return a*b;

    }

}
