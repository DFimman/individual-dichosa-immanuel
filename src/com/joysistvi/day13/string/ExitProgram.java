package com.joysistvi.day13.string;
import java.util.Scanner;

public class ExitProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exit Program
        System.out.println("Are you sure that you want to exit the program?");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");

        System.out.println("\nEnter your choice: ");
        String choice = String.valueOf(scanner.nextLine().trim().charAt(0)) ;

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Returning Back to Main Menu");
        }
    }
}
