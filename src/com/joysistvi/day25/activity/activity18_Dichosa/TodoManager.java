package com.joysistvi.day25.activity.activity18_Dichosa;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {
    // declare scanner for user input and ArrayList for storing tasks
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        // keep showing the menu until the user chooses to exit
        while (true) {
            showMenu();
            int choice = getInput("Enter your choice: ");

            // call the corresponding method based on the selected option
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    clearTasks();
                    break;
                case 0:
                    System.out.println("Exiting TodoManager. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Keeps asking until the user enters a valid integer
    public static int getInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a number.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("--- Todo Manager Menu ---");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Update a task");
        System.out.println("4. Remove a task");
        System.out.println("5. Clear all tasks");
        System.out.println("0. Exit");
    }

    public static void addTask() {
        System.out.print("Enter task: ");
        tasks.add(scanner.nextLine());
    }

    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
        } else {
            // display task numbers starting at 1 instead of index 0
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void updateTask() {
        // get the task number and check if it exists before updating
        int taskNumber = getInput("Enter task number to update: ");

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            System.out.print("Enter new task: ");
            tasks.set(taskNumber - 1, scanner.nextLine()); // subtract 1 to match the ArrayList index
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void removeTask() {
        int taskNumber = getInput("Enter task number to remove: ");

        if (taskNumber >= 1 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void clearTasks() {
        tasks.clear();
    }
}
