package com.joysistvi.day15.oopintro.mini.activity;

public class Main {
    public static void main(String[] args) {
        // car1
        Car car1 = new Car();
        car1.model = "Toyota Vios";
        car1.type = "Sedan";
        car1.color = "White";
        car1.yearManufactured = 2024;
        car1.passengerSize = 5;
        car1.horsePower = 106;
        // methods
        car1.accelerate();
        car1.stop();
        car1.park();

        // car2
        Car car2 = new Car();
        car2.model = "Honda Civic";
        car2.type = "Sedan";
        car2.color = "Black";
        car2.yearManufactured = 2023;
        car2.passengerSize = 5;
        car2.horsePower = 158;
        // methods
        car2.doorOpen();
        car2.doorClose();
        car2.turnOnAC();
        car2.accelerate();

        // Car Object 3
        Car car3 = new Car();
        car3.model = "Ford Mustang";
        car3.type = "Coupe";
        car3.color = "Red";
        car3.yearManufactured = 2025;
        car3.passengerSize = 4;
        car3.horsePower = 480;

        car3.park();



    }
}
