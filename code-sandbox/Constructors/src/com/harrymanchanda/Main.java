package com.harrymanchanda;

public class Main {
    public static void main(String[] args) {
        Account harrysAccount = new Account("12345", 0.0, "Harry Manchanda", "harmanmanchanda182@gmail.com", "(+91) 1234567890");
        harrysAccount.withdrawal(100.0);
        harrysAccount.deposit(50.0);
        harrysAccount.withdrawal(100.0);
        harrysAccount.deposit(51.0);
        harrysAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "(+61) 1234567890");
        System.out.println("timsAccount account number: " + timsAccount.getNumber());
        System.out.println("timsAccount customer name: " + timsAccount.getCustomerName());
    }
}
