package com.joysistvi.day4.operator;

public class UrinaryOperator {
    public static void main(String[] args) {
        // negating an expression (-)
        int num = 10;
        System.out.println("Positive value: " + num);
        // used (-) before the name variable
        System.out.println("New assigned value: " + -num);

        // inverting a boolean (!)
        boolean isActive = true;
        System.out.println("Negated value " + !isActive); //false

        // increment/decrement a value by one (++) & (--)
        int num2 = 67;
        System.out.println("");
        System.out.println("Increment by 1: " + ++num2); //update value by increment of 1 then print -> 69
        System.out.println("Decrement by 1: " + --num2); //update value by decrement of 1 by new value then print -> 68

        int num3 = 120;
        System.out.println("");
        System.out.println("Print then Increment by 1: " + num3++); //print first then update value -> 120
        System.out.println("New increment value: " + num3); // incremented value ->> 121
        System.out.println("Print then Decrement by 1: " + num3--); //print first then update value -> 121
        System.out.println("New Decrement value: " + num3); // incremented value ->> 120
    }
}
