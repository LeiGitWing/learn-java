import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println("WELCOME TO THE BANK OF LEIGITWING");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();

        while(entry != pin) {
            System.out.println("\nINCORRECT PIN. TRY ANGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
    }
}