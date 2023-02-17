package UserInputs;
import java.util.Scanner;

public class Formatting {
    public static void main(String[] args) {
        //Answer should be 1.8, but java uses floating point arithmetic
        System.out.println(4.5 - 2.7);
        //This format code does nothing
//        System.out.format("I have 3 rings", 5);
        //by adding the %d and adding a number after the comma.  Results change.
        //%d is called a format specifier, it replaces with the specified integer value.
        //format supplies the method with two arguments separated by the comma inside the ().
        System.out.format("\nI have %d rings", 5);
        //%s is used to replace with a string like "french hens"
        System.out.format("\nI have %d rings, %d calling birds, and %d %s", 5, 4, 3, "french hens");
        //for every %d and %s there must be values in place separated by commas.
        System.out.format("\nI have %d golden rings, %d calling birds", 5, 4);
        //%f replaces floats and double values
        System.out.format("\nI have %d golden rings, %f battery life, %s", 5, 75.5, "I am good to go!");
        //notice that %f rounds to six decimal places.  Putting %.1f means it will round the decimal to one decimal place.
        System.out.format("\nI have %.1f%s battery life left, %s", 75.5, "%", "I don't need a charger yet.");
    }
}
