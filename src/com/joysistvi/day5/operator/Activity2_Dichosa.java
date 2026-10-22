package com.joysistvi.day5.operator;

public class Activity2_Dichosa {
    public static void main(String[] args) {
        // Initiations
        double income = 50_000;
        double foodAllowance = 15_000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        // Calculations
        double foodAllowanceRatio = foodAllowance / income;
        double transportationRatio = transportation / income;
        double rentRatio = rent / income;
        double utilityBillRatio = utilityBill / income;
        double totalExpense = (foodAllowance + transportation + rent + utilityBill);  // sum of total expenses
        double remainingBalance = income - totalExpense;   // income - total expense

        // Print Output
        System.out.println("\n[ Expense Tracker Program ]");  // title
        System.out.println("---------------------------");
        System.out.println("Income: " + (int) income);
        System.out.printf("Food Allowance: %.1f%%\n", foodAllowanceRatio * 100);
        System.out.printf("Transportation: %.1f%%\n", transportationRatio * 100);
        System.out.printf("Rent: %.1f%%\n", rentRatio * 100);
        System.out.printf("Utility Bill: %.1f%%\n", utilityBillRatio * 100);
        System.out.println("---------------------------");
        System.out.println("Remaining Balance: " + (int) remainingBalance );

    }
}

