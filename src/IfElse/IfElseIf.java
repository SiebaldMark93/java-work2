package IfElse;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome to the bumper cars.");
        System.out.print("Please enter your height in centimeters: ");
        int height = scanner.nextInt();


        //First way to write if code
//        if (height < 130) {
//            System.out.println("Sorry you are not tall enough to ride.");
//        }
//
//        if (height >= 130) {
//            System.out.println("Please enjoy the ride!");
//        }

        //Using Else
        //true
//        if (height < 130) {
//            System.out.println("Sorry you are not tall enough to ride.");
//        }
//        //use else if for another argument
//        else if(height > 210) {
//            System.out.println("You are too tall to ride.");
//        }

        //the if and else if statements above can be simplified below
        // || is the or operator
        if (height < 130 || height > 150) {
            System.out.println("You are not allowed to ride, sorry.");
        }

        //can add another else if, if need be.
        else if(height == 150) {
            System.out.println("Go right ahead.");
        }
        //false
        else {
            System.out.println("Please enjoy the ride");
        }

        //if starts first and else is always last in an if else statement.
    }
}
