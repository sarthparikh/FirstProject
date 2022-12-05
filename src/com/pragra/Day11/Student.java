package com.pragra.Day11;

public class Student extends Object {
    // the very first line in any constructor is either a call to super() or a call to this()
    long id;
    String name;
    int grade;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Student(){
super();
        System.out.println("Default Constructor");
    }
    public  Student(int id){
        this();
        System.out.println("In constructor 1");
        this.id=id;
    }
   public  Student(int id, String name){
        this(id);
       System.out.println("In constructor 2");
        this.name=name;
    }
    public  Student(int id, String name, int grade){
        this(id,name);
        System.out.println("In Constructor 3");
        this.grade=grade;
    }

    public void study ()
    {

        System.out.println("I am studying"+id);
    }
    public void play ()
    {
        System.out.println(id);
    }
}

