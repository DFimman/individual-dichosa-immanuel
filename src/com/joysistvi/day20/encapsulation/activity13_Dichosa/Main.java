package com.joysistvi.day20.encapsulation.activity13_Dichosa;

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
        UserAccount user = new UserAccount();
        boolean valid = true;

        displaytitle();

        user.setFirstName(UserAccount.askUserInput("Enter first name: "));
        user.setMiddleName(UserAccount.askUserInput("Enter middle name: "));
        user.setLastName(UserAccount.askUserInput("Enter last name: "));
        user.setAddress(UserAccount.askUserInput("Enter address: "));

        do {
            user.setEmail(UserAccount.askUserInput("Enter email: "));
            valid = UserAccount.isEmailValid(user);
        } while (!valid);

        do {
            System.out.println("\n!! Password must have: \n-a capitalized letter | \n-a number | \n-a special char | \n-atleast 8 char!!"); //reminder
            user.setPassword(UserAccount.askUserInput("Enter password: "));
            valid = UserAccount.isPasswordValid(user);
        } while (!valid);

        displayUser(user);

    }
}
