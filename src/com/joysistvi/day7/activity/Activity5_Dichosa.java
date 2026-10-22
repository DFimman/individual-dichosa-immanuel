package com.joysistvi.day7.activity;
import java.util.Scanner;

public class Activity5_Dichosa {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // first display and input
        System.out.println("\n--- Welcome to DFImman USSD Load Registration ---");
        System.out.print("Enter USSD Code: ");

        // code validation
        if (!(scanner.next().equals("*143#"))){
            System.out.println("Invalid input! Please retry again");
            return; // early exit
        } else {
            System.out.println("Success.. Welcome to Main Menu..");
        }

        // display main menu
        System.out.print("\n       * Load Registration *\n" +
                "   [1] Go+ \n" +
                "   [2] Go \n" +
                "   [3] GoImman \n" +
                "   [4] UNLI 5G \n" +
                "   [5] ALLNET \n" +
                "Enter Number: ");

        // declaration
        String promoName = "";
        String promoDescription = "";
        String select = scanner.next(); // main menu select input


        // conditional statement for main menu (switch)
        switch (select){
            case "1":
                // Display Promo Menu for Go+
                System.out.print(
                        "\n     *** Go+ Promos ***\n" +
                                "   [1] Go+99\n" +
                                "   [2] Go+129\n" +
                                "   [3] Go+149\n" +
                                "Enter Number: "
                );

                // input
                select = scanner.next();

                // conditional statements for submenu
                switch (select){
                    case "1":
                        promoName = "Go+99";
                        promoDescription = "-> Get 8GB for all sites + 8GB freebie";
                        break;
                    case "2":
                        promoName = "Go+129";
                        promoDescription = "-> Get 12GB for all sites + 8GB freebie for 1 week";
                        break;
                    case "3":
                        promoName = "Go+149";
                        promoDescription = "-> Get 12GB for all sites + 12GB freebie for 10 days";
                        break;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-3] without spaces!");
                        break;
                }

                // display promo details
                System.out.print(
                        "\n        *** " + promoName + " Promo ***\n" +
                                promoDescription + "\n" +
                                "   [1] Subscribe\n" +
                                "   [2] Exit \n" +
                                "Enter Number: ");
                // input
                select = scanner.next();

