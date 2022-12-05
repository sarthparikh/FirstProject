package com.pragra.Day13;

public class BankMain {
    public static void main(String[] args) {

        Bank bank= new TdBank();
        System.out.println(
                bank.rateOfInterest());
         bank = new BmoBank();
        System.out.println(bank.rateOfInterest());
        bank = new ScotiaBank();
        System.out.println(bank.rateOfInterest());
    }
}
