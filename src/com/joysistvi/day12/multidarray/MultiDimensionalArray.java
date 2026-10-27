package com.joysistvi.day12.multidarray;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] numbers = {
                //0 1  2
                {1, 2, 3, 10}, // 0
                {4, 5, 6}, // 1
                {7, 8, 9}  // 2
        };
        // displaying elements of inside arrays
        System.out.println("Display Number 7: " + numbers[2][0]); // display 7
        System.out.println("Display Number 9: " + numbers[2][2]); // display 9
        System.out.println("Display Number 5: " + numbers[1][1]); // display 5

        // getting length
        System.out.println("My array Length: " + numbers.length); // 3
        System.out.println("My first element Length: " + numbers[0].length + "\n"); // 4

        // Transversing a multidimensional array using nested for loop
        for (int row = 0; row < numbers.length; row++){
            System.out.println("Row " + row);
            for (int column = 0; column < numbers[row].length; column++){
                System.out.println("[" + row + "][" + column + "]: " + numbers[row][column]);
            }
            System.out.println(" ");
        }

        /*
        for (int row = 0; row < numbers.length; row++){ // display for comlumns
            System.out.println("Column " + row);
            for (int column = 0; column < numbers.length; column++){
                System.out.println("[" + column + "][" + row + "]: " + numbers[column][row]);
            }
            System.out.println(" ");
        }*/

        // using for each loop
        System.out.println("---FOR EACH ARRAY in Numbers---");
        System.out.println("** DISPLAY PER ROW**"); // rows
        int index = 0;
        for (int[] rows: numbers){
            System.out.println("Row " + index);
            for (int column: rows){
               System.out.println("[" + index + "][" + column + "]: " + column);
            }
            index += 1;
            System.out.println(" ");
        }

        Scanner scanner = new Scanner(System.in);
        // Declare MultiDimensional array with a specified size only
        String[][] planets = new String[2][5];

        // Get input for values in 2d array
        for (int row = 0; row < planets.length; row++){
            for (int column = 0; column < planets[row].length; column++){
                //System.out.println("[" + row + "][" + column + "]: " + numbers[row][column]);
                System.out.print("Enter Planet " + "[" + row + "][" + column + "]: " );
                planets[row][column] = scanner.nextLine();
            }
            System.out.println(" ");
        }

        for (String[] planetGroups: planets){
            System.out.println("Planets");
            System.out.print("[ ");
            for (String indivPlanets : planetGroups){
                System.out.print(indivPlanets + ",");
            }
            System.out.println(" ]");
        }




    }
}
