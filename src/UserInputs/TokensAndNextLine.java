package UserInputs;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TokensAndNextLine {
    public static void main(String[] args) {
        //These methods only scan single tokens.
        //Token is an individual word or number.
        Scanner scanner = new Scanner(System.in);
//        scanner.next();
//        scanner.nextInt();
//        scanner.nextDouble();
//        boolean b = scanner.nextBoolean();
        //The Sky is blue. - This string consists of four tokens, one for each word.

        System.out.println("What is your name?");
        //String userName = scanner.next();
        //System.out.println(userName + " is your name.");
        //Result of this will only print out one word, or one token, if you wanted to input your full name.

        //One way to solve this problem is to create another variable.
        //first scanner will call the first token and the second will call the last token.
        //String firstName = scanner.next();
        //String lastName = scanner.next();
        //System.out.println("So your name is " + firstName + " " + lastName);

        //Better method is to use the nextLine method
        //This method will read all the tokens of one line.

        String userName = scanner.nextLine();
        System.out.println("So your name is " + userName);

    }
}
