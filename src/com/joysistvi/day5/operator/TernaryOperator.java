package com.joysistvi.day5.operator;

public class TernaryOperator {
    public static void main(String[] args) {
        // example one
        int age = 20;
        String result = (age >= 18) ? "You are an adult" : "You are a minor!";


        System.out.println(result);

        // example two
        int num1 = 10;
        int num2 = 20;
        int bigger = (num1 > num2) ? num1 : num2;

        System.out.println("The bigger number is " + bigger);

        // example three
        int number = 10;
        String isEven = number % 2 == 0 ? "Even number" : "Odd number";

        System.out.printf("The number %d is an %s", number, isEven);
    }
}
