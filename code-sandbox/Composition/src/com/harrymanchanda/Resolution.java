package com.harrymanchanda;

public class Resolution {
    /**
     * Variables
     */
    private int width;
    private int height;

    /**
     * Constructors
     */
    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Getters
     */
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    /**
     * Setters
     */
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
