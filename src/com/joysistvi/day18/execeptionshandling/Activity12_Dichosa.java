package com.joysistvi.day18.execeptionshandling;
import java.util.Scanner;

public class Activity12_Dichosa {

    static Scanner scanner = new Scanner(System.in);

    // Balance and loan eligibility values.
    static int balance = 500;
    static boolean hasBorrowedLoad = false; // when true, can't borrow again

    // arrays for my  promo names, descriptions, and prices.
    static String[] categories = {"Go+", "Go", "GoImman", "UNLI 5G", "ALLNET"};
    static String[][] promoNames = {
            {"Go+99", "Go+129", "Go+149"},
            {"Go50", "Go90", "Go120"},
            {"GoImman67", "GoImman120", "GoImman426"},
            {"UNLI 5G 99", "UNLI 5G 149", "UNLI 5G 199"},
            {"ALLNET99", "ALLNET149", "ALLNET199"}
    };
    static String[][] promoDescriptions = {
            {"-> Get 8GB for all sites + 8GB freebie", "-> Get 12GB for all sites + 8GB freebie for 1 week", "-> Get 12GB for all sites + 12GB freebie for 10 days"},
            {"-> Get 5GB 5G + 3G for all networks (3 days)", "-> Get 9GB for all networks + 3GB for 1 week", "-> Get 15GB for all sites for 1 week"},
            {"-> Get 6GB for all sites + 7GB 5G for 1 week + Imman signature", "-> Get 12GB for all sites + 3GB 5G for 10 days + Imman signature", "-> Get 1GB for all sites + 1GB 5G every day for 30 days + Imman personal card"},
            {"-> Get UNLI 5G for 3 days", "-> Get UNLI 5G for 7 days", "-> Get UNLI 5G for 14 days"},
            {"-> Get 10GB ALL NET for 3 days", "-> Get 10GB ALL NET for 7 days", "-> Get 12GB ALL NET for 7 days"}
    };
    static int[][] promoPrices = {
            {99, 129, 149},
            {50, 90, 120},
            {67, 120, 426},
            {99, 149, 199},
            {99, 149, 199}
    };

    public static void main(String[] args) {
        boolean isValidUssd = false;

        while (!isValidUssd) {
            isValidUssd = getUssdCode();
            displayValidationResult(isValidUssd);
        }

        boolean shouldContinueSession = true;

        while (shouldContinueSession) {
            displayMainMenu(); // shows my main menu
            int choice = getInput("Enter Number: ", 0, categories.length + 2); // category choice + 2 for balance and loan

            if (choice == 0) {
                exit();
                shouldContinueSession = false; // false to close the loop
            } else if (choice <= categories.length) {
                shouldContinueSession = displayPromoMenu(choice - 1); // -1 to get the correct index, will prompt to our promo menus and returns a value if continue or not
            } else if (choice == categories.length + 1) {
                checkBalance();
            } else {
                borrowLoad();
            }
        }

        scanner.close();
    }

    public static boolean getUssdCode() {
        System.out.println("\n--- Welcome to DFImman USSD Load Registration ---");
        System.out.print("Enter USSD Code: ");
        return getInput().equals("*143#");
    }

    public static String getInput() {
        return scanner.nextLine().trim();
    }

    // Overloading keeps number conversion and range validation reusable across menus.
    public static int getInput(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);

            try {
                int number = Integer.parseInt(getInput());

                if (number >= min && number <= max) {
                    return number;
                }

                System.out.println("Invalid Number! Please enter [" + min + "-" + max + "].");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a whole number.");
            }
        }
    }

    public static void displayValidationResult(boolean isValid) {
        if (isValid) {
            System.out.println("Success.. Welcome to Main Menu..");
        } else {
            invalidMessage();
        }
    }

    public static void invalidMessage() {
        System.out.println("Invalid input! Please try again.");
    }

    public static void displayMainMenu() {
        System.out.println("\n       * Load Registration *");

        for (int i = 0; i < categories.length; i++) {
            System.out.println("   [" + (i + 1) + "] " + categories[i]);
        }

        System.out.println("   [" + (categories.length + 1) + "] Check Balance");
        System.out.println("   [" + (categories.length + 2) + "] Borrow Load");
        System.out.println("   [0] Exit");
    }

    // true = show main menu again; false = end session.
    public static boolean displayPromoMenu(int categoryIndex) {
        while (true) {
            System.out.println("\n     *** " + categories[categoryIndex] + " Promos ***");

            // display and iterate our selected promo menu list
            for (int i = 0; i < promoNames[categoryIndex].length; i++) {
                System.out.println("   [" + (i + 1) + "] " + promoNames[categoryIndex][i]);
            }

            // display the correct number for back and exit selection
            int backChoice = promoNames[categoryIndex].length + 1;
            System.out.println("   [" + backChoice + "] Back");
            System.out.println("   [0] Exit");

            int choice = getInput("Enter Number: ", 0, backChoice);

            if (choice == 0) {
                exit();
                return false;
            }

            if (choice == backChoice) {
                return true; // Go back to main menu.
            }

            // Menu numbering starts at 1; array indexes start at 0.
            int promoIndex = choice - 1;

            if (!displayPromoDetailsMenu(
                    promoNames[categoryIndex][promoIndex],
                    promoDescriptions[categoryIndex][promoIndex],
                    promoPrices[categoryIndex][promoIndex])) {
                return false; // Subscribe or Exit ends the session.
            }
        }
    }

    // true = return to category menu; false = end session.
    public static boolean displayPromoDetailsMenu(
            String promoName, String promoDescription, int price) {
        System.out.print(
                "\n        *** " + promoName + " Promo ***\n" +
                        promoDescription + "\n" +
                        "Price: P" + price + "\n" +
                        "   [1] Subscribe\n" +
                        "   [2] Exit\n" +
                        "   [3] Back\n"
        );

        int choice = getInput("Enter Number: ", 1, 3);

        switch (choice) {
            case 1:
                if (balance < price) {
                    System.out.println("\nInsufficient balance! Your balance is P" + balance +
                            ". This promo costs P" + price + ".");
                    return true;
                }

                balance -= price;
                subscribed(promoName);
                System.out.println("Remaining Balance: P" + balance);
                return false;
            case 2:
                exit();
                return false;
            default:
                return true; // Return to the category that opened details.
        }
    }

    public static void checkBalance() {
        System.out.println("\nYour current balance is: P" + balance);
    }

    // A session permits one P10 loan, with no fee or repayment feature.
    public static void borrowLoad() {
        if (hasBorrowedLoad) {
            System.out.println("\nYou have already borrowed P10 during this session.");
            return;
        }

        System.out.println("\n*** Borrow Load ***");
        System.out.println("   [1] Borrow P10");
        System.out.println("   [2] Back");

        int choice = getInput("Enter Number: ", 1, 2);

        if (choice == 1) {
            balance += 10;
            hasBorrowedLoad = true;
            System.out.println("\nSuccessfully borrowed P10! Your new balance is: P" + balance);
        }
    }

    public static void subscribed(String promoName) {
        System.out.println("\nYou are now subscribed to " + promoName + " Promo! Yey!");
    }

    public static void exit() {
        System.out.println("Exit...");
    }
}
