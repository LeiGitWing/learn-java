import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your first number? ");
        double num1 = keyboard.nextDouble();
        System.out.print("What is your second number? ");
        double num2 = keyboard.nextDouble();
        System.out.print("What is your third number? ");
        double num3 = keyboard.nextDouble();
        System.out.println("\n(" + num1 + " + " + num2 + " + " + num3 + ") / 2 is... " + ((num1+num2+num3)/2) );
    }
}