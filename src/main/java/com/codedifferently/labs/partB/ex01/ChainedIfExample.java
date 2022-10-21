package com.codedifferently.labs.partB.ex01;

public class ChainedIfExample {
    public static void main(String args[]) {
        double income = 30000, tax;
        if (income <= 15000) {
            tax = 0;

        } else if (income <= 25000) {
            tax = 0.05 * (income - 15000);

        } else {
            tax = 0.05 * (income - (25000 - 15000));
            tax += 0.10 * (income - 25000);

        }
    }
}
