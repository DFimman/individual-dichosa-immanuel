package com.joysistvi.day3.variable;

public class Activity1_Dichosa {

    public static void main(String[] args) {
        // for true and false values -> boolean
        boolean isGood = true;

        // for whole number
        byte byteNum = 120;
        short shortNum = 9999;
        int intNum = 300_999_999;
        long longNum = 99999999999L;

        // for numbers with decimal
        float floatNum = 6.7f;
        double doubleNum = 120.67676776d;

        // for a single character or series of character
        char charVar = 'a';
        String stringVar = "This is a string";

        // printing the values with corresponding data type
        System.out.println("This is a boolean: " + isGood);
        System.out.println("This is a byte: " + byteNum);
        System.out.println("This is a short: " + shortNum);
        System.out.println("This is an int: " + intNum);
        System.out.println("This is a long: " + longNum);
        System.out.println("This is a float: " + floatNum);
        System.out.println("This is a double: " + doubleNum);
        System.out.println("This is a char: " + charVar);
        System.out.println("This is a String: " + stringVar);

    }
}
