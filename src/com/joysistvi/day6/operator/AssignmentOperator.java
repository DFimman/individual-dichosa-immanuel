package com.joysistvi.day6.operator;

public class AssignmentOperator {
    public static void main(String[] args) {

        // simple assignment (=)
        int num = 10;

        // compound assignment (+=, -=, *=, /=, %=)
        int num2 = 10;
        num2 = num2 + 10; // normal way -> 20
        System.out.println(num2);
        num2 += 10; // -> 30
        System.out.printf("Compound way: %d", num2);


    }
}
