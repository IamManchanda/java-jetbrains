package com.harrymanchanda;

public class Monitor {
    /**
     * Variables
     */
    private String model;
    private String manufacturer;
    private int size;
    private Resolution resolution;

    /**
     * Constructors
     */
    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    /**
     * Methods
     */
    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color: " + color);
    }

    /**
     * Getters
     */
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getresolution() {
        return resolution;
    }

    /**
     * Setters
     */
    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setresolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
