package UserInputs;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CodingChallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = scanner.next();

        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");

        System.out.println("Amount of money in your pocket: f");
        double money = scanner.nextDouble();

        System.out.println(money);

        double moneyNeeded = Math.ceil(money) - money;
        System.out.println("You have ");
    }
}
