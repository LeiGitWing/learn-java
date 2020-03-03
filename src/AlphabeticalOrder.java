import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String response;

        System.out.print("What's your last name? ");
        String lastName = keyboard.next();
        // int num = lastName.compareTo("Carswell");
        // System.out.println(num);

        

        if (lastName.compareTo("Carswell") < 0) {
            response = "you don't have to wait";
        } else if (lastName.compareTo("Jones") < 0) {
            response = "that's not bad";
        } else if (lastName.compareTo("Smith") < 0) {
            response = "looks like a bit of a wait";
        } else if (lastName.compareTo("Young") < 0) {
            response = "it's gonna be a while";
        } else {
            response = "not going anywhere for a while?";
        }
        System.out.println(response + ", " + "\"" + lastName + "\".");
    }
}