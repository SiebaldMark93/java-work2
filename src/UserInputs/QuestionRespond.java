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

        System.out.println("\nHow tall are you in meters?");
        double userHeight = scanner.nextDouble();
        System.out.println("\n" + userName + " you are " + userHeight + " meters tall.");

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;
        System.out.println("\nThe difference between your height and the average is: ");
        System.out.format("%.2fm if you are a male.", averageMaleHeightDifference);
        System.out.format("\n%.2fm if you are a female.", averageFemaleHeightDifference);
    }
}
