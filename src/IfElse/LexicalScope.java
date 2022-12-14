package IfElse;
import java.util.Scanner;

public class LexicalScope {
    public static void main(String[] args) {

        //you can create a variable and reassign it within the if statement.
//        int x = 10;

        //however you can't declare a variable within the if statement and call it outside after.

//        if (true) {
//            x = 20;
//            int y = 30;
//        }
//        error will occur.
//        y = 31;

        //moving line 25 outside of if statement
//        int numPets;

//        if (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("How many pets do you own: ");
////            int numPets = scanner.nextInt();
//
//            //now that numPets is declared outside we can input the scanner.
//            numPets = scanner.nextInt();
//        }
//        // can't call the variable numPets outside the scope of the if.
////        System.out.println(numPets); //Will result in an error.
//        //instead declare the int outside the if statement to be able to call it from either outside or within the if.
//        //now we can print out numPets.
//        System.out.println("Cool, you have " + numPets + " pets.");

        //What if the if statement had a parameter of false?
        //you would declare numPets to equal a number below zero
        int numPets = 1;

        if (false) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("How many pets do you own: ");
            numPets = scanner.nextInt();
            System.out.println("Cool you have " + numPets + " pets.");
        }

    }
}
