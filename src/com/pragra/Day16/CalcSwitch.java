package com.pragra.Day16;

import java.util.Scanner;

public class CalcSwitch {

    public static void main(String[] args) {

        boolean x=true;
int a,b;
        do {
            System.out.println("Choose the option");
            System.out.println("0: To Exit");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            Scanner sc2 = new Scanner(System.in);
            int i = sc2.nextInt();
            switch (i){
                case 0:
                    System.out.println("Exit");
                    x=false;
                    break;
                case 1:
                    System.out.println("Enter your first Number");
                    Scanner sc = new Scanner(System.in);
                    a=sc.nextInt();
                    System.out.println("Enter your second number");
                    Scanner sc1 = new Scanner(System.in);
                    b=sc.nextInt();
                    System.out.println("addition of two numbers: "+(a+b));
                    break;
                case 2:
                    System.out.println("Enter your first Number");
                    Scanner sc3 = new Scanner(System.in);
                    a=sc3.nextInt();
                    System.out.println("Enter your second number");
                    Scanner sc4 = new Scanner(System.in);
                    b=sc4.nextInt();
                    System.out.println("Subtraction of two numbers: "+(a-b));
                    break;
                case 3:
                    System.out.println("Enter your first Number");
                    Scanner sc5 = new Scanner(System.in);
                    a=sc5.nextInt();
                    System.out.println("Enter your second number");
                    Scanner sc6 = new Scanner(System.in);
                    b=sc6.nextInt();
                    System.out.println("addition of two numbers: "+(a*b));
                    break;
                case 4:
                    System.out.println("Enter your first Number");
                    Scanner sc7 = new Scanner(System.in);
                    a=sc7.nextInt();
                    System.out.println("Enter your second number");
                    do {
                        Scanner sc8 = new Scanner(System.in);
                        b = sc8.nextInt();
                        if(b==0){
                            System.out.println("Denominator cant be zero");
                            System.out.println("Enter your Second Number Again");}
                    }while(b==0);
                    System.out.println("Division of two numbers: " + (a / b));
                    break;

                default:
                    System.out.println("Please choose the correct Option");
                    break;

}
        } while (x);
        System.out.println("Thank you for using Calculator");
    }
}