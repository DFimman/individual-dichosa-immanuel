package com.joysistvi.day24.abstraction.activty17_Dichosa;

public abstract class Pen {
    // data hiding
    private String brand;
    private String color;
    private double weightInGrams;

    public Pen(String brand, String color, double weightInGrams){
        this.brand = brand;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    Pen(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public abstract void write();

    public void write(String text) {
        System.out.println("Writing \"" + text + "\" with a pen.");
    }

    public void write(String text, int times) {
        for (int i = 0; i < times; i++) {
            write(text);
        }
    }

    public void store() {
        System.out.println("Storing the pen in the pencil case.");
    }

    @Override
    public String toString() {
        return  "brand: " + brand + "\n" +
                "color: " + color + "\n" +
                "weightInGrams: " + weightInGrams;
    }
}
