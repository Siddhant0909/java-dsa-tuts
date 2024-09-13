package com.gappu.access_control;

public class Chashma {
    double power;
    private String color;
    double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chashma(double power, String color, double price) {
        this.power = power;
        this.color = color;
        this.price = price;
    }
}

