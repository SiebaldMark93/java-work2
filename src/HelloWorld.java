public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        shoppingList();
        shoppingList2();
        ice();
    }
    //Exercise 1
    //Create a program which produces the following output:
    //SHOPPING LIST
//        - Milk
//            > Semi-skimmed
//            > Medium
//        - Eggs
//            > Free-ranged
//        - Bread

    public static void shoppingList () {
        System.out.println("Shopping List");
        System.out.println("\t - Milk");
        System.out.println("\t \t > Semi-skimmed");
        System.out.println("\t \t > Medium");
        System.out.println("\t -Eggs");
        System.out.println("\t \t > Free-ranged");
        System.out.println("\t - Bread");
    }

    //Exercise 2:  Rewrite exercise 1 using one print/ln
    public static void shoppingList2 () {
        System.out.print("Shopping List\n \t - Milk\n \t \t > Semi-skimmed\n \t \t > Medium\n \t - Eggs\n \t \t > Free-ranged\n \t - Bread");
    }

    //Exercise 3:
    //The
    //  Ice Cream
    //Is        So
    //  Delicious.
    public static void ice () {
        System.out.println("\nThe");
        System.out.println("\t Ice Cream\n");
        System.out.print("Is\t \t\t\tSo\n");
        System.out.print("\t Delicious.");
    }
}
