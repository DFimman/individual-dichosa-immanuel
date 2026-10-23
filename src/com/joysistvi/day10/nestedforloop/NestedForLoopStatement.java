package com.joysistvi.day10.nestedforloop;

public class NestedForLoopStatement {
    public static void main(String[] args) {


        // mini activity
        for (int i = 1; i <= 5; i++){
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /* // pyramid
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++){
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

        /* second example
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
            for (int j = 1; j <= i; j++){
                System.out.println("\t" + j);
            }
        } */


        /* // syntax of nested for loop
        for (int i = 1; i <= 3; i++){ // outer loop
            System.out.println("Multiplication table of " + i);
            for (int j = 1; j <= 3; j++) { // inner loop
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println(); // new line
        } */
    }
}
