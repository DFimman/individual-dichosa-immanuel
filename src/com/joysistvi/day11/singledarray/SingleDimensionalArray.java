package com.joysistvi.day11.singledarray;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        int[] ages = { 24, 26, 28, 30, 32 };

        // invoke an element
        System.out.println("Age: " + ages[2] + "\n");

        // invoke all elements
        for (int i = 0; i < ages.length; i++){
            System.out.println("Age: " + ages[i]);
        }

        // get the length of an array
        System.out.println("\nLength: " + ages.length);

        // for-each loop
        System.out.println("\n--For Each Loop--");
        for (int age: ages){
            System.out.println("Age: " + age);
            if (age == 26){
                break;
            }
        }
    }
}
