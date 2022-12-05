package com.pragra.Day14;

public class Testadd {
    public static void main(String[] args) {
        Empl empl = new Empl(
                101,
                "sarth",
                "parikh",
                "Brampton"
        );
        empl.setDesignation("Engineer");
        empl.setEmailId("sd@yahoo.com");
        System.out.println(empl);
    }
}
