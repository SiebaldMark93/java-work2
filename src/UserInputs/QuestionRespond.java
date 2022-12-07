package UserInputs;
import java.util.Scanner;

public class QuestionRespond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name.");

        System.out.println("\nHow old are you, " + userName + "?");
        //.nextInt scans an int or a number.
        int userAge = scanner.nextInt();
        System.out.println("\nSo your name is " + userName + " and you are " + userAge + " years old.");
    }
}
