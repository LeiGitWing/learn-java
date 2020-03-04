import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int theOne = 1 + r.nextInt(4);
        int guess;
        String response;
        String card1 = "\n\t##\n\t##\n\t##\n\t1";
        String card2 = "\n\t##\n\t##\n\t##\n\t2";
        String card3 = "\n\t##\n\t##\n\t##\n\t3";

        System.out.println("You slide up to Fast Eddie's card table and plop dowm your cash.\nHe glances at you out of the corner of his eye and starts shuffing.\nHe lays down three cards.");
        System.out.print("Which one is the ace?" + card1 + card2 + card3 + "> ");
        guess = keyboard.nextInt();

        if (guess != theOne) {
            
            response = "Ha! Fast Eddie wins again! The ace was card number " + theOne ;
            // 这里要把#替代成AA
            if (guess == card1) {
                String card1 = card1.replace("#", "A");
            }
            else if (guess == card2) {
                String card2 = card2.replace("#", "A");
            }
            else {
                String card3 = card3.replace("#", "A");
            }
        }
        else {
            response = "You nailded it! Fast Eddie reluctantly hands over your winnings, scowling.";
            if (guess == card1) {
                String card1 = card1.replace("#", "A");
            }
            else if (guess == card2) {
                String card2 = card2.replace("#", "A");
            }
            else {
                String card3 = card3.replace("#", "A");
            }
        }
        System.out.println("\n" + response + "\n" + card1 + card2 + card3);
    }
}