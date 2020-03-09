import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = 1 + random.nextInt(7);
        int dice2 = 1 + random.nextInt(7);
        int total = dice1 + dice2;
        System.out.println("HERE COMES THE DICE!\n");
        String response = "Roll #1: " + dice1 +"\nRoll #2: " + dice2 + "\nThe total is " + total + "!\n";

        // if dice1 == dice2 at the beginning
        if (dice1 == dice2) {
            System.out.println(response);

            // System.out.println("Roll #1: " + dice1 +"\nRoll #2: " + dice2 + "\nThe total is " + total + "!\n");
        } else {
            while (dice1 != dice2) {
                response = "Roll #1: " + dice1 +"\nRoll #2: " + dice2 + "\nThe total is " + total + "!\n";

                System.out.println(response);
                // System.out.println("Roll #1: " + dice1 +"\nRoll #2: " + dice2 + "\nThe total is " + total + "!\n");
                
                dice1 = 1 + random.nextInt(7);
                dice2 = 1 + random.nextInt(7);
                total = dice1 + dice2;
                // System.out.println("\n" + dice1 + "\n" + dice2);
            }
        }
        response = "Roll #1: " + dice1 +"\nRoll #2: " + dice2 + "\nThe total is " + total + "!\n";
        System.out.println(response);
        // System.out.println("Roll #1: " + dice1 +"\nRoll #2: " + dice2 + "\nThe total is " + total + "!\n");
    }
}