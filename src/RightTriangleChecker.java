import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        

        System.out.print("Enter three integers:\nSide 1: ");
        int side1 = keyboard.nextInt();

        // if side2 < side1
        System.out.print("Side 2: ");
        int side2 = keyboard.nextInt();
        while (side2 < side1) {
                System.out.print(side2 + " is smaller than " + side1 + ". Try again.\nSide 2: ");
                side2 = keyboard.nextInt();
            }

        System.out.print("Side 3: ");
        int side3 = keyboard.nextInt();
        while (side3 < side2) {
                System.out.print(side3 + " is smaller than " + side2 + ". Try again.\nSide 3: ");
                side3 = keyboard.nextInt();
            }
        
        if (side3 >= side2 && side2 >= side1) {
            System.out.println("\nYour three sides are " + side1 + " " + side2 + " " + side3 + "\nThese sides *do* make a right triangle. Yippy-skippy!");
        } 
    }
}