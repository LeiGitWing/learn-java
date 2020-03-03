import java.util.Scanner;

public class WorstGussing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int guessingNumber = 6;
        String response;

        System.out.print("TEH WORST NUMBER GESSING GAME EVAR!!!!!!\nI'M THKING OF A NBR FROM 1-10. TRY 2 GESS! ");
        int number = keyboard.nextInt();
        if (number != guessingNumber) {
            response = "\nWOOT! U SUXOR!!! I PWN 00!!! IT WAS " + guessingNumber + "!";
        } else {
            response = "\nLOL!!! U GOT IT! I CANT BELEIVE U GESSED IT WAS " + guessingNumber + "!";
        }
        System.out.println(response);
    }
}