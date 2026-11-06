package com.joysistvi.day20.encapsulation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dataInput = {"brand", "color", "point size", "weigth [kg]"};
        String[] data = new String[dataInput.length];

        Ballpen ballpen = new Ballpen();

        // ask user for input
        for (int i = 0; i < dataInput.length; i++){
            System.out.print("Enter " + dataInput[i] + ": ");
            data[i] = sc.nextLine();
        }

        ballpen.setBrand(data[0]);
        ballpen.setColor(data[1]);
        ballpen.setPointSize(Double.parseDouble(data[2]));
        ballpen.setWeightInGrams(Double.parseDouble(data[3]));

        System.out.println();
        System.out.println("Brand: " + ballpen.getBrand());
        System.out.println("Color: " + ballpen.getColor());
        System.out.println("Point Size: " + ballpen.getPointSize());
        System.out.println("Weigh in KG: " + ballpen.getWeightInGrams());

    }
}