                switch (select){
                    case "1":
                        System.out.println("\nYou are now subscribe to " + promoName + " Promo! yey!");
                        return;
                    case "2":
                        return;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-2] without spaces!");
                        break;
                }
                break;
            case "2":
                // Display Promo Menu for Go
                System.out.print(
                        "\n     *** Go Promos ***\n" +
                                "   [1] Go50\n" +
                                "   [2] Go90\n" +
                                "   [3] Go120\n" +
                                "Enter Number: "
                );

                // input
                select = scanner.next();

                // conditional statements for submenu
                switch (select){
                    case "1":
                        promoName = "Go50";
                        promoDescription = "--> Get 5GB 5G + 3G for all networks (3days)";
                        break;
                    case "2":
                        promoName = "Go90";
                        promoDescription = "-> Get 9GB for all network + 3GB for 1 week";
                        break;
                    case "3":
                        promoName = "Go120";
                        promoDescription = "-> Get 15GB for all sites for 1 week";
                        break;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-3] without spaces!");
                        break;
                }

                // display promo details
                System.out.print(
                        "\n        *** " + promoName + " Promo ***\n" +
                                promoDescription + "\n" +
                                "   [1] Subscribe\n" +
                                "   [2] Exit \n" +
                                "Enter Number: ");
                // input
                select = scanner.next();

                switch (select){
                    case "1":
                        System.out.println("\nYou are now subscribe to " + promoName + " Promo! yey!");
                        return;
                    case "2":
                        return;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-2] without spaces!");
                        break;
                }
                break;
            case "3":
                // Display Promo Menu for GoImman Promos
                System.out.print(
                        "\n     *** GoImman Promos ***\n" +
                                "   [1] GoImman67\n" +
                                "   [2] GoImman120\n" +
                                "   [3] GoImman426\n" +
                                "Enter Number: "
                );

                // input
                select = scanner.next();

                // conditional statements for submenu
                switch (select){
                    case "1":
                        promoName = "GoImman67";
                        promoDescription = "-> Get 6GB for all site + 7GB 5G for 1 week + imman signature";
                        break;
                    case "2":
                        promoName = "GoImman120";
                        promoDescription = "-> Get 12 GB for all sites + 3 GB 5G for 10 days + imman signature";
                        break;
                    case "3":
                        promoName = "GoImman426";
                        promoDescription = "-> Get 1gb for all sites + 1gb 5g everyday for 30 days + imman personal card-> Get 15GB for all sites for 1 week";
                        break;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-3] without spaces!");
                        break;
                }

                // display promo details
                System.out.print(
                        "\n                     *** " + promoName + " Promo ***\n" +
                                promoDescription + "\n" +
                                "          [1] Subscribe\n" +
                                "          [2] Exit \n" +
                                "Enter Number: ");
                // input
                select = scanner.next();

                switch (select){
                    case "1":
                        System.out.println("\nYou are now subscribe to " + promoName + " Promo! yey!");
                        return;
                    case "2":
                        return;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-2] without spaces!");
                        break;
                }
                break;
            case "4":
                // Display Promo Menu for Unli 5G Promos
                System.out.print(
                        "\n     *** UNLI 5G Promos ***\n" +
                                "   [1] UNLI 5G 99\n" +
                                "   [2] UNLI 5G 149\n" +
                                "   [3] UNLI 5G 199\n" +
                                "Enter Number: "
                );

                // input
                select = scanner.next();

                // conditional statements for submenu
                switch (select){
                    case "1":
                        promoName = "UNLI 5G 99";
                        promoDescription = "-> Get UNLI 5G for 3 days";
                        break;
                    case "2":
                        promoName = "UNLI 5G 149";
                        promoDescription = "-> Get UNLI 5G for 7 days";
                        break;
                    case "3":
                        promoName = "UNLI 5G 199";
                        promoDescription = "-> Get UNLI 5G for 14 days";
                        break;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-3] without spaces!");
                        break;
                }

                // display promo details
                System.out.print(
                        "\n        *** " + promoName + " Promo ***\n" +
                                promoDescription + "\n" +
                                "   [1] Subscribe\n" +
                                "   [2] Exit \n" +
                                "Enter Number: ");
                // input
                select = scanner.next();

                switch (select){
                    case "1":
                        System.out.println("\nYou are now subscribe to " + promoName + " Promo! yey!");
                        return;
                    case "2":
                        return;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-2] without spaces!");
                        break;
                }
                break;
            case "5":
                // Display Promo Menu for ALLNET
                System.out.print(
                        "\n     *** Go Promos ***\n" +
                                "   [1] ALLNET99\n" +
                                "   [2] ALLNET149\n" +
                                "   [3] ALLNET199\n" +
                                "Enter Number: "
                );

                // input
                select = scanner.next();

                // conditional statements for submenu
                switch (select){
                    case "1":
                        promoName = "UNLI 5G 99";
                        promoDescription = "-> Get 10 GB ALL NET  for 3 days";
                        break;
                    case "2":
                        promoName = "UNLI 5G 149";
                        promoDescription = "-> Get 10 GB ALL NET  for 7 days";
                        break;
                    case "3":
                        promoName = "UNLI 5G 199";
                        promoDescription = "-> Get 12 GB ALL NET  for 7 days";
                        break;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-3] without spaces!");
                        break;
                }

                // display promo details
                System.out.print(
                        "\n        *** " + promoName + " Promo ***\n" +
                                promoDescription + "\n" +
                                "   [1] Subscribe\n" +
                                "   [2] Exit \n" +
                                "Enter Number: ");
                // input
                select = scanner.next();

                switch (select){
                    case "1":
                        System.out.println("\nYou are now subscribe to " + promoName + " Promo! yey!");
                        return;
                    case "2":
                        return;
                    default:
                        System.out.println("Invalid Number, Please only enter [1-2] without spaces!");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Number, Please only enter [1-5] and without spaces!");
                break;
        }
    }
}
