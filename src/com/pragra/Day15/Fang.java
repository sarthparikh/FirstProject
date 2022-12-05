package com.pragra.Day15;

public class Fang {
    String firstName;
    String lastName;
    String email;


    public void registerStudent(String firstName, String lastName)
    {
        System.out.println( firstName+lastName);


    }
    public void registerStudent(String firstName, String lastName,
                                String email){
        System.out.println("Student register with" +firstName +lastName +email);


    }
}
