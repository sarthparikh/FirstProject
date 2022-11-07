package com.pragra.Day9;

import java.lang.reflect.Array;

public class SumArray {
    public static void main(String[] args) {
        int marks []= {20,25,30,35,40,45};
       int totalmarks=0;
       for (int i=0;i< marks.length;i++){
           totalmarks+=marks[i];
       }
        System.out.println(totalmarks);
    }
}
