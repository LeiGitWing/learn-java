import java.util.Random;
import java.util.Scanner;

public class HiLoLimited {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int secretNumber = random.nextInt(100) + 1;
        // openning marks
        System.out.print("I'm thinking of a number btween 1-100. You have 7 guesses.\nFirst guess: ");
        int guessNumber = keyboard.nextInt();
        
        int guessTimes = 1;
        String response = "";
        // 
        while (guessTimes < 7) {
            if (guessNumber < secretNumber) {
                response = "Sorry, you are too low.";
                guessTimes++;
                System.out.print(response + "\nGuess # " + guessTimes + ": ");
                guessNumber = keyboard.nextInt();
                
            }
            else if (guessNumber > secretNumber) {
                response = "Sorry, that guess is too high.";
                guessTimes++;
                System.out.print(response + "\nGuess # " + guessTimes + ": ");
                guessNumber = keyboard.nextInt();
                
            }
            else if (guessNumebr == secretNumber) {
                response = "You guessed it! What are the odds?!?";
                // guessTimes++;
                System.out.print(response);
                guessTimes = 7;
                // guessNumber = keyboard.nextInt();
                
            }
        }
        System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
    }
}