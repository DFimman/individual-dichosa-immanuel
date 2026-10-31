package com.joysistvi.day13.string;
import java.util.Scanner;

public class ExitProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exitMethod();
        scanner.close();
    }

    public static void exitMethod(){
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


