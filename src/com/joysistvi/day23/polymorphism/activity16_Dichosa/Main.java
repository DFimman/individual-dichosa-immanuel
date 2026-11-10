package com.joysistvi.day23.polymorphism.activity16_Dichosa;

import com.joysistvi.day22.activity15_Dichosa.GelPen;

import java.util.Scanner;

public class Main {
    public static void testPen(Pen pen){
        System.out.println(pen);
        pen.write();
        pen.refill();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pen pen1 = new Pen("Sakura", "Blue",  .15);
        Pen pen2 = new Ballpen("Panda", "Red", .5, 20);
        Pen pen3 = new Highlighter("NeonPowerz", "Yellow", "Neon", 45);

        System.out.println("=== Pen ===");
        pen1.write();
        pen1.refill();


        System.out.println("\n=== Ballpen ===");
        pen2.write();
        pen2.refill();


        System.out.println("\n=== Marker ===");
        pen3.write();
        pen3.refill();

        System.out.println("\n=== testPen() ===");
        testPen(pen1);
        System.out.println();
        testPen(pen2);
        System.out.println();
        testPen(pen3);

        System.out.println("\n=== Overloading ===");
        pen2.write("Hello!");
        pen3.write("Hi!", 3);

        // There are many differences of method overloading and method overriding.
        // One of them is that overloading happens in compile-time meanwhile the other in runtime.
        // Other one is that, in overloading, we do it by creating the same method with the same name, but with different number of parameters or different data type.
        // While in overriding, only happens in inheritance by using the annotation Override, that makes it that we prioritize the method created in the childclass to be called.
        // Both are important in polymorphism


    }
}
