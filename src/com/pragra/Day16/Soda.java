package com.pragra.Day16;

abstract class Soda {

    abstract void flavor();
    abstract void color();
}

class Pepsi extends Soda{

    @Override
    void flavor() {
        System.out.println("It has a sweet cola flavor");
    }

    @Override
    void color() {
        System.out.println("The color is dark brown");

    }

    class Fanta extends Soda{
        @Override
        void flavor() {
            System.out.println("It has a tangy orangy flavor");
        }

        @Override
        void color() {
            System.out.println("It has a dark orange color");
        }
    }

    class Limca extends Soda{
        @Override
        void flavor() {
            System.out.println("It has lemon flavor");
        }

        @Override
        void color() {
            System.out.println("It has a white color");

        }
    }
    public class testmain {
        public void main(String[] args) {
            Soda soda=new Limca();
        }

    }
}