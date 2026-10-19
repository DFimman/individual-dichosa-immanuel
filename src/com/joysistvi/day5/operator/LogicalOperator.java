package com.joysistvi.day5.operator;

public class LogicalOperator {
    public static void main(String[] args) {

        // Compound Conditional Statement
        int num = 10;
        int num2 = 20;
        System.out.println(num > num2 && num < num2); // AND operator
        System.out.println(num > num2 || num < num2); // OR operator

        // example
        int age = 19;
        boolean isJuniorHigh = age >= 13 && age <= 17;
        System.out.println("You are in Junior High: " + isJuniorHigh);
    }
}
