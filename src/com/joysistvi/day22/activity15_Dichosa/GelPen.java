package com.joysistvi.day22.activity15_Dichosa;

public class GelPen extends Ballpen{
    // data hiding
    private boolean isWaterProof;

    public GelPen(String brand, String color, double pointSize, double weightInGrams, boolean waterProof){
        super(brand, color, pointSize, weightInGrams);
        this.isWaterProof = waterProof;

    }

    GelPen(){}

    public boolean isWaterProof() {
        return isWaterProof;
    }

    public void setWaterProof(boolean waterProof) {
        this.isWaterProof = waterProof;
    }

    @Override
    public void write() {
        System.out.println("Writing with a GelPen");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nWaterproof: " + isWaterProof;
    }

}
