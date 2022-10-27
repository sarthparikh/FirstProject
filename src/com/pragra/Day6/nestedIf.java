package com.pragra.Day6;

public class nestedIf {
    public static void main(String[] args) {
testMonthDays((1));
    }

    public static void testMonthDays(int month) {
        if (month == 1) {
            System.out.println("31");
        } else if (month == 2) {
            System.out.println("31");
        } else if (month == 3) {
            System.out.println("31");
        } else if (month == 4) {
            System.out.println("31");
        } else if (month == 5) {
            System.out.println("31");
        } else {
            System.out.println("Input Error");
        }

    }
}
