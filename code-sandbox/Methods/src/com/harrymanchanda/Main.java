package com.harrymanchanda;

public class Main {
    public static void main(String[] args) {
        int harryScore = calculateScore(true, 800, 5, 100);
        System.out.println("Harry's score is " + harryScore);

        int larryScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Larry's score is " + larryScore);
    }

    public static int calculateScore(
            boolean gameOver,
            int score,
            int levelCompleted,
            int bonus
        ) {
            if (gameOver) {
                int finalScore = score + (levelCompleted + bonus);
                finalScore += 1000;
                return finalScore;
            }
            return -1;
    }
}
