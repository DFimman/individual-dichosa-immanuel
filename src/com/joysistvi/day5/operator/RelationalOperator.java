package com.joysistvi.day5.operator;

public class RelationalOperator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // less than
        boolean result = num1 < num2;
        System.out.println(result);

        // greater than
        boolean result2 = num1 > num2;
        System.out.println(result2);

        // less than and equal to
        boolean result3 = num1 <= num2;
        System.out.println(result3);

        // greater than and equal to
        boolean result4 = num1 >= num2;
        System.out.println(result4);

        // equal to (==)
        boolean result5 = num1 == num2;
        System.out.println(result5);

        // not equal to (!=)
        boolean result6 = num1 != num2;
        System.out.println(result6);

        // example
        int age = 21;
        boolean isValidAge = age >= 18;
        System.out.printf("Is valid age? %b", isValidAge);

    }
}