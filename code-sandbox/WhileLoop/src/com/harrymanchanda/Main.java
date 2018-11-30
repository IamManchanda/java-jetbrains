package com.harrymanchanda;

public class Main {
    public static void main(String[] args) {
        /* For Loop */
        for (int i = 1; i <= 5; i += 1) {
            System.out.println("Count value with for loop is " + i);
        }

        /* While Loop */
        int count = 1;
        while (count <= 5) {
            System.out.println("Count value with while loop is " + count);
            count += 1;
        }

        /* Do while loop */
        int num = 1;
        do {
            System.out.println("Count value with do while loop was " + num);
            num += 1;
        } while (num <= 5);
    }
}
