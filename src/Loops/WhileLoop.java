package Loops;

public class WhileLoop {
    public static void main(String[] args) {

        //In an if statement, when the end of the body is complete the program will continue.
        //In a while statement, the program will loop back to the top and check the condition and run until it is met.
        //While loops will run as long as the condition is true, until it is false.

        //Creating a variable will prevent an infinite loop.
        int i = 0;

        //replace 5 with the variable i
        while (i < 10) {
            System.out.println("Test");
            //i will be called upon inside the loop.
            //to increment i by 1 each time there are three ways.
//            i = i + 1;
//            i += 1;

            i++;  //this is the most common shorthand use

            //can also use the decrement i-- to decrement
        }
    }
}
