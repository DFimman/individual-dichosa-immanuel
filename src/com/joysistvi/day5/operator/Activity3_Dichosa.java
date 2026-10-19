package com.joysistvi.day5.operator;

public class Activity3_Dichosa {
    public static void main(String[] args) {

        // Task 2
        int age = 15;
        boolean hasValidID = true;
        // age must be 18 or above AND must have valid ID
        String isAllowed = age >= 18 && hasValidID == true ? "You may now enter" : "No entry!";
        System.out.print("\n--- Task 2: Event Entry Check ---\n");
        System.out.println("     Checking....  " + isAllowed);

        // Task 3
        boolean isWeekend = true;
        boolean isHoliday = false;
        // should be Weekend or should be holiday
        String isNoClass = isWeekend || isHoliday ? "Go play games, no class today" : "Go ligo na, there is class today";
        System.out.print("\n--- Task 3: Class Checker ---\n");
        System.out.println("No class today?... " + isNoClass);

        // Task 4
        int score = 80;
        // pass if 75 above, or failed below
        String isPassed = score >= 75 ? "Passed" : "Failed";
        System.out.print("\n--- Task 4: Grade Evaluator ---\n");
        System.out.println("With a score of " + score + ".... You " + isPassed);

        // Task 5
        int num = 20;
        int num2 = 100;
        // find which number is higher
        int biggerNumber = num > num2 ? num : num2;
        System.out.print("\n--- Task 5: Larger Number Check---\n");
        System.out.printf("First number: %d, Second number: %d \n", num, num2);
        System.out.println("The larger number is: " + num2);

    }

}
