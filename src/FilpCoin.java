import java.util.Random;
import java.util.Scanner;

public class FilpCoin {
    public static void main(String[] args) {
        Random random = new Random();
        int randomFilp;
        randomFilp = random.nextInt(2);
        String coin = "TAILS";
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        String filpTheCoinMessage = "You flip a coin and it is...";
        String askingMessage = "Would you like to flip again (y/n)? ";


        do {
            if (randomFilp == 0) {
                coin = "HEADS";
            } else {
                coin = "TAILS";
            }
            randomFilp = random.nextInt(2);
            System.out.println(filpTheCoinMessage + coin);
            System.out.print(askingMessage);
            input = keyboard.next();
        } while (input.equals("y"));

        // System.out.println(filpTheCoinMessage + coin);
        // System.out.print(askingMessage);
        // input = keyboard.next();

        // while (input.equals("y")) {
        //     if (randomFilp == 0) {
        //         coin = "HEADS";
        //     } else {
        //         coin = "TAILS";
        //     }
        //     randomFilp = random.nextInt(2);
        //     System.out.println(filpTheCoinMessage + coin);
        //     System.out.print(askingMessage);
        //     input = keyboard.next();   
        // }
    }
}