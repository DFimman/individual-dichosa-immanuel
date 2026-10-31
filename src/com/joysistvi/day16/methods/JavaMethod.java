package com.joysistvi.day16.methods;
import java.util.Scanner;

public class JavaMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Int Sum: " + sum(5,6));
        System.out.println("Double Sum: " + sum(5.151512D,6.5125121D));
        System.out.println("Float Sum: " + sum(5.2f,6.5f));
        System.out.println("Long Sum: " + sum(12512, 53515L) + "\n");

        System.out.print("Enter what year is it: ");
        int year = sc.nextInt();

        System.out.println();

        greet("Imman", year);


    }

    public static void greet(String name, int year){
        int birthyear = 2003;
        int age = year - birthyear;

        if (birthyear >= year){
            System.out.println("I'm still not alive that time!");
            return;
        }
        System.out.println("Hello, my name is " + name +"!");
        System.out.println("I am " + age + " years old.");
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static long sum(long a, long b){
        return a + b;
    }


}

