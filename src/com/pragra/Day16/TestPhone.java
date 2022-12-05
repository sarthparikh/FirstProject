package com.pragra.Day16;

//interface ....

interface Pager{
     void ringNotification();
}

interface AlarmClock extends Pager{
    void setAlarm();
}

interface Telephone extends Calculator{
    void makeCalls();
}

interface Calculator extends AlarmClock{
    void makeCalculations();
}

class Mobile implements Pager,Telephone,AlarmClock,Calculator{
    @Override
    public void ringNotification() {
        System.out.println("We can ring notification");
    }

    @Override
    public void makeCalls() {
        System.out.println("talk");
    }

    @Override
    public void setAlarm() {
        System.out.println("ere");
    }

    @Override
    public void makeCalculations() {
        System.out.println("dsd");
    }
}

public class TestPhone {
    public static void main(String[] args) {
        Telephone telephone=new Mobile();

        telephone.setAlarm();
        telephone.ringNotification();

    }
}
