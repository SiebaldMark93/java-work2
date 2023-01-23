package Loops;

public class ForLoop {
    public static void main(String[] args) {

        //within the for loop, the parenthesis hold the variable, condition and the incrementation. As opposed to the while loop that only holds the condition in its ().
        for (int i = 0; i < 10; i++) {
            System.out.println("Test");
        }

        System.out.println();


        //Both get the same result.
        int i = 0;

        while (i < 10) {
            System.out.println("Test");
            i++;
        }
        System.out.println();

        for (int x = 1; x <= 15; x++) {
            System.out.println(x);
        }
        System.out.println();

        //How it looks like with decrementing
        for (int y = 700; y >= 500; y--) {
            System.out.println(y);
        }
    }
}
