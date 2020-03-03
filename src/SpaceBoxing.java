import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double planetWeight, weight;
        String choice = "";
        planetWeight = 0;

        System.out.print("Please enter your current earth weight: ");  //lbs
        weight = keyboard.nextDouble();
        System.out.println("\nI have information for the follwing planets:\n\t  1. Venus  \t2. Mars  \t 3.Jupiter\n\t  4. Saturn  \t5. Uranus  \t6. Neptune");
        System.out.print("Which planet are you visiting? ");
        choice = keyboard.next();

        if (choice.equals("1")) {
            planetWeight = weight * 0.78;
        }
        else if (choice.equals("2")) {
            planetWeight = weight *0.39;
        }
        else if (choice.equals("3")) {
            planetWeight = weight * 2.65;
        }
        else if (choice.equals("4")) {
            planetWeight = weight * 1.17;
        }
        else if (choice.equals("5")) {
            planetWeight = weight * 1.05;
        }
        else if (choice.equals("6")) {
            planetWeight = weight * 1.23;
        }
        System.out.println("Your weight wouble be " + planetWeight + " pounds on that planet.");

    }
}