package UserInputs;

import java.util.Scanner;
//Scanner is a class - must import the Scanner above.

public class UserInput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = scanner.nextLine();
        System.out.printf("You entered %s", input);
    }
}
