package com.joysistvi.day7.ifstatement;

public class ifElseStatement {

    public static void main(String[] args) {
        // Simple program of ternary
        /* int age = 18;

        String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        System.out.println(result);
        */

        String result = "";
        int age = 20;

        if (age >= 18) {
            result = "Valid Age";
        } else {
            result = "Invalid Age";
        }

        System.out.println("Result: " + result);
    }
}
