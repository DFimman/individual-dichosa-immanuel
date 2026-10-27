package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class Activity9_Dichosa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display title
        System.out.println("\n--------------------------------");
        System.out.println("--- Student Grade Calculator ---");
        System.out.println("--------------------------------\n");

        // Input number of students and subjects
        System.out.print("Enter Number of Students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("Enter Number of Subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Store subject grades and the sum in the integer array
        int numberOfGradeHeaders = numberOfSubjects + 1;
        int indexOfSum = numberOfSubjects;
        int[][] grades = new int[numberOfStudents][numberOfGradeHeaders];

        // Store decimal averages separately
        float[] averages = new float[numberOfStudents];

        // Get subject names
        String[] subjects = new String[numberOfSubjects];
        System.out.println("\n---Enter Subject Names---");

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.next();
        }

        // Get student names and grades
        String[] students = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\n---Enter Student Name---");
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = scanner.next();

            System.out.println("\n---Enter " + students[i] + "'s Grades---");

            for (int j = 0; j < numberOfSubjects; j++) { // get grades
                System.out.print(subjects[j] + ": ");
                grades[i][j] = scanner.nextInt();
                grades[i][indexOfSum] += grades[i][j];
            }

            // Convert the sum to float before division to keep decimals
            averages[i] = (float) grades[i][indexOfSum] / numberOfSubjects;

            System.out.println();
        }

        // DISPLAY
        System.out.println(
                "\n------------------ STUDENT GRADES ------------------\n"
        );

        // Find enough space for the longest student name
        int studentWidth = 12;

        for (int i = 0; i < students.length; i++) {
            studentWidth = Math.max(studentWidth, students[i].length() + 2);
        }

        // Set a width for each subject column
        int[] subjectWidths = new int[numberOfSubjects];

        for (int j = 0; j < numberOfSubjects; j++) {
            subjectWidths[j] = Math.max(10, subjects[j].length() + 2);
        }

        // Print table headers
        System.out.printf("%-" + studentWidth + "s", "Student");

        for (int j = 0; j < numberOfSubjects; j++) {
            System.out.printf("%" + subjectWidths[j] + "s", subjects[j]);
        }

        System.out.printf("%10s%n", "Average");

        // Match the separator length to the table width
        int tableWidth = studentWidth + 10;

        for (int j = 0; j < numberOfSubjects; j++) {
            tableWidth += subjectWidths[j];
        }

        System.out.println("-".repeat(tableWidth));

        // Print one row for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-" + studentWidth + "s", students[i]);

            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.printf("%" + subjectWidths[j] + "d", grades[i][j]);
            }

            // Display average with two decimal places
            System.out.printf("%10.2f%n", averages[i]);
        }

        scanner.close();
    }
}