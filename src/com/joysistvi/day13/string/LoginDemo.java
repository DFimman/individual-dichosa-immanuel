package com.joysistvi.day13.string;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        // Login Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Login -----");
        int retry = 5;

        while (retry > 0) {
            String correctUsername = "admin";
            String correctPassword = "admin123";

            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            // Validation
            boolean isEmpty = username.isEmpty() && password.isEmpty();
            if (isEmpty){
                System.out.print("Username and Password cannot be empty. ");
            } else {
                if (username.isEmpty()) {
                    System.out.print("Username cannot be empty. ");
                } else if (password.isEmpty()) {
                    System.out.print("Password cannot be empty. ");
                }
            }

            boolean isAuthenticated = username.equals(correctUsername) && password.equals(correctPassword);
            // Authentication
            if (isAuthenticated) {
                System.out.println("Login Successfully!");
                System.out.println("Welcome, " + username + "!");
                break;
            } else if (!(isAuthenticated) && !(username.isEmpty() || password.isEmpty())) {
                System.out.println("Invalid Username or Password.");
                System.out.print("Access Denied. ");
            }

            retry -= 1;
            System.out.println("Retry left: " + retry);
            System.out.println();

        }

        if (retry == 0) {
            System.err.print("Oops.. No retries left. Will Exit now... ");
            System.out.println();
        }
    }
}
