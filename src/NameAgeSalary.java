import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello, What is your name?");
        String name = keyboard.next();

        System.out.println("\nHi, " + name + "!  How old are you?");
        int age = keyboard.nextInt();

        System.out.println("\nSo you're " + age + ", eh?  That's not old at all!");
        System.out.println("How much do you make, " + name + "?");
        double salary = keyboard.nextDouble();

        System.out.println("\n" + salary + "!  I hope that's per hour and not per year! LOL!");
    }
}