import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String category = "" ;

        System.out.print("Your height in m: ");
        // int feet = keyboard.nextInt();
        // double feet2inches = feet * 12;
        // System.out.print("Your height (inches): ");
        // double inches = keyboard.nextDouble();
        double height = keyboard.nextDouble();

        System.out.print("Your weight in kg: ");
        double weight = keyboard.nextDouble();
        // double weight = pounds * 0.4536;

        double bmi = weight/Math.pow(height, 2);
        System.out.println("\nYour BMI is " + String.format("%.5f", bmi));


        if (bmi > 0 && bmi <= 18.5) {
            category = "underweight";
        }
        if (bmi > 18.5 && bmi <= 24.0) {
            category = "normal weight";
        }
        if (bmi >24.0 && bmi <= 29.9) {
            category = "overweight";
        }
        if (bmi >= 30.0) {
            category = "obese";
        }
        System.out.println("BMI Catagory: " + category);
    }
}