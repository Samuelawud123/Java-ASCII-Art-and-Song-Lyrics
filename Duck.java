/**
 * The class is to print a text-based duck vertically to the console 
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author Samuel Awud <samuel.awud@seattlecolleges.edu>
 * @version __________
 */

 public class Duck {
    // Represents a Duck and has methods to print one or multiple Ducks.
    public static void printDuck() {
        // Prints a single Duck in ASCII.

        System.out.println("              ____        ");
        System.out.println("           __|____|__     ");
        System.out.println("          |__________|    ");
        System.out.println("           ((      ))      ");
        System.out.println("          ((     O  ```)    ");
        System.out.println("          ((        ``)    ");
        System.out.println("           \\\\     x``       ");
        System.out.println("     (())    \\\\     X      ");
        System.out.println("    ((  ))~~~~      ))     ");
        System.out.println("  ((                 ))    ");
        System.out.println("((      ~~~~~~       ))    ");
        System.out.println("((     ~~~~~~~~      ))    ");
        System.out.println(" \\\\     ~~~~~~      //     ");
        System.out.println("  --__--__--__--__--__     ");
        System.out.println(" --__--__--__--__--__      ");
    }

    public static void printDucks() {
        // Calls printDuck() method to print multiple Ducks.
        for (int i = 1; i <= 5; i++){
            printDuck();
        }
    }

    public static void main(final String[] theArgs) {
        // Calls printDucks() method
        printDucks();
    }
}
