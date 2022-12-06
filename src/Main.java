public class Main {
    public static void main(String[] args) {
        //Escape Sequences
        //Use \n after a string to print each word on separate lines
        System.out.print("Welcome\n");
        System.out.print("Hello, World!\n");
        System.out.print("Let's do this!");

        //Using System.out.println to print each word on separate lines without \n
        System.out.println("Welcome!");
        System.out.println("This sentence is now on a new line.");
        System.out.println("Pretty cool right?");

        // \t inserts a tab
        System.out.println("\t Watch this.");
        System.out.println("Super\tman!");
        System.out.println("S\tt\to\tp!");

        // \b = backspace (will delete the character before it.
        System.out.println("Helll\bo");
        System.out.println("Misss\biss\bsip\bppii\b");
        System.out.println("Boo\bo\bo\bo\boo!");

        //To add quotations inside a sout function use \ before each "".
        //Example The dog said "woof", then sat down.
        System.out.println("The dog said \"woof\", then sat down.");
        //To include a \ inside a string, use double \\.
        System.out.println("c\\folder\\pic");
        //Can also use single quotes inside the double "".
        System.out.println("The dog said 'woof', then sat down.");
        //Call sample method here in order for it to print out.
        sample();
    }
    //Method calling/ Invoking a method
    //To tell the sample method when to run, you have to call it inside the main method.
    public static void sample () {
        System.out.println("Truck");
        System.out.println("Car");
        System.out.println("SUV");
    }
}
