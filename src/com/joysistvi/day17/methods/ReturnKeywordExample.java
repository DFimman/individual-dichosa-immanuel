package com.joysistvi.day17.methods;

public class ReturnKeywordExample {

    public static void main(String[] args) {
        String fullName = createFullName("Immanuel", "Dichosa");
        System.out.println("Full Name: " + fullName);
        System.out.println(createGreeting(fullName));
    }

    public static String createGreeting(String name) {
        return "Hello, " + name + "! Welcome to java.";
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim();
    }
}
