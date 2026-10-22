package com.joysistvi.day5.operator;

public class ArithmeticOperator {

    public static void main(String[] args) {
        // Concat strings
        String name = "Winter";
        System.out.println(name + " Wonder"); // Winter Wonder

        // Concat string with number
        System.out.println(name + 10 + 10); // Winter1010
        System.out.println(name + (10 + 10)); // add numbers in parentheses -> Winter20

        // Concat using char but will convert to ASCII
        char letter1 = 'A';
        char letter2 = 'B';
        char letter3 = 'C';
        System.out.println(letter1 + letter2 + letter3); // char are converted to ASCII value -> 198

        System.out.println("");
        int num1 = 30;
        int num2 = 25;

        // Addition (+)
        int sum = num1 + num2; // -> 55
        System.out.println("sum: " + sum);

        // Substraction (-)
        int difference = num1 - num2; // -> 5
        System.out.println("difference: " + difference);

        // Multiplication (*)
        int product = num1 * num2; // -> 750
        System.out.println("product: " + product);

        // Division (/)
        float quotient = (float) num1 / num2; // ->
        System.out.println("quotient: " + quotient);

        // Modulo (%)
        int remainder = num1 % num2; // -> 5
        System.out.println("remainder: " + remainder);

    }
}
