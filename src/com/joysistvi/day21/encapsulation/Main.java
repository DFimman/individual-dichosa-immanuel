package com.joysistvi.day21.encapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dataInput = {"brand", "color", "point size", "weigth [kg]"};
        String[] data = new String[dataInput.length];

        Ballpen ballpen1 = new Ballpen();
        Ballpen ballpen2 = new Ballpen("Panda", "Black", .1, 50 );

       /* // ask user for input
        for (int i = 0; i < dataInput.length; i++){
            System.out.print("Enter " + dataInput[i] + ": ");
            data[i] = sc.nextLine();
        }

        ballpen1.setBrand(data[0]);
        ballpen1.setColor(data[1]);
        ballpen1.setPointSize(Double.parseDouble(data[2]));
        ballpen1.setWeightInGrams(Double.parseDouble(data[3]));*/

        System.out.println();
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Color: ");
        String color = sc.nextLine();
        System.out.print("Enter Point Size: ");
        double pointSize = sc.nextDouble();
        System.out.print("Enter weight in grams: ");
        double weight = sc.nextDouble();

        Ballpen ballpen3 = new Ballpen(brand,color,pointSize,weight);

        System.out.println();
        System.out.println("Brand: " + ballpen1.getBrand());
        System.out.println("Color: " + ballpen1.getColor());
        System.out.println("Point Size: " + ballpen1.getPointSize());
        System.out.println("Weigh in G: " + ballpen1.getWeightInGrams());

        System.out.println(ballpen3.toString());

    }
}
