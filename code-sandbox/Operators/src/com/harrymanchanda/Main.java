package com.harrymanchanda;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);
        
        int previousResult = result;
        result = result - 1;
        System.out.println("Prev: " + previousResult);
        System.out.println("Result: " + result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("You are not an Alien");
        } else {
            System.out.println("You are an Alien");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You are not 100");
        } else {
            System.out.println("You are 100!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater then Top Score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these tests is true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        String logCar = (isCar) ? "Car is here." : "Car is not here.";
        System.out.println(logCar);
    }
}
