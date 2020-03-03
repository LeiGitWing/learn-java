import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 

        System.out.println("Give me a word!");
        String word = keyboard.next();

        System.out.println("Give me a second word!");
        String sec_word = keyboard.next();

        System.out.println();
        System.out.println("Great, now your favrite number?");
        int num1 = keyboard.nextInt();
        System.out.println("And your second-favorite number...");
        int num2 = keyboard.nextInt();

        System.out.println();
        System.out.println("Whew! Wasn't that fun?");
    }
}