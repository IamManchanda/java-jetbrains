package com.harrymanchanda;

public class Main {
    public static void main(String[] args) {
        for (double i = 1.0; i <= 8.0; i += 0.5) {
            System.out.println(i + "% interest for 10,000 is " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
