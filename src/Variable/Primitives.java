package Variable;

public class Primitives {
    public static void main(String[] args) {
        //Primitive Data Types
        // Data Type    |   Value Range
        // byte         |   -128 to 127
        // short        |   -32768 to 32767 ( 2 bytes of memory)
        // int          |   -2147483648 to 2147483648 (4 bytes of memory)
        // long         |   -9223372036854775808 to 9223372036854775807
        // float        |   varies (decimals)
        // double       |   varies (decimals) default data type for decimals
        // boolean      |   true/false
        // char         |   0 to 65535

        int guitar = 20;
        double x = 2.5;
        double y = guitar - x;
        System.out.println(guitar - x);
        System.out.println(y);
    }
}
