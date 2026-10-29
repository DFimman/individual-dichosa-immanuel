package com.joysistvi.day13.string;
import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {

        String word = "HeLlo";
        System.out.println("My Word: " + word + "\n");

        // charAt method
        char letter = word.charAt(2);
        System.out.println("letter: " + letter);

        // length method
        System.out.println("Length: " + word.length());

        // toUpperCase and toLowerCase method
        System.out.println("UpperCase: " + word.toUpperCase());
        System.out.println("LowerCase: " + word.toLowerCase());

        // charAt method use case
        String middleName = "Dichosa";
        System.out.println("\nMy Middle Name: " + middleName);
        char middleInitial = middleName.charAt(0);
        System.out.printf("Middle Initial: %s.", middleInitial);

        // concat method
        String newWord = word.concat(" World");
        System.out.println("\nMy new word: " + newWord);

        // equals / equalsIgnoreCase method
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure you really want to exit?" +
                "\n [Y] Yes - Exit Program" +
                "\n [N] No - Return to Main Menu");
        System.out.print("Enter choice: ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Y")){
            System.out.println("Will exit now...");
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Returning to main menu...");
        } else {
            System.err.print("\nINVALID INPUT!");
        }

    }
}
