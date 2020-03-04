import java.util.Scanner;
import java.util.Random;

public class WorstGussing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        int guessingNumber = randomNumber.nextInt(10) + 1;
        String response;

        // System.out.print("TEH WORST NUMBER GESSING GAME EVAR!!!!!!\nI'M THKING OF A NBR FROM 1-10. TRY 2 GESS! ");
        System.out.print("I'm thinking of a number from 1 to 10.\nYour guess: ");
        int number = keyboard.nextInt();
        if (number != guessingNumber) {
            response = "\nSorry, but I was really thinking of " + guessingNumber + ".";
        } else {
            response = "\nThat's right! My secret number was " + guessingNumber + "!";
        }
        System.out.println(response);
    }
}