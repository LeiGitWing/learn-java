import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int result = 0;

        System.out.print("Starting number: ");
        int inputNum = keyboard.nextInt();
        System.out.print(inputNum);

        while(inputNum != 1) {
            if (inputNum % 2 == 0) {
                inputNum = inputNum / 2;
            } else if (inputNum % 2 == 1) {
                inputNum = inputNum * 3 + 1;
            }
            System.out.print("\t" + inputNum);
        }
    }
}