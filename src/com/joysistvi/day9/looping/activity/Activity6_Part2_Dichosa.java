package com.joysistvi.day9.looping.activity;

public class Activity6_Part2_Dichosa {
    public static void main(String[] args) {

        // outer loop
        for (int i = 1; i <= 10; i++){
            System.out.println("\nMultiplication Table of " + i); // display main header

            // inner loop for the multiplier
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
