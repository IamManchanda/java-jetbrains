package com.harrymanchanda;

public class PersonalComputer {
    /**
     * Variables
     */
    private Chassis chassis;
    private Monitor monitor;
    private Motherboard motherboard;

    /**
     * Constructors
     */
    public PersonalComputer(Chassis chassis, Monitor monitor, Motherboard motherboard) {
        this.chassis = chassis;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    /**
     * Methods
     */
    public void powerUp() {
        chassis.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1500, 1200, "red");
        motherboard.loadProgram("Mac OSX High Sierra");
    }
}
