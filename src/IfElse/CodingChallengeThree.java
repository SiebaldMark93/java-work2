package IfElse;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CodingChallengeThree {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        int x = 5;
//        int y = 10;

        //Exercise 1
//        if (x > y) {
//            System.out.println("x is bigger than y.");
//        }
//        else if (x < y) {
//            System.out.println("x is smaller than y.");
//        }
//        else {
//            System.out.println("x and y are the same.");
//        }

        //Exercise 2
//        if (x > y) {
//            System.out.println("x is bigger than y. " + (x - y));
//        }
//        else if (x < y) {
//            System.out.println("x is smaller than y. " + (y -x));
//        }
//        else {
//            System.out.println("x and y are the same.");
//        }

        //Exercise 3
//        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
//
//        System.out.println("I am thinking of a number between 1 and 5.  Can you guess it?");
//
//        System.out.print("Your guess: ");
//        Scanner scanner = new Scanner(System.in);
//        int guess = scanner.nextInt();
//
//        if (guess == randomNumber) {
//            System.out.println("Correct! Wow what a lucky guess.");
//        }
//        else {
//            System.out.println("Oops! sorry, better luck next time.");
//        }

        //Exercise 4
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("I am thinking of a number between 1 and 5.  Can you guess it?");

        System.out.print("Your guess: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("Correct! What a lucky guess.");
        }
        else {
            System.out.println("Oops!  Sorry, guess again.");
            System.out.println("Your second guess: ");

            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Correct! About time.");
            }
            else {
                System.out.println("Wrong again!  You are out of guesses.");
            }
        }
    }
}
