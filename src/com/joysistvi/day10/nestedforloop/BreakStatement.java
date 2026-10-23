package com.joysistvi.day10.nestedforloop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){

            if (i == 4) {
                // break; // terminate loop
               continue; // skip iteration
            }
            System.out.println(i + " Hello!");
        }
    }
}
