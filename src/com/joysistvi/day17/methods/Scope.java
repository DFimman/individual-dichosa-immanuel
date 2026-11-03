package com.joysistvi.day17.methods;
import java.util.Scanner;
public class Scope {
    static Scanner sc = new Scanner(System.in);
    static String name = "Immanuel"; // static variable -> class variable -> class scope
    int age = 60; // this is instance variable, only in class and without static keyword
    // instance means object

    public static void main(String[] args) { // method/local scope
        //System.out.println(x); // variable can't be access here

        int x = 100;

        System.out.println(x); // variable can be access here

        { // block scope, this is a block -> inside curly bracket
        int y = 200;
            System.out.println(y);
            System.out.println(x); // method variable can access inside this block
        }

        //System.out.println(y); y variable can't be access here, only inside block

        for (int i = 0; i < 5; i++) {
            System.out.println(i); // loop score, variable i can only be access inside loop scope
        }

        //System.out.println(i); // variable i can't be access here, only in the loop, which is loop scope

        System.out.println(name); // static variable name can be access here

        Scope avatar = new Scope();
        System.out.println("My age is: " + avatar.age);

    }

    public static void example() {
       // System.out.println(x); // can't access x here, method variable

        System.out.println(name); // static variable name can also be access here
    }

    public static int getInput() {
        return sc.nextInt();
    }

    public int product(int a, int b) {
        return a * b;
    }

    public static void a() {
        getInput();
        Scope obj = new Scope();
        obj.product(3, 5);
    }
}
// static -> belongs to the class
// instance -> belongs to the instance/ or the thing we called object

// Easy Memory Trick
    /*
        static to static - direct
        static to instance - direct
        instance to static - instantiate
        instance to instance - direct
     */