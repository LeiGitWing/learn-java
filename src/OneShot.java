import java.util.Scanner;
import java.util.Random;

public class OneShot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int number = 1 + random.nextInt(100);
        int guess;
        String response = "";

        System.out.print("I'm thinking of a number between 1-100. Try to guess it.\n> ");
        guess = keyboard.nextInt();

        if (guess < number) {
            response = "Sorry, you are too low. I was thinking of " + number + ".";
        }
        else if (guess > number) {
            response = "Sorry , you are too high. I was thinking of " + number + ".";
        }
        else {
            response = "You guessed it! What are the odds?!?";
        }
        System.out.println("\n" + response);
    }
}