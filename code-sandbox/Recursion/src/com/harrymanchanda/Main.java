package com.harrymanchanda;

public class Main {

    /**
     * Main Method for running the program
     */

    public static void main(String[] args) {
        int number = 30;
        int sum = addNumbers(number);
        System.out.println("Total Sum after recursion: " + sum);
    }

    /**
     * addNumbers method for Recursion
     */

    public static int addNumbers(int num) {
        if (num != 0) {
            return num + addNumbers(num - 1);
        } else {
            return num;
        }
    }
}
