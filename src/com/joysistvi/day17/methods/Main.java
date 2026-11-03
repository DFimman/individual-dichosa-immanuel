package com.joysistvi.day17.methods;

public class Main {

    public static void main(String[] args) {
        Scope obj = new Scope();
        obj.product(5,25); // calling instance method in scope class

        System.out.println(obj.age);

        System.out.print("Enter number: ");
        Scope.getInput();
    }
}
