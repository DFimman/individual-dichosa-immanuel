package com.joysistvi.day16.methods;

import java.util.Scanner;

public class LoadRegistrationSimulator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isValidUssd = false;

        while (!isValidUssd) {
            isValidUssd = getUssdCode();
            displayValidationResult(isValidUssd);
        }

        boolean shouldContinueSession = true;

        while (shouldContinueSession) {
            displayMainMenu();
            String select = getInput();
            shouldContinueSession = displayPromoMenu(select);
        }
    }

    public static boolean getUssdCode() {
        System.out.println("\n--- Welcome to DFImman USSD Load Registration ---");
        System.out.print("Enter USSD Code: ");
        return scanner.next().equals("*143#");
    }

    public static String getInput(){
        return scanner.nextLine().trim();
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
        System.out.print(
                "\n       * Load Registration *\n" +
                        "   [1] Go+\n" +
                        "   [2] Go\n" +
                        "   [3] GoImman\n" +
                        "   [4] UNLI 5G\n" +
                        "   [5] ALLNET\n" +
                        "Enter Number: "
        );
    }

    // true = show main menu again; false = end session.
    public static boolean displayPromoMenu(String select) {
        switch (select) {
            case "1": return displayGoPlusMenu();
            case "2": return displayGoMenu();
            case "3": return displayGoImmanMenu();
            case "4": return displayUnli5gMenu();
            case "5": return displayAllNetMenu();
            default:
                invalidMessage();
                return true;
        }
    }

    public static boolean displayGoPlusMenu() {
        while (true) {
            System.out.print(
                    "\n     *** Go+ Promos ***\n" +
                            "   [1] Go+99\n" +
                            "   [2] Go+129\n" +
                            "   [3] Go+149\n" +
                            "   [4] Back\n" +
                            "Enter Number: "
            );

            String select = getInput();
            switch (select) {
                case "1":
                    if (!displayPromoDetailsMenu(
                            "Go+99",
                            "-> Get 8GB for all sites + 8GB freebie"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "2":
                    if (!displayPromoDetailsMenu(
                            "Go+129",
                            "-> Get 12GB for all sites + 8GB freebie for 1 week"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "3":
                    if (!displayPromoDetailsMenu(
                            "Go+149",
                            "-> Get 12GB for all sites + 12GB freebie for 10 days"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "4":
                    return true; // Go back to main menu.
                default:
                    System.out.println("Invalid Number! Please enter [1-4].");
            }
        }
    }

    public static boolean displayGoMenu() {
        while (true) {
            System.out.print(
                    "\n     *** Go Promos ***\n" +
                            "   [1] Go50\n" +
                            "   [2] Go90\n" +
                            "   [3] Go120\n" +
                            "   [4] Back\n" +
                            "Enter Number: "
            );

            String select = getInput();
            switch (select) {
                case "1":
                    if (!displayPromoDetailsMenu(
                            "Go50",
                            "-> Get 5GB 5G + 3G for all networks (3 days)"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "2":
                    if (!displayPromoDetailsMenu(
                            "Go90",
                            "-> Get 9GB for all networks + 3GB for 1 week"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "3":
                    if (!displayPromoDetailsMenu(
                            "Go120",
                            "-> Get 15GB for all sites for 1 week"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "4":
                    return true; // Go back to main menu.
                default:
                    System.out.println("Invalid Number! Please enter [1-4].");
            }
        }
    }

    public static boolean displayGoImmanMenu() {
        while (true) {
            System.out.print(
                    "\n     *** GoImman Promos ***\n" +
                            "   [1] GoImman67\n" +
                            "   [2] GoImman120\n" +
                            "   [3] GoImman426\n" +
                            "   [4] Back\n" +
                            "Enter Number: "
            );

            String select = getInput();
            switch (select) {
                case "1":
                    if (!displayPromoDetailsMenu(
                            "GoImman67",
                            "-> Get 6GB for all sites + 7GB 5G for 1 week + Imman signature"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "2":
                    if (!displayPromoDetailsMenu(
                            "GoImman120",
                            "-> Get 12GB for all sites + 3GB 5G for 10 days + Imman signature"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "3":
                    if (!displayPromoDetailsMenu(
                            "GoImman426",
                            "-> Get 1GB for all sites + 1GB 5G every day for 30 days + Imman personal card"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "4":
                    return true; // Go back to main menu.
                default:
                    System.out.println("Invalid Number! Please enter [1-4].");
            }
        }
    }

    public static boolean displayUnli5gMenu() {
        while (true) {
            System.out.print(
                    "\n     *** UNLI 5G Promos ***\n" +
                            "   [1] UNLI 5G 99\n" +
                            "   [2] UNLI 5G 149\n" +
                            "   [3] UNLI 5G 199\n" +
                            "   [4] Back\n" +
                            "Enter Number: "
            );

            String select = getInput();
            switch (select) {
                case "1":
                    if (!displayPromoDetailsMenu(
                            "UNLI 5G 99",
                            "-> Get UNLI 5G for 3 days"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "2":
                    if (!displayPromoDetailsMenu(
                            "UNLI 5G 149",
                            "-> Get UNLI 5G for 7 days"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "3":
                    if (!displayPromoDetailsMenu(
                            "UNLI 5G 199",
                            "-> Get UNLI 5G for 14 days"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "4":
                    return true; // Go back to main menu.
                default:
                    System.out.println("Invalid Number! Please enter [1-4].");
            }
        }
    }

    public static boolean displayAllNetMenu() {
        while (true) {
            System.out.print(
                    "\n     *** ALLNET Promos ***\n" +
                            "   [1] ALLNET99\n" +
                            "   [2] ALLNET149\n" +
                            "   [3] ALLNET199\n" +
                            "   [4] Back\n" +
                            "Enter Number: "
            );

            String select = getInput();
            switch (select) {
                case "1":
                    if (!displayPromoDetailsMenu(
                            "ALLNET99",
                            "-> Get 10GB ALL NET for 3 days"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "2":
                    if (!displayPromoDetailsMenu(
                            "ALLNET149",
                            "-> Get 10GB ALL NET for 7 days"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "3":
                    if (!displayPromoDetailsMenu(
                            "ALLNET199",
                            "-> Get 12GB ALL NET for 7 days"
                    )) {
                        return false; // Subscribe or Exit ends the session.
                    }
                    break; // Back: repeat this category\'s menu.
                case "4":
                    return true; // Go back to main menu.
                default:
                    System.out.println("Invalid Number! Please enter [1-4].");
            }
        }
    }

    // true = return to category menu; false = end session.
    public static boolean displayPromoDetailsMenu(
            String promoName, String promoDescription) {
        while (true) {
            System.out.print(
                    "\n        *** " + promoName + " Promo ***\n" +
                            promoDescription + "\n" +
                            "   [1] Subscribe\n" +
                            "   [2] Exit\n" +
                            "   [3] Back\n" +
                            "Enter Number: "
            );

            String select = getInput();
            switch (select) {
                case "1":
                    subscribed(promoName);
                    return false;
                case "2":
                    exit();
                    return false;
                case "3":
                    return true; // Return to the category that opened details.
                default:
                    System.out.println("Invalid Number! Please enter [1-3].");
            }
        }
    }

    public static void subscribed(String promoName) {
        System.out.println("\nYou are now subscribed to " + promoName + " Promo! Yey!");
    }

    public static void exit() {
        System.out.println("Exit...");
    }
}
