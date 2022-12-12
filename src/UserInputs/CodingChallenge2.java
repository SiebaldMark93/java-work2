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
        //Print out the number of characters in your name
        System.out.println("Your name is " + firstName.length() + " characters long.");

        //Print "You've lived x years.  In another x years you'll be 2x years old." Where x is age
        System.out.println("You lived " + age + " years." + " In another " + age + " years you'll be " + (age * 2) + " years old." );

        System.out.println("Amount of money in your pocket: ");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;
        System.out.format("You have %.2f on you and you need %.2f.", money, moneyNeeded);

        //Calculate the bill
        System.out.println("\nRestaurant Bill Calculator\n");
        System.out.println("Enter bill total: ");
        double bill = scanner.nextDouble();

        System.out.println("Enter number of people: ");
        int people = scanner.nextInt();

        double eachPay = bill / people;

        System.out.format("A bill of %.2f split between " + people + " people comes to approximately %.2f each", bill, eachPay);
    }
}
