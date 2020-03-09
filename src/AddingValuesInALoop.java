import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputNumber;
        int totalInputNumber = 0;
        String totalMessage = "The total so far is ";
        boolean flag = true;

        // if input numebr is not 0, keep looping and total of the input number
        System.out.println("I will add up the numbers you give me.");

        while (flag) {
            System.out.print("Number: ");
            inputNumber = keyboard.nextInt();
            totalInputNumber += inputNumber;
            if (inputNumber == 0) {
                flag = false;
            }
            System.out.println(totalMessage + totalInputNumber);
        }
        System.out.println("\nTho total is " + totalInputNumber);
    }
}