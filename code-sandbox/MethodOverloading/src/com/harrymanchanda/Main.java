package com.harrymanchanda;

public class Main {
    public static void main(String[] args) {
        int harryScore = calculateScore("Harry Manchanda", 500);
        System.out.println("Harry's New Score: " + harryScore + " runs.\n");
        int anonScore = calculateScore(700);
        System.out.println("Anonymous's New Score: " + anonScore + " runs.\n");

        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("The Player " + playerName + " scored " + score + " runs.");
        return score + 100; // Return score with adding 100
    }

    public static int calculateScore(int score) {
        System.out.println("The Anonymous Player scored " + score + " runs.");
        return score + 50; // Return score with adding 100
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score... Get Lost");
        return 0; // Return score with adding 100
    }
}
