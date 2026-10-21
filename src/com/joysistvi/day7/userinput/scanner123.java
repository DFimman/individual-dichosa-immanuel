package com.joysistvi.day7.userinput;
import java.util.Scanner;

public class scanner123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number [1-7]");
        System.out.print("Entered Number: ");

        int day = scanner.nextInt();
        String dayName = "";

        if (day == 1) {
            // Executes when day is 1
            dayName = "Sunday";
        } else if (day == 2) {
            // Executes when day is 2
            dayName = "Monday";
        } else if (day == 3) {
            // Executes when day is 3
            dayName = "Tuesday";
        } else if (day == 4) {
            // Executes when day is 4
            dayName = "Wednesday";
        } else if (day == 5) {
            // Executes when day is 5
            dayName = "Thursday";
        } else if (day == 6) {
            // Executes when day is 6
            dayName = "Friday";
        } else if (day == 7) {
            // Executes when day is 7
            dayName = "Saturday";
        } else {
            dayName = "Invalid!";
        }

        System.out.println(dayName);
    }
}
