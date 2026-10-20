package com.joysistvi.day6.ifstatement;
import java.util.Scanner;

public class Activity4_Dichosa {
    public static void main(String[] args) {
        // declaration and initiation
        int age;
        String category = "";

        //  Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        // input age
        System.out.print("Enter Age: ");
        age = scanner.nextInt();

        // display age
        System.out.println("\nAge: " + age);

        // age validation
        if (!(age >= 0 && age <= 100)){
            System.out.println("Age is invalid!");

            // specific errors
            category = (age > 100 || age < 0) ? "Age is out of range!" : "Not a number!";
            System.out.println("Error: " + category);
            // terminate program
            return ;
        }
        // categories for validated age
        else {
            if (age >= 0 && age <= 2){
                category = "Baby";
            } else if (age >= 3 && age <= 12) {
                category = "Child";
            } else if (age >= 13 && age <= 19) {
                category = "Teenager";
            } else if (age >= 20 && age <= 29) {
                category = "Young Adult";
            } else if (age >= 30 && age <= 59) {
                category = "Adult";
            } else if (age >= 60 && age <= 100) {
                category = "Senior";
            }
        }

        System.out.println("Age Category: " + category);
    }
}
