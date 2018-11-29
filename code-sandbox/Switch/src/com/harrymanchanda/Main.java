package com.harrymanchanda;

public class Main {
    public static void main(String[] args) {
        int value = 3;
        switch (value) {
            case 1:
                System.out.println("Value received is 1");
                break;
            case 2:
                System.out.println("Value received is 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value is either 3, 4, or 5");
                System.out.println("Value received is " + value);
                break;
            default:
                System.out.println("Value is not from 1 to 5");
                System.out.println("Value received is " + value);
                break;
        }
    }
}
