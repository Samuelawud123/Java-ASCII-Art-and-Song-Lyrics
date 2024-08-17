/**
 * The class is to print out the lyrics of the song Five Little Ducks
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author Samuel Awud <samuel.awud@seattlecolleges.edu>
 * @version __________
 */

public class Lyrics {
// Represents a class that outputs the lyrics of the "Five Little Ducks" song.

    private static void fiveLittleDucks() {
    // prints the lyrics for five little ducks.
        System.out.println("Five little ducks went out one day,");
        overAndMother();
        System.out.println("But only four little ducks came back.\n");
        printQuackQuack();
        System.out.println("But only four little ducks came back.\n");
    }

    private static void fourLittleDucks() {
    // prints the lyrics for four little ducks.
        System.out.println("Four little ducks went out one day,");
        overAndMother();
        System.out.println("But only three little ducks came back.\n");
        printQuackQuack();
        System.out.println("But only three little ducks came back.\n");
    }

    private static void threeLittleDucks() {
    // prints the lyrics for three little ducks.    
        System.out.println("Three little ducks went out one day,");
        overAndMother();
        System.out.println("But only two little ducks came back.\n");
        printQuackQuack();
        System.out.println("But only two little ducks came back.\n");
    }

    private static void twoLittleDucks() {
    // prints the lyrics for two little ducks.
        System.out.println("Two little ducks went out one day,");
        overAndMother();
        System.out.println("But only one little duck came back.\n");
        printQuackQuack();
        System.out.println("But only one little duck came back.\n");
    }

    private static void oneLittleDucks() {
    // prints the lyrics for one little duck.
        System.out.println("One little duck went out one day,");
        overAndMother();
        System.out.println("But none of the five little ducks came back.\n");
        printQuackQuack();
        System.out.println("But none of the five little ducks came back.\n");
    }

    private static void sadMotherDuck() {
    // prints the lyrics for sad mother duck.
        System.out.println("Sad mother duck went out one day,");
        overAndMother();
        System.out.println("And all of the five little ducks came back. \n");
        printQuackQuack();
        System.out.println("And all of the five little ducks came back. ");
    }

    private static void overAndMother(){
    // print the middle two lines for every verse
        System.out.println("over the hill and far away.");
        System.out.println("Mother duck said, \"Quack, quack, quack, quack.\"");

    }
    private static void printQuackQuack(){
    //print the single line to be used after every verse
        System.out.println("Quack, quack, quack, quack, quack, quack."); 
    }

    public static void main(final String[] theArgs) {
        //calls various methods to print the lyrics.
            fiveLittleDucks();
            fourLittleDucks();
            threeLittleDucks();
            twoLittleDucks();
            oneLittleDucks();
            sadMotherDuck();
        }

}
