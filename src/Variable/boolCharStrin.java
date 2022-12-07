package Variable;

public class boolCharStrin {
    public static void main(String[] args) {
        int a = 32;
        double b = 2.14;
        boolean c = false;
        //booleans are only true or false
        System.out.println(c);


        //chars are based on unicode
        System.out.println('b');
        char e = 'f';
        System.out.println(e);
        //unicode 65 = A
        char f = 65;
        System.out.println(f);
        //unicodes range from 0 to 65535 with each code representing a symbol
        //unicode 169 is the copyright symbol
        char g = 169;
        System.out.println(g);

        char d = '\u005A';
        System.out.println(d);

        //Strings are texts written between ""
        System.out.println("Wassup world!");
        //Define string
        String j = "Just messing around!";
        System.out.println(j);
        //join to strings using + (string concatination)
        System.out.println("Fan" + "tastic");
        //Be mindful of spacing
        String m = "Mark";
        System.out.println("My" + "name" + "is" + m);
        //two ways to space
        System.out.println("My " + "name " + "is " + m);
        System.out.println("My" + " " + "name" + " " + "is" + " " + m);


    }
}
