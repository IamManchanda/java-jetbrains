package com.harrymanchanda;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    /**
     * Constructor
     */
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    /**
     * Methods
     */
    private void moveMuscles(int speed) {
        System.out.println("Fish.moveMuscles() called and is moving at " + speed);
    }

    private void moveBackfin(int speed) {
        System.out.println("Fish.moveBackfin() called and is moving at " + speed);
    }

    public void swim(int speed) {
        moveMuscles(speed);
        moveBackfin(speed);
        super.move(speed);
    }

    /**
     * Getters
     */
    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }

    /**
     * Setters
     */
    public void setGills(int gills) {
        this.gills = gills;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }
}
