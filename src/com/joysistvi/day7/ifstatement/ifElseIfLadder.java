package com.joysistvi.day7.ifstatement;

public class ifElseIfLadder {
    public static void main(String[] args) {

        // sample 1
        int day = 0;
        String result = "";

        if (day == 1) {
            result = "Sunday";
        } else if (day == 2) {
            result = "Monday";
        } else if (day == 3) {
            result = "Tuesday";
        } else if (day == 4) {
            result = "Wednesday";
        } else if (day == 5) {
            result = "Thursday";
        } else if (day == 6) {
            result = "Friday";
        } else if (day == 7) {
            result = "Saturday";
        } else {
            result = "Error! Invalid!";
        }

        System.out.println("Day: " + result);

        // sample2
        int grade = 85;
        if (grade >= 1 && grade <= 100) { // outer if
            // inner if
            if (grade <= 70) { // 1 - 70
                result = "F";
            } else if (grade <= 80) { // 71 - 80
                result = "C";
            } else if (grade <= 90) {
                result = "B";
            } else {
                result = "A";
            }

            System.out.println("Grade: " + grade);
            System.out.println("Classification: " + result);

        } else {
            System.out.println("Invalid Grade");
        }
    }
}
