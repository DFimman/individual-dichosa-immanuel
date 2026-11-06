package com.joysistvi.day21.activity14_Dichosa;

public class Main {

    static private void displaytitle(){
        System.out.println("***********************************************");
        System.out.println("*          User Account Registration          *");
        System.out.println("***********************************************\n");
    }

    static private void displayUser(UserAccount user){
        System.out.println("\n************ User Account Created ************");

        String fullName = user.getFirstName() + " " + user.getMiddleName() + " " + user.getLastName();
        System.out.println("Full Name: " + fullName);
        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());
    }

    public static void main(String[] args) {

        boolean valid = true;

        displaytitle();

        String firstName = UserAccount.askUserInput("Enter first name: ");
        String middleName = UserAccount.askUserInput("Enter middle name: ");
        String lastName = UserAccount.askUserInput("Enter last name: ");
        String address = UserAccount.askUserInput("Enter address: ");
        String email = "";
        String password = "";

        do {
            email = UserAccount.askUserInput("Enter email: ");
            valid = UserAccount.isEmailValid(email);
        } while (!valid);

        do {
            System.out.println("\n!! Password must have: \n-a capitalized letter | \n-a number | \n-a special char | \n-atleast 8 char!!"); //reminder
            password = UserAccount.askUserInput("Enter password: ");
            valid = UserAccount.isPasswordValid(password);
        } while (!valid);

        UserAccount user = new UserAccount(firstName, middleName, lastName, address, email, password);
        //displayUser(user);
        System.out.println(user);

    }
}
