package com.joysistvi.day17.methods;

import java.util.Scanner;

public class SimpleCalculator {
    // user defined methods that does simple math

    public static double add(double a, double b){
        return a + b;
    }

    public static double substract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double divide(double a, double b){
        return a / b;
    }

    public static double modulo(double a, double b){
        return a % b;
    }

    public static double power(double base, double exponent){
        return Math.pow(base, exponent);
    }

    public static double calculate(double a, double b, char operator) {
        return switch (operator){
            case '+' -> add(a,b);
            case '-' -> substract(a,b);
            case '*' -> multiply(a,b);
            case '/' -> divide(a,b);
            case '^' -> power(a,b);
            case '%' -> modulo(a,b);
            default -> 0;
        };

    }

    public static double readNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                scanner.nextLine();
                return number;
            }

            scanner.nextLine();
            System.out.println("Invalid number. Please Try again.");
        }
    }

    public static char readOperator(Scanner scanner){
        while (true){
            System.out.print("Enter operator (+ - * / % ^): ");
            String input = scanner.nextLine().trim();

            if (input.length() == 1 && "+-*/%^".indexOf(input.charAt(0)) >= 0){
                return input.charAt(0);
            }

            System.out.println("Invalid Operator. Please Try Again.");
        }
    }

    public static boolean askContinue(Scanner scanner){
        System.out.print("Calculate again [y/n]: ");
        String answer = scanner.nextLine().trim().toLowerCase();
        return answer.equals("y") || answer.equals("yes");
    }

    // main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Simple Java Calculator ===");

        while (running) {
            double num = readNumber(scanner, "Enter first number: ");
            char operator = readOperator(scanner);
            double num2 = readNumber(scanner, "Enter second number: ");

            if ((operator == '/' || operator == '%') && num2 == 0) {
                System.out.println("Error: Cannot divide by zero");
            } else {
                double result = calculate(num, num2, operator);
                System.out.println(num + " " + operator + " " + num2 + " = " + result);
            }

            running = askContinue(scanner);
            System.out.println();
        }
        System.out.println("Goodbye");
        scanner.close();
    }
}
