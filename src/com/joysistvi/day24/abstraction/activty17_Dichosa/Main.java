package com.joysistvi.day24.abstraction.activty17_Dichosa;

public class Main {
    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
    }

    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS);
    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
    }

    public static void main(String[] args) {
        // Compile error: Pen is abstract; cannot be instantiated.
        // An abstract class must be extended before creating a concrete object.

        Ballpen pen2 = new Ballpen("Panda", "Red", .5, 20);
        Highlighter pen3 = new Highlighter("NeonPowerz", "Yellow", "Neon", 45);

        System.out.println("=== testPen() ===");
        testPen(pen2);
        System.out.println();
        testPen(pen3);

        System.out.println("\n=== testRefillable() ===");
        testRefillable(pen2);
        System.out.println();
        testRefillable(pen3);

        System.out.println("\n=== testClickable() ===");
        testClickable(pen2);


        // testClickable(pen3); Compile error: Highlighter cannot be converted to Clickable.
        // Highlighter does not implement the Clickable interface.
    }

    // An abstract class uses 'extends' to share fields and methods with child classes.
    // It can also require subclasses to implement abstract methods.
    // An interface uses 'implements' to define behaviors that a class must provide.
    // A class can extend one class while implementing multiple interfaces.
}
