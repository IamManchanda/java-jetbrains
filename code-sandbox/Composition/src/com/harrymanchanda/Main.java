package com.harrymanchanda;

public class Main {
    /**
     * Main Method
     */
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Resolution resolution = new Resolution(2540, 1440);
        Chassis chassis = new Chassis("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch iMac", "Apple", 27, resolution);
        Motherboard motherboard = new Motherboard("BJ-200", "Intel", 4, 6, "v2.44");
        PersonalComputer personalComputer = new PersonalComputer(chassis, monitor, motherboard);
        personalComputer.powerUp();
    }
}
