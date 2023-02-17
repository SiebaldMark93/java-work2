package Loops;

public class breakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //if we wanted to have to stop the loop before it has fully completed, we can use a "break" inside an "if" statement
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        for (int i = 2; i <= 6; i++) {
            //"continue" statement will cause the loop to skip over a specific value
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
