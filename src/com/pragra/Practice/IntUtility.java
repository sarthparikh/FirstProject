package com.pragra.Practice;

public class IntUtility {

    public static void main(String[] args) {
        int x =10;
        Integer y=10;
      String w="12344";
        //processing the integer operation in a number
        // stored in a String format

//        int i1 = Integer.parseInt(w);
//        int i = i1;
//        int sum=x+i;
//        System.out.println(sum);
//
//        Integer integer = Integer.valueOf(123);
//       test(integer);
       Integer b=10;
        int i2 = b.intValue();
        Integer integer=2;
        test(integer.intValue());

    }
    public static void test(Integer x){
        System.out.println(x);
    }
}
