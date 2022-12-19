package com.pragra.Practice;

import java.util.Arrays;

public class Deed {
    public static void main(String[] args) {
        //String s1 = new String("sarth"); //7000 heap
        String s1=new String("sarth");
        System.out.println(s1.indexOf("a"));
        s1.replaceFirst(",",":");
        char[] chars = {'a','b'};
        chars=null;
        String s2 = "sarth";// 6000 pool
        String s3= "Sarth Dww twsw";
        String[] s = s3.split(" ");
        System.out.println(s1);
        System.out.println(Arrays.toString(s));
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
        //System.out.println(s1.equals(s2));
        //"sarth".toUpperCase(); //Instance Method
        //If a method is referenced after Class name it is Static
       // String.copyValueOf();
        check(s1, s2);
        System.out.println(check1(1,2,3 ));
    }

    private static int check1(int a,int b,int c) {
//        if(a>=b&&a>=c)
//            return a;
//        else if (b>=c&&b>=a)
//            return b;
//        else return c;

       return (a>=b && a>=c)? a: (b>=c && b>=a)? b :c;
    }

    public static void check(String s1, String s2){
      if (s1==s2){
          System.out.println("Hello");
      }
    }
}

class Employee {
}