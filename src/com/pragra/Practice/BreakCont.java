package com.pragra.Practice;

public class BreakCont {
    public static void main(String[] args) {

        for( int i=1; i<=10; i++){
            System.out.println("Start " + i);
            if(i==5){
                continue;}
            System.out.println("End " + i);
        }
    }
}

