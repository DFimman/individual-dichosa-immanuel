package com.joysistvi.day3.variable;

public class Variable {

    public static void main(String[] args) { // main method
        System.out.println("* Hello World! *"); // print statement
        // initialize a var
        byte age = 23;
        short num = 129;
        int num2 = 800000000;
        long num3 = 999999999999999999L;
        //System.out.println(age);

        float ave = 99.90f;
        double price = 10.5251151;
        System.out.println(price);

        boolean is_Funny = true;
        //re-assign var
        is_Funny = false;
        System.out.println(is_Funny);

        char middleInitial = 'F';
        System.out.println(middleInitial);

        String firstName = "Immanuel";
        String lastName = "Dichosa";
        System.out.println(firstName + " " + lastName);

        // Full Name: Dichosa, Immanuel F.
        // Concatenation (+) -> joining strings
        System.out.println("Full Name: " + lastName + ", " +  firstName + " " + middleInitial + ".");
    }
}

