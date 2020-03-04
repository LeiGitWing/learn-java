import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = 1 + random.nextInt(7);
        int dice2 = 1 + random.nextInt(7);
        int total = dice1 + dice2;

        System.out.println("HERE COMES THE DICE!\n");
        System.out.println("Roll #1: " + dice1 +"\nRoll #2: " + dice2 + "\nThe total is " + total + "!");
    }
}