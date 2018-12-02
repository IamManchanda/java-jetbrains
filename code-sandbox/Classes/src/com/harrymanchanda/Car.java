package com.harrymanchanda;

public class Car {
    private String model;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("ciaz")) {
            this.model = model;
        } else {
            this.model = null;
        }
    }

    public String getModel() {
        return this.model;
    }
}
