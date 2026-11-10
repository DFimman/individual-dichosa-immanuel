package com.joysistvi.day22.activity15_Dichosa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pen pen1 = new Ballpen("Panda", "Red", .5, 20);
        Pen pen2 = new Highlighter("NeonPowerz", "Yellow", "Neon", 45);
        Ballpen pen3 = new GelPen("HyperV", "Black", .8, 30, true);

        System.out.println("=== Ballpen ===");
        System.out.println(pen1);
        pen1.write();

        System.out.println("\n=== Marker ===");
        System.out.println(pen2);
        pen2.write();

        System.out.println("\n=== Gelpen ===");
        System.out.println(pen3);
        pen2.write();


    }
}
