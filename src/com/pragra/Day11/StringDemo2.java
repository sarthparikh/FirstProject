package com.pragra.Day11;


import java.util.Arrays;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "richa".substring(3);
        String s2 = "ha";
        String S3= "   ffj ";
        String S4= "richsarer ";
        System.out.println(extracted(1,2,3));
        check("sa","sa");
        String S = "richa luthra abc.\n hello. \n bye";
        String[] s3 = S.split("\n");
        System.out.println(Arrays.toString(s3));
        System.out.println(S);
        System.out.println(S3.trim());
        System.out.println(S4.indexOf("r",4));
        String r="1232424";
        Integer y=10;
        int i = Integer.parseInt("123");
        System.out.println(i);

        Integer integer = Integer.valueOf("123");

        Integer x=10;
        int i1 = x.intValue();
        System.out.println(i1);
    }

    public static int extracted(int a, int b, int c) {
        return (a >= b && a >= c) ? a : b >= c && b >= a ? b : c;
    }
public static void check(String s1, String s2)
{
    if (s1==s2)
    System.out.println("Equal");
    else
        System.out.println("Not Equal");

}

    }
