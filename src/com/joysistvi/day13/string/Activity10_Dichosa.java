package com.joysistvi.day13.string;
import java.util.Scanner;

public class Activity10_Dichosa {
    public static void main(String[] args) {
        // contains() -> find out if a String contains a sequence of characters
        //      returns true if character/s exist and false if not

        // endsWith() -> checks whether a string ends with the specified character/s
        //      returns true if character/s exist at end of the string

        // startsWith() -> checks whether a string starts with the specified character/s
        //      returns true if character/s exist at start of the string

        // indexOf() -> find out the index of a specified string/char in a String
        //      returns the index value, -1 if not existent

        // trim() -> removes the whitespace from both end of a String
        //      returns a copy of the string without whitespace at both ends (leading and trailing)

        // replace() -> Searches a string for a specified value, and
        //      returns a new string where the specified values are replaced
        //      2 arguments is requested -> string to be searched for, and another string as replacement

        // toCharArray() -> Converts this string to a new character array
        //      returns an array of char

        Scanner sc = new Scanner(System.in);
        String word = "Philippines";
        System.out.println("\n\t------ STRING METHODS DEMO ------\n");

        // contains() demo
        System.out.println("\t\t--- [contains() DEMO] ---");
        boolean doesContain = word.contains("pine");
        System.out.println("The word " + word + " contains pine? " + doesContain);
        System.out.println("The word " + word + " contains Imman? " + word.contains("Imman"));

        // endsWith() demo
        System.out.println("\n\t\t--- [endsWith() DEMO] ---");
        String myVar = "pines";
        String myVar2 = "pi";
        System.out.println("The word " + word + " ends with " + myVar + " ? " + word.endsWith(myVar));
        System.out.println("The word " + word + " ends with " + myVar2 + " ? " + word.endsWith(myVar2));

        // startsWith() demo
        System.out.println("\n\t\t--- [startsWith() DEMO] ---");
        String myVar3 = "Phil";
        String myVar4 = "hill";
        String myVar5 = "hil";
        System.out.println("The word " + word + " starts with " + myVar3 + " ? " + word.startsWith(myVar3));
        System.out.println("The word " + word + " starts with " + myVar4 + " ? " + word.startsWith(myVar4));
        System.out.println("The word " + word + " starts with " + myVar5 + " ? " + word.startsWith(myVar5));

        // indexOf() demo
        System.out.println("\n\t\t--- [indexOf() DEMO] ---");
        char letter = 'i';
        char letter2 = 'e';
        String myVar6 = "lip";
        String myVar7 = "imman";
        System.out.println("The word is " + word);
        System.out.println("The index of " + letter + " is: " + word.indexOf(letter));
        System.out.println("The index of " + letter2 + " is: " + word.indexOf(letter2));
        System.out.println("The index of " + myVar6 + " is: " + word.indexOf(myVar6));
        System.out.println("The index of " + myVar7 + " is: " + word.indexOf(myVar7));

        // trim() demo
        System.out.println("\n\t\t--- [trim() DEMO] ---");
        //System.out.print("Enter Word with many random spaces: ");
        //String userWord = sc.nextLine().trim();
        String myVar8 = "     Spacing  ";
        System.out.println("Your word is: " + myVar8.trim());

        // replace() demo
        System.out.println("\n\t\t--- [replace() DEMO] ---");
        String searchedWord = "ippines";
        String replacementWord = "lips";
        System.out.println("My word is " + word);
        System.out.println("I want to replace " + searchedWord + " with " + replacementWord);
        System.out.println("The result is: " + word.replace(searchedWord, replacementWord));
        System.out.println("Replacing p with d: " + word.replace("p", "d"));

        // toCharArray() demo
        System.out.println("\n\t\t--- [toCharArray() DEMO] ---");
        String myStr = "Hello";
        char[] myArray = myStr.toCharArray();
        System.out.println("The word " + myStr + " is a " + myStr.getClass().getSimpleName());
        System.out.println("The word " + myStr + " is now a " + myArray.getClass().getSimpleName());
        

        /* Stretch goal
        String country = "Philippines";
        -> display first and last char
        -> count and display how many times P/p appears
        -> count and display total number of vowels
         */

        System.out.println("\n\t\t\t-----STRETCH GOAL-----");

        String country = "Philippines";
        System.out.println("Country: " + country);

        // display first and last char
        char firstChar = country.toCharArray()[0];
        char lastChar = country.toCharArray()[country.length() - 1];
        System.out.println("\nThe first char is: " + firstChar);
        System.out.println("The last char is: " + lastChar);

        // count and display P/p appears
        String ignoredCaseCountry = country.toLowerCase();
        int counter = 0;
        for (char letters : ignoredCaseCountry.toCharArray()){
            if (letters == 'p'){
                counter++;
            }
        }
        System.out.println("\nNumber of P/p is: " + counter);

        //count and display total number of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] containedVowels = new char[country.length()];
        int vowelCounter = 0;

        for (int i = 0; i < country.length(); i++){
            char currentChar = country.charAt(i);

            for (char vowel : vowels){
                if (currentChar == vowel){
                    containedVowels[vowelCounter] = currentChar;
                    vowelCounter++;

                }
            }
        }

        System.out.println("\nThe country " + country + " consist of " + vowelCounter + " vowels");
        System.out.print("Vowels founds: " );
        for (int i = 0; i < vowelCounter; i++){
            System.out.print(containedVowels[i] + " ");
        }

    }
}
