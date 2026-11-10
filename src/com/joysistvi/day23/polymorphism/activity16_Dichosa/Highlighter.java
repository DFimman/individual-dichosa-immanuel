package com.joysistvi.day23.polymorphism.activity16_Dichosa;

public class Highlighter extends Pen {

    private String inkType;

    public Highlighter(String brand, String color, String inkType, double weightInGrams){
        super(brand, color, weightInGrams);
        this.inkType = inkType;
    }

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    @Override
    public void write() {
        System.out.println("Writing with a Highlighter.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the highlighter ink.");
    }

    @Override
    public String toString() {
        return  "Type: Highlighter \n" +
                super.toString() +
                "\nInk Type: " + inkType;
    }
}
