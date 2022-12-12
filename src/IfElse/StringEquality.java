package IfElse;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //comparing strings, unusual method
        System.out.println("pasta" == "pasta");

        //Easier method will use the equality method
        System.out.println(("pasta".equals("pasta")));

        //Enter a VIP lounge in a bar if you are 18 years or older and have a valid VIP pass.
        System.out.println("The VIP Lounge");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println("Do you have a VIP pass?  yes/no: ");
        String vipPassReply = scanner.next();

        //We can add a third condition like free if you are 50 years old or older. Using ||
        if (age >= 18 && vipPassReply.equals("yes") || age >= 50 ) {
            System.out.println("Please enjoy your time.");
        }
        else {
            System.out.println("Sorry, you can't come in.");
        }
    }
}
