import java.util.Scanner;
import java.util.Random;

public class WorstGussing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumber = new Random();
        int guessingNumber = randomNumber.nextInt(10) + 1;
        String response;

        // System.out.print("TEH WORST NUMBER GESSING GAME EVAR!!!!!!\nI'M THKING OF A NBR FROM 1-10. TRY 2 GESS! ");
        // openning marks
        System.out.print("I have chosen a number between 1 to 10. Try to guess it.\nYour guess: ");
        int number = keyboard.nextInt();
        int tries = 1;

        do {
            System.out.print("That is incorrect. Guess again.\nYour guess: ");
            number = keyboard.nextInt();
            tries++;
        } while (number != guessingNumber);

        // while (number != guessingNumber) {
        //     tries++;
        //     // response = "\nSorry, but I was really thinking of " + guessingNumber + ".";
        //     System.out.print("That is incorrect. Guess again.\nYour guess: ");
        //     number = keyboard.nextInt();
        // } 

        response = "\nThat's right! You're a good guesser.";
        
        System.out.println(response + "\nIt only took you " + tries + " tries.");
    }
}