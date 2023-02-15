package UserInputs;

import java.util.Scanner;

public class writingQuestionAndAnswerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println(userName + " is a cool name.");

        System.out.println("\nHow old are you, " + userName + "?");
        int userAge = scanner.nextInt();
        System.out.println("\nYou are " + userAge + "!");
        System.out.println("So your name is " + userName + " and you are " + userAge + " years old. Nice to meet you.");
    }

}
