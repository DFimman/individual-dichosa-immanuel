package com.joysistvi.day11.singledarray;
import java.util.Scanner;

public class ArrayExampleWithSizeOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] colors = new String[6];
        System.out.println("My Array: " + colors + "\n");

        System.out.println("---My Array with user Input---");
        for (int i = 0; i < colors.length; i++){
            System.out.print("Enter Color ["+(i)+"]: ");
            colors[i] = sc.nextLine();
        }

        System.out.print("\nMy colors: ");
        for (String color : colors) {
            System.out.print(color + ", ");
        }
    }
}
