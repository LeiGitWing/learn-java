import java.util.Scanner;

public class CompareToChallenge {
    public static void main(String[] args) {
        // System.out.print("Comparing \"axe\" with\"dog\" produces");
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What's your last name? ");
        String lastName = keyboard.next();
        int num = lastName.compareTo("Carswell");
        System.out.println(num);

        // System.out.print("Comparing \"applebee's\" with \"apple\" produces");
        // System.out.println("applebee's".compareTo("apple"));
    }
}