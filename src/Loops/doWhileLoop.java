package Loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class doWhileLoop {
    public static void main(String[] args) {
//        //Do while loops are the same as a while loop, except the condition is checked last rather than first
//
//        int i= 0;
//
//        do {
//            i++;
//        } while (i < 5);
//
//        //While loop show below, shows the reverse
//        int y = 0;
//        while (y < 5) {
//            y++;
//        }


        /*Write a program that roles a six sided die.
          To do this, you will need to import a java class from util that generates a random number.
         */
        /*Next we will specify the number range from 1 to 6.
          Do this by inputting (1, 7) in the nextInt().
          1 is inclusive and 7 is exclusive.
         */
//        int num = ThreadLocalRandom.current().nextInt(1, 7);
//        System.out.println("You rolled a "  + num + "!");

        /*To have the program repeat itself, you can surround the code in a "do while" loop.
          Next we will ask the user if they would like to roll the dice again.
          Do this by inputting a scanner.
         */

        Scanner scanner = new Scanner(System.in);
        String again;

        do {
        int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("You rolled a " + num + "!");
            //Ask the user to roll again
            System.out.print("Would you like to roll again? y/n: ");
            /*Store the user's answer of (y/n) in a String variable
              Declare the String variable outside the do while to be able to access it both inside and outside the loop.
             */

             again = scanner.next();
             //equals will grab the user's response of "y", otherwise "n" or any other value will be deemed false and stop the loop.
            //Do while loop will keep running until the user inputs "n" or false.
        } while(again.equals("y"));

        //To reverse the boolean statement
//        do {
//            int num2 = ThreadLocalRandom.current().nextInt(1, 7);
//            System.out.println("You rolled " + num2 + "!");
//            //Ask to stop rolling
//            System.out.print("Stop rolling? y/n: ");
//            again = scanner.next();
//            //using the reverse operator "!" reverses the input of y from previous do while loop and stops the loop if "y" is inputted.
//        } while(!again.equals("y"));


    }
}
