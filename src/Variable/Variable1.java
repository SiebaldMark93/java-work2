package Variable;

public class Variable1 {
    public static void main(String[] args) {
        //We don't need to identify the type of x after identifying x the first time
//        int x = 25;
//        System.out.println(x);
//        x = 35;
//        System.out.println(x);
//        x = -1500;
//        System.out.println(x);

        //(Declaring the variable x) = (initializing the variable)
//        int x = 4;
//        int y = 2;
//        x = x + y - x;
//        System.out.println(x);

        //Can declare variable on one line and initialize it on another line.
//        int x;
//        x = 4;
//        System.out.println(x);

        //integer division
        System.out.println(10 / 2);
        //java will only perform integer division when two integers are involved
        System.out.println(10 / 3);
        //in order to get the decimal solution, at least one operand needs to be a double not an int
        System.out.println(10.0 / 3);
        System.out.println(10.0 / 3.0);
        System.out.println(10 / 3.0);

        //can be done the same with variables
        int a = 18;
        int b = 7;
        System.out.println(a / b);
        //Answer will be = 2
        //To get the true answer, change one of the variable types to a double
        double c = 18;
        int d = 7;
        System.out.println(c / d);
    }
}
