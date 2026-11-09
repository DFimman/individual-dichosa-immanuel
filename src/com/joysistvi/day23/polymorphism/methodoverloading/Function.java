package com.joysistvi.day23.polymorphism.methodoverloading;

public class Function {

    public void jump (Boolean isJumping, int noOfJump){
        if (isJumping) {
            System.out.println("Jump " + noOfJump + "x!");
        } else {
            System.out.println("Idle");
        }
    }

    public void jump (Boolean isJumping){
        if (isJumping) {
            System.out.println("Jump!");
        } else {
            System.out.println("Idle");
        }
    }

    public void jump (Boolean isJumping, int noOfJump, double height){
        if (isJumping) {
            System.out.println("Jump " + noOfJump + "x!\nJump for about: " + (height*noOfJump) + " units!");
        } else {
            System.out.println("Idle");
        }
    }

}
