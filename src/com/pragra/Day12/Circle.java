package com.pragra.Day12;

public class Circle{
    int radius;
    double area;
    double circumference;
    public static final  double pi=3.14;

    public void CalcArea () {
        area=pi*radius*radius;
        System.out.println("Area is :"+area);
    }

    public void CalcCircumference()
        {
            circumference=2*pi*radius;
        System.out.println("Circumference is :" +circumference);
    }

}