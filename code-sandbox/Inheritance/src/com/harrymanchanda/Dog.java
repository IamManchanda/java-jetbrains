package com.harrymanchanda;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    /**
     * Constructor
     */
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    /**
     * Methods
     */
     private void chew() {
         System.out.println("Dog.chew() called");
     }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called.");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called.");
        move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called and is moving at " + speed);
    }

    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }

    /**
     * Getters
     */
    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }

    /**
     * Setters
     */
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }
}
