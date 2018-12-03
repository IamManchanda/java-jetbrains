package com.harrymanchanda;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Jewel", 3, 10, 3, 2, 1);
        fish.swim(3);      
    }
}
