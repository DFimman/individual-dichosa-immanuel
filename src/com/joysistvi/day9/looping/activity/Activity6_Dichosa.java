package com.joysistvi.day9.looping.activity;
import java.util.Scanner;

public class Activity6_Dichosa {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // main loop
        while (true) {
            // get number
            int number;

            // loop for input validation
            while (true) {
                System.out.print("Enter the multiplication table you want to display [1-10]: ");
                number = scanner.nextInt();

                if (!(number <= 10 && number >= 1)) {
                    System.out.println("Invalid Input! Enter only 1-10\n");
                } else {
                    break;
                }
            }

            // display multiplication table
            System.out.print("\nMultiplication Table of " + number + "\n");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + i * number);
            }

            System.out.print("\nContinue? [Y/N]: ");
            String select = scanner.next();

            if (select.equals("N") || select.equals("n")){
                System.out.println("Will Exit now...");
                return;
            } else if ( ((select.equals("N") || select.equals("n")) || !((select.equals("Y") || select.equals("y")) ))) {
                System.out.println("Invalid Input, Type only Y/N! ");
                return;
            } else {
                System.out.println("\n");
            }

        }
    }
}
