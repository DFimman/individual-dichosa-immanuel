package com.joysistvi.day23.polymorphism.activity16_Dichosa;

import com.joysistvi.day22.activity15_Dichosa.GelPen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pen pen1 = new Pen("Sakura", "Blue",  .15);
        Pen pen2 = new Ballpen("Panda", "Red", .5, 20);
        Pen pen3 = new Highlighter("NeonPowerz", "Yellow", "Neon", 45);

        System.out.println("=== Pen ===");
        System.out.println(pen1);
        pen1.write();
        pen1.refill();

        System.out.println("=== Ballpen ===");
        System.out.println(pen2);
        pen2.write();
        pen2.refill();

        System.out.println("\n=== Marker ===");
        System.out.println(pen3);
        pen3.write();
        pen3.refill();



    }
}
