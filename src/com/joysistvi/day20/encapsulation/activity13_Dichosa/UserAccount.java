package com.joysistvi.day20.encapsulation.activity13_Dichosa;
import java.util.Scanner;


public class UserAccount {
    static private Scanner sc = new Scanner(System.in);

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // my getters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // my setters
    public void setFirstName(String firstName) {
        this.firstName = capitalizeFirstLetter(firstName);
    }

    public void setMiddleName(String middleName) {
        this.middleName = capitalizeFirstLetter(middleName);
    }

    public void setLastName(String lastName) {
        this.lastName = capitalizeFirstLetter(lastName);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static public boolean isEmailValid(UserAccount user) {
        String invalidationReasons = "\nInvalid email: \n";
        boolean isValid = true;
        int lastAtIndex = user.email.lastIndexOf('@');
        String domain = user.email.substring(lastAtIndex + 1).trim();

        // email must be at most 320 chars only (SMTP protocol RFC 5321) technical standard
        if (user.email.length() > 320){
            invalidationReasons += "- Up to 320 characters only!\n";
            isValid = false;
        }
        // email must have @
        if (!user.email.contains("@")) {
            invalidationReasons += "- Missing the '@' symbol.\n";
            isValid = false;
        }
        // email must have proper domain
        if (domain.isEmpty() || !domain.contains(".")) {
            invalidationReasons += "- Missing a valid domain extension (e.g., .com, .org).\n";
            isValid = false;
        }

        if (isValid == false){
            System.out.print(invalidationReasons);
            isValid = false;
        }

        return isValid;
    }

    static public boolean isPasswordValid(UserAccount user) {
        String invalidationReasons = "\nInvalid password: \n";
        boolean isValid = true;
        // password standards by String invalidationReasons = "Invalid email: \n";

        // Validate Length (Standard 8 to 64 characters)
        if (user.password.length() < 8 || user.password.length() > 64) {
            invalidationReasons += "- Invalid password: Must be between 8 and 64 characters long.\n";
            isValid = false;
        }

        // Validate Lowercase Letter
        if (!user.password.matches(".*[a-z].*")) {
            invalidationReasons += "- Invalid password: Must contain at least one lowercase letter.\n";
            isValid = false;
        }

        // Validate Uppercase Letter
        if (!user.password.matches(".*[A-Z].*")) {
            invalidationReasons += "- Invalid password: Must contain at least one uppercase letter.\n";
            isValid = false;
        }

        // Validate Number
        if (!user.password.matches(".*[0-9].*")) {
            invalidationReasons += "- Invalid password: Must contain at least one digit (0-9).\n";
            isValid = false;
        }

        // Validate Special Character
        // This matches standard symbols like @, #, $, %, ^, &, +, =, !
        if (!user.password.matches(".*[@#$%^&+=!].*")) {
            invalidationReasons += "- Invalid password: Must contain at least one special character (@#$%^&+=!).\n";
            isValid = false;
        }

       if (isValid == false){
           System.out.println(invalidationReasons);
       }

       return isValid;
    }

    // my helper method
    static public String askUserInput(String prompt){
        String input = "";

        while (true){
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if ((input.equals(""))){
                System.out.println("Input is Empty! Try again!");
            } else {
                return input;
            }
        }
    }

    public static String capitalizeFirstLetter(String input) {
        // Capitalize the first character and append the rest of the string
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }
}

