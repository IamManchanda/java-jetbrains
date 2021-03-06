package com.harrymanchanda;

public class Chassis {
    /**
     * Variables
     */
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    /**
     * Constructors
     */
    public Chassis(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    /**
     * Methods
     */
    public void pressPowerButton() {
        System.out.println("Power button pressed");
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

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
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

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
