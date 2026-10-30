package com.joysistvi.day15.oopintro;

public class Main {

    public static void main(String[] args) {

        // Class instantiation / create an object of a class
        Laptop laptop = new Laptop(); // Default constructor (no Args)
        laptop.brand = "Acer";
        laptop.color = "Silver";
        laptop.weightInKg = 1.2;
        laptop.cpu = "Intel";
        laptop.ramInGb = 16;

        laptop.browseInternet();
        laptop.createDocuments();
        laptop.sendMessages();
        laptop.transferFiles();

        // second object
        Laptop laptop2 = new Laptop();
        laptop2.brand = "Lenovo";
        laptop2.color = "Grey";
        laptop2.weightInKg = 1.8;
        laptop2.cpu = "Ryzen";
        laptop2.ramInGb = 16;

        laptop2.createDocuments();
        laptop2.sendMessages();
        laptop2.transferFiles();

        // third object
        Laptop laptop3 = new Laptop();
        laptop3.brand = "LOQ";
        laptop3.color = "Grey";
        laptop3.weightInKg = 3;
        laptop3.cpu = "Ryzen 9";
        laptop3.ramInGb = 32;

        laptop3.createDocuments();
        laptop3.sendMessages();
        laptop3.transferFiles();
        laptop3.browseInternet();
    }
}
