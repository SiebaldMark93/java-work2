package IfElse;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //Switch statements are like a specialized if statement.
        //They are useful when you want to compare a single variable to against a number of values.


        //If statement
//        if (num == 1) {
//            System.out.println("You entered one.");
//        }
//        else if (num  ==2) {
//            System.out.println("You entered two.");
//        }
//        else {
//            System.out.println("Invalid number.");
//        }

        //Switch statement
        //they are written with cases
        switch (num) {
            //This is saying num will be compared.  In the case that num is 1, it will run that code.
            case 1:
                System.out.println("You entered one.");
                break;  //breaks are used to make sure the flow of control does not run into the next case and start executed code that it should not.
            case 2:
                System.out.println("You entered two.");
                break;
            //switch also has a default case.  It works like an else block, only running if none of the other cases match.
            default:
                System.out.println("Invalid number.");
                break;
        }
    }
}
