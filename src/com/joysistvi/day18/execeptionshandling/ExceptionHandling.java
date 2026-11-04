package com.joysistvi.day18.execeptionshandling;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException
        String[] cars = new String[2];
        cars[0] = "Isuzu";
        cars[1] = "BYD";
        //cars[2] = "";

        // null pointer exception, when you process a null value
        String word = null;
        //word.equals("word");

        // NumberFormatException
        System.out.print("Enter Input: ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
       // int choice = Integer.parseInt(input);
       // System.out.println(choice);

        try {
            int[] numbers = {1, 2, 3, 4, 5};

            System.out.println(numbers[5]);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }

        System.out.println("\nNO ERRORS ANYMORE");
    }
}
