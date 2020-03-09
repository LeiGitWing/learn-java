import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int theOne = 1 + r.nextInt(3);
        int guess;
        String response;
        String line1 = "\n\t##  ##  ##";
        String line2 = "\n\t##  ##  ##";
        String line3 = "\n\t1   2   3";

        System.out.println("You slide up to Fast Eddie's card table and plop dowm your cash.\nHe glances at you out of the corner of his eye and starts shuffing.\nHe lays down three cards.");
        System.out.print("Which one is the ace?" + line1 + line2 + line3 + "\n> ");
        guess = keyboard.nextInt();

        if (guess == theOne) {
            response = "You nailded it! Fast Eddie reluctantly hands over your winnings, scowling.";
            // change the # symbol
            if (theOne == 1) {
                line1 = "\n\tAA  ##  ##";
                line2 = "\n\tAA  ##  ##";
            }
            else if (theOne == 2) {
                line1 = "\n\t##  AA  ##";
                line2 = "\n\t##  AA  ##";

            }
            else if (theOne == 3){
                line1 = "\n\t##  ##  AA";
                line2 = "\n\t##  ##  AA";

            }
        }
        else {
            response = "Ha! Fast Eddie wins again! The ace was card number " + theOne ;

            if (theOne == 1) {
                line1 = "\n\tAA  ##  ##";
                line2 = "\n\tAA  ##  ##";
            }
            else if (theOne == 2) {
                line1 = "\n\t##  AA  ##";
                line2 = "\n\t##  AA  ##";

            }
            else if (theOne == 3){
                line1 = "\n\t##  ##  AA";
                line2 = "\n\t##  ##  AA";

            }
        }
        System.out.println("\n" + response + "\n" + line1 + line2 + line3);
    }
}