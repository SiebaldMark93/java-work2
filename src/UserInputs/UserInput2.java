package UserInputs;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        //when new Scanner is typed, inside the () will have System.in.
        //This tells our scanner to read from the system's input
        // new Scanner will then be assigned a variable Scanner m.
        Scanner m = new Scanner(System.in);
        //.next method is causing program to wait for an input
        //to grab the input, we need to store it in a variable like String n
        //n will contain the input string "Hello"
        String n = m.next();
        System.out.println(n);
    }
}
