package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here -- all code must be within these {} to run
        // variables
        // implicit typing - the type of the variable is dictated by its value
        //  e.g. in JavaScript const name = "Sam"

        // explicit typing - the type of variable is defined by programmer and value needs to match
        // e.g. int shoeSize = 11;

        int shoeSize = 11;

        char firstLetter = 'S';

        short smallishNumber = 2500;

        //rule for casting
        // byte -> short -> int -> long
        // Can only cast upwards (left to right) -- otherwise run into overflow!
        // why - to ensure that we can store the data we need and not lose any to lack of memory allocation

        int newInt = (int) smallishNumber;

        //array - holds multiple values & in Java has a fixed length
        int[] ages = {24, 66, 43, 21, 26, 77, 90, 55};

        System.out.println(ages.length);

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);

        }
//for each -- single:multiple of the array
        for (int age : ages) {
            System.out.println(age);
        }
// Scanner class -- will be replaced by front-end
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height in cm...");
        int height = scanner.nextInt();
        System.out.println(height);

        int tallEnough = 150;


        if (height > tallEnough) {
            System.out.println("Tall enough to ride");
        } else System.out.println("Sorry, you aren't tall enough");


        System.out.println("Where do you live? US or UK:");
        scanner.nextLine();
        String country = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();

        if ((country.equals("UK") && age >= 18 ) || (country.equals("US") && age >= 21)) {
            System.out.println("Enjoy your drink");
        } else System.out.println("Sorry, not old enough");



    }
}


