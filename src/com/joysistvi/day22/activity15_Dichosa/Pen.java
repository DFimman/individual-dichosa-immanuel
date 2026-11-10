package com.joysistvi.day22.activity15_Dichosa;

public class Pen {
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

    public void write() {
        System.out.println("Writing with a pen.");
    }

    @Override
    public String toString() {
        return  "brand: " + brand + "\n" +
                "color: " + color + "\n" +
                "weightInGrams: " + weightInGrams + "\n";
    }
}
