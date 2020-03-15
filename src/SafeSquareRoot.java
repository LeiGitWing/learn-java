import java.util.Scanner;
import java.lang.Math;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int enterNum;

        System.out.print("SQUARE ROOT!\nEnter a number: ");
        enterNum = keyboard.nextInt();

        while (enterNum < 0) {
            String negativeNumMessage = "You can't take the square root of a negative number, silly.";
            System.out.print(negativeNumMessage + " \nTry again: ");
            enterNum = keyboard.nextInt();
        }
        if (enterNum > 0) {
            double squareNum = Math.sqrt(enterNum);
            System.out.println("The square root of " + enterNum + "is " + squareNum + ".");
        }
        
    }
}