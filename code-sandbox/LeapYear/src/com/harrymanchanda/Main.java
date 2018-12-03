package com.harrymanchanda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Scanner for Input and save it in year variable
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = scanner.nextInt();
        scanner.close();

        /**
         * Create an `isLeap` boolean and test `year` out with conditions:
         * Check whether `year` is divisible by 400, set `isLeap` to true if its the case
         * Check whether `year` is divisible by 100, set `isLeap` to true if its the case
         * Check whether `year` is divisible by 4, set `isLeap` to true if its the case
         */

        boolean isLeap = false;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        /**
         * Test out `isLeap`
         * If truthy, println `"Year "+ year +" is a Leap Year"`
         * If falsy, println `"Year "+ year +" is not a Leap Year"`
         */

        if (isLeap) {
            System.out.println("Year "+ year +" is a Leap Year");
        } else {
            System.out.println("Year "+ year +" is not a Leap Year");
        }
    }
}
