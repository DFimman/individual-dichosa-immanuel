package com.joysistvi.day14.math;

import java.util.Arrays;

public class Activity11_Dichosa {
    public static void main(String[] args) {
        //DEMO FOR EACH METHOD
        System.out.println("===========================================");
        System.out.println("=          DEMO FOR EACH METHODS          =");
        System.out.println("===========================================");

        // abs() method - > absolute value
        //      - used to get the absolute value of an integral literal
        System.out.println("\n========== Math.abs() method ==========");
        int number = -67;
        double number2 = -5124115.5151D;

        System.out.println("These are my numbers: " + number + ", " + number2);
        System.out.println("Absolute Values: " + number + ", " + number2);

//        Math.max() → maximum of two values
        //      - used to get the maximum value between two values (integral literals)
        System.out.println("\n========== Math.max() method ==========");
        double[] myNumbers = {123.23, 4125, 952.0, 4260};
        double highestNumber = myNumbers[0];

        System.out.println("My numbers: " +  Arrays.toString(myNumbers));
        for (int i = 0; i < myNumbers.length; i++){
            highestNumber = Math.max(highestNumber, myNumbers[i]); // gets the high value between two number every new iteration
        }
        System.out.println("My highest number: " + highestNumber);

//        Math.min() → minimum of two values
        //      - opposite of Math.max()
        //      - to get the minimum value between two values (integral literals)
        System.out.println("\n========== Math.min() method ==========");
        double lowestNumber = myNumbers[0];

        System.out.println("My numbers: " +  Arrays.toString(myNumbers));
        for (int i = 0; i < myNumbers.length; i++){
            lowestNumber= Math.min(lowestNumber, myNumbers[i]);
        }
        System.out.println("My highest number: " + highestNumber);

//        Math.pow() → power (exponentiation)
        //      - used to get the power of x to the power of y
        //      - return value is always double literal, arguments should always be double
        System.out.println("\n========== Math.pow() method ==========");
        int number3 = 2;
        double number4 = 4;
        double number5 = 5;
        double number6 = 3;
        //int number5 = Math.pow(number3, number4); error, should pass double data type
        double resultPower = Math.pow(number5, number6);
        double resultPower2 = Math.pow(number6, number5);

        System.out.println("The result of " + number5 + " raise to " + number6 + ": " + resultPower);
        System.out.println("The result of " + number6 + " raise to " + number5 + ": " + resultPower2);

//        Math.sqrt() → square root
        //      - opposite of power
        //      - returns the square root value of an integral literal
        System.out.println("\n========== Math.sqrt() method ==========");
        System.out.println("The square root of " + number4 + ": " + Math.sqrt(number4));
        System.out.println("The square root of " + number5 + ": " + Math.sqrt(number5));


//        Math.round() → round to nearest integer
        //      - returns the rounded value of an integral
        //      - returns int data type
        System.out.println("\n========== Math.round() method ==========");
        System.out.println("The rounded value of " + number2 + ": " + Math.round(number2));

//        Math.ceil() → round up (ceiling)
        //      - returns the rounded up value of an integral regardless of decimal value
        System.out.println("\n========== Math.ceil() method ==========");
        System.out.println("The rounded up value of 10.3: " + Math.ceil(10.3));
        System.out.println("The rounded up value of 11.0: " + Math.ceil(11.0));


//        Math.floor() → round down (floor)
        //      - returns the rounded down value of an integral regardless of decimal value
        System.out.println("\n========== Math.floor() method ==========");
        System.out.println("The rounded down value of 10.9999: " + Math.ceil(10.9999));
        System.out.println("The rounded down value of 1251.515124: " + Math.ceil(1251.515124));


//        Math.random() → random number between 0.0 and 1.0
        //      - used as a part of a formula to get a random number between anything user wants
        //      - 1 is exclusive, but 0 is inclusive
        //      - returns doubles
        System.out.println("\n========== Math.random() method ==========");
        for (int i = 0; i < 3; i++){
            int myRandomNumber = (int) (Math.random() * 100) + 1; // gives out a random number between 1 - 10
            System.out.println("Random Number: " + myRandomNumber);
        }

//        Math.log() → natural logarithm (base e)
        //      - returns the natural log of a number (base E) of x
        //      - always returns double
        System.out.println("\n========== Math.log() method ==========");
        System.out.println("Log of 6: " + Math.log(6));
        System.out.println("Log of " + Math.E + ": " + Math.log(Math.E));
        System.out.println("Log of 2: " + Math.log(2));
        System.out.println("Log of 1: " + Math.log(1));
        System.out.println("Log of 0: " + Math.log(0));
        System.out.println("Log of -1: " + Math.log(-1));

//        Math.log10() → logarithm base 10
        //      - returns the bae 10 log of the passed value
        //      - always returns double
        System.out.println("\n========== Math.log10() method ==========");
        System.out.println("Log10 of 120: " + Math.log10(120));
        System.out.println("Log10 of 10: " + Math.log10(10));
        System.out.println("Log10 of 3.1623: " + Math.log10(3.1623));


//        Math.exp() → exponential function (e^x)
        //      - returns e raised to the power of a number (e^x)
        //      - e is the base of the natural system of logarithms (approximately 2.718282)
        //      - In Java, the value of e is available as the constant Math.E.
        System.out.println("\n========== Math.exp() method ==========");
        System.out.println("Exponential function of e^0: " + Math.exp(0));
        System.out.println("Exponential function of e^1: " + Math.exp(1));
        System.out.println("Exponential function of e^10: " + Math.exp(10));
        System.out.println("Exponential function of e^4.8: " + Math.exp(4.8));
        System.out.println("Exponential function of e^e: " + Math.exp(Math.E));

//        Math.sin() → sine of an angle (in radians)
        //      - Returns the sine of x (x is in radians)
        //      - Returns double data type
        System.out.println("\n========== Math.sin() method ==========");
        System.out.println("sin of 0.785398 radians: " + Math.sin(0.785398));
        System.out.println("sin of 1.5708 radians: " + Math.sin(1.5708));
        System.out.println("sin of 0 radians: " + Math.sin(0));
        System.out.println("sin of 3.14 radians: " + Math.sin(Math.PI));


//        Math.cos() → cosine of an angle (in radians)
        //      - Returns the cosine of x (x is in radians)
        //      - Returns double data type
        System.out.println("\n========== Math.cos() method ==========");
        System.out.println("cos of 0.785398 radians: " + Math.cos(0.785398));
        System.out.println("cos of 1.5708 radians: " + Math.cos(1.5708));
        System.out.println("cos of 0 radians: " + Math.cos(0));
        System.out.println("cos of 3.14 radians: " + Math.cos(Math.PI));


//        Math.tan() → tangent of an angle (in radians)
        //      - Returns the tan of x (x is in radians)
        //      - Returns double data type
        System.out.println("\n========== Math.tan() method ==========");
        System.out.println("tan of 0.785398 radians: " + Math.tan(0.785398));
        System.out.println("tan of 1.5708 radians: " + Math.tan(1.5708));
        System.out.println("tan of 0 radians: " + Math.tan(0));
        System.out.println("tan of 3.14 radians: " + Math.tan(Math.PI));
    }
}
