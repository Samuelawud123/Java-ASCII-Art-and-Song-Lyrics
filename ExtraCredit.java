/**
 * The class is to print a text-based duck horizontally to the console
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author Samuel Awud <samuel.awud@seattlecolleges.edu>
 * @version __________
 */
public class ExtraCredit {
    // This class prints multiple ducks in ASCII art.

    public static void printDucks() {
        // This method prints the ASCII art for multiple ducks.
        // It uses a for loop to print each line of the ASCII art five times.
        // Each line represents a different part of the duck, such as the body, wings, and beak.
        for (int j = 0; j < 5; j++) {
            System.out.print("              ____        ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("           __|____|__     ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("          |__________|    ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("           ((      ))     ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("          ((     O  ``)   ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("          ((        ``)   ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("           \\\\     x``     ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("     (())    \\\\     X     ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("    ((  ))~~~~      ))    ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("  ((                 ))   ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("((      ~~~~~~       ))   ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("((     ~~~~~~~~      ))   ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print(" \\\\     ~~~~~~      //    ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print("  --__--__--__--__--__    ");
        }
        System.out.println();

        for (int j = 0; j < 5; j++) {
            System.out.print(" --__--__--__--__--__     ");
        }
        System.out.println();
    }

    public static void main(final String[] theArgs) {
        // This is the main method of the class, and it calls the printDucks() method to print the ducks.
        printDucks();
    }
}
