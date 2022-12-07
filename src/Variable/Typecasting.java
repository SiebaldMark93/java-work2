package Variable;

public class Typecasting {
    public static void main(String[] args) {
        //converting one type of data type to another
        //Ex - converting int to a double
        int glass = 10;
        //Implicit typecast/ conversion - int is converted into a double before it gets assigned to cup.
        double cup = glass;
        System.out.println(glass);
        System.out.println(cup);

        //** doubles can't be converted into ints **
        //to explicitly cast a double into an int
        double plate = 3.14;
        //Adding the (int) will allow this code to run but will only show a whole number
        int fork = (int)plate;
        System.out.println(plate);
        System.out.println(fork);

        //casting does not change or modify the original value of a data type, but creates a new value

        //Casting can help with divisions
        // if the variables must remain ints, you can cast (double) in the println
        int num = 18;
        int num2 = 4;

        System.out.println(num / num2);
        System.out.println((double) num / num2);
        System.out.println(num / (double) num2);
        System.out.println(((double) num) / num2);
    }
}
