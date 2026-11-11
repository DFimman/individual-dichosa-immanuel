package com.joysistvi.day24.abstraction.activty17_Dichosa;

public class Ballpen extends Pen implements Refillable, Clickable {

    // data hiding
    private double pointSize;

    public Ballpen(String brand, String color, double pointSize, double weightInGrams){
        super(brand, color, weightInGrams);
        this.pointSize = pointSize;

    }

    Ballpen(){}

    public double getPointSize() {
        return pointSize;
    }

    public void setPointSize(double pointSize) {
        this.pointSize = pointSize;
    }

    @Override
    public void write() {
        System.out.println("Writing with a ballpen.");
    }

    @Override
    public void refill() {
        System.out.println("Replacing the ballpen ink refill.");
    }

    @Override
    public void click() {
        System.out.println(CLICK_SOUND + " The ballpen tip comes out.");
    }

    @Override
    public String toString() {
        return  "Type: Ballpen \n" +
                super.toString() +
                "\npointSize: " + pointSize;
    }
}
