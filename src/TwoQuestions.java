import java.util.Scanner;

public class TwoQuestions {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer1, answer2, response;
        response = "";

        System.out.print("TWO QUESTIONS!\nThink of an object, and I'll try to guess it."
            + "\nQuestion 1) Is it animal, vegetable, or mineral?\n> ");
        answer1 = keyboard.next();

        System.out.print("\nQuestion 2 ) Is it bigger tahn a breadbox?\n> ");
        answer2 = keyboard.next();

        if (answer1.equals("animal")) {
            if (answer2.equals("no")) {
                response = "squirrel";
            }
            else {
                response = "moose";
            }
        }
        else if (answer1.equals("vegetable")) {
            if (answer2.equals("no")) {
                response = "carrot";
            }
            else {
                response = "watermelon";
            }
        }
        else if (answer1.equals("mineral")) {
            if (answer2.equals("no")) {
                response = "paper clip";
            }
            else {
                response = "Camaro";
            }
        }
        System.out.println("My guess is that your are thinking of a " + response + ".\nI would ask you if I'm right, but I don't actually care.");

    }
}