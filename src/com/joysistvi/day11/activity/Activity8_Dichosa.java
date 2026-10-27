package com.joysistvi.day11.activity;
import java.util.Scanner;

public class Activity8_Dichosa {
    public static void main(String[] args) {
       // loop
        while (true) {

            int count = 0;
            int sum = 0;

            Scanner scanner = new Scanner(System.in); // call scanner

            int[] numbers = new int[5];  // declare array with integer elements

            System.out.println("\n--- My Numbers ---");
            // loop for user input
            for (int i = 0; i < numbers.length; i++){
                System.out.print("Enter Number " + (i+1) + ": ");
                numbers[i] = scanner.nextInt();

                // computer for sum
                sum += numbers[i];
            }

            // computer for average
            double ave = (double) sum / numbers.length;

            int highestNumber = numbers[0];
            int lowestNumber = numbers[0];

            System.out.println("\n-- Entered Numbers --");
            for (int number : numbers){
                count++;
                System.out.println("Number " + count +": " + number);

                // get highest number
                highestNumber = Math.max(number, highestNumber); // number > highestNumber ? number : highestNumber;

                // get lowest number
                lowestNumber = Math.min(number, lowestNumber); // number > lowestNumber ? number : lowestNumber;
            }

            // display calculations
            System.out.println("\n--- Basic Arithmetic ---");
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + ave);
            System.out.println("Highest Number: " + highestNumber);
            System.out.println("Lowest Number: " + lowestNumber);

            // loop condition to exit or continue

            System.out.print("\nWant to try again? [Y/N]: ");
            String select = scanner.next();

            switch (select) {
                case "y":
                case "Y":
                    System.out.println("Loading...\n");
                    break;
                case "N":
                case "n":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid.. Enter only Y/N. Will Exit now!");
                    return;
            }
        }
    }
}
