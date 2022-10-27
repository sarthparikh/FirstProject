package com.pragra.Day6;

public class oddEven {
    public static void main(String[] args) {

        testEvenorOdd(9);
    }

    public static void testEvenorOdd(int x)
    {
        if(x%2==0)
    {
        System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }
    }
}