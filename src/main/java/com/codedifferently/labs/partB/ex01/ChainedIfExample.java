package com.codedifferently.labs.partB.ex01;

public class ChainedIfExample {
    public static String incomeAndTax(){
        String response = "";

        double income = 30000, tax;
        if (income <= 15000) {
            tax = 0;

        } else if (income <= 25000) {
            tax = 0.05 * (income - 15000);

        } else {
            tax = 0.05 * (income - (25000 - 15000));
            tax += 0.10 * (income - 25000);

        }
        response += income + tax;

        return response;
    }
    public static void main(String args[]) {
        String totalOutput = incomeAndTax();
        System.out.println(totalOutput);
    }
}
