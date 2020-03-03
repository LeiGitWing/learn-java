import java.util.Scanner;

public class LittleQuiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score = 0;
        String response1, response2, response3;

        System.out.print("Are you ready for a quiz? ");
        String answer = keyboard.next();
        if (answer.equals("N")) {
            System.out.println("Okay, here it comes!");
        }

        // quiz1
        System.out.println("\nQ1) What is the capital of Alaska?\n\t1) Melbourne\n\t2) Anchorage\n\t3) Juneau");
        System.out.print("> ");
        String answer1 = keyboard.next();
        if (answer1.equals("3")) {
            response1 = "That's right";
            score ++;
        }
        else {
            response1 = "Wrong!";
        }
        System.out.println(response1);

        //quiz 2
        System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int?\n\t1) yes\n\t2) no");
        System.out.print("> ");
        String answer2 = keyboard.next();
        if (answer2.equals("2")) {
            response2 = "Great!";
            score ++;
        }
        else {
            response2 = "Sorry, \"cat\" is a string. ints can only store numbers.";
        }
        System.out.println(response2);

        //quiz 3
        System.out.println("\nQ3) What is the resule of 9+6/3?\n\t1) 5\n\t2) 11\n\t3) 15/3");
        System.out.print("> ");
        String answer3 = keyboard.next();
        if (answer3.equals("2")) {
            response3 = "That's correct!";
            score ++;
        }
        else {
            response3 = "Wrong";
        }
        System.out.println(response3);

        System.out.println("\n\nOverall, you got " + score + " out of 3 correct.\nThanks for playing!");
    }
}