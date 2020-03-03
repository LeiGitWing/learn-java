import java.util.Scanner;

public class MoreUserInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName, lastName, userName, studentID;
        int age, grade;
        double gpa;

        System.out.println("Please enter the following information so I can sell it for a profit!\n");

        System.out.print("First name: ");
        firstName = keyboard.next();
        System.out.print("Last name: ");
        lastName = keyboard.next();
        System.out.print("Grade(9-12): ");
        grade = keyboard.nextInt();
        System.out.print("Student ID: ");
        studentID = keyboard.next();
        System.out.print("Login: ");
        userName = keyboard.next();
        System.out.print("GPA(0.0-4.0): ");
        gpa = keyboard.nextDouble();

        System.out.println("\nYour information:\n\tLogin: "+ "\t" + userName + "\n\tID: " + "\t" + studentID + "\n\tName: " + "\t" + lastName + ", " + firstName + "\n\tGPA: " + "\t" + gpa + "\n\tGrade: " + "\t" + grade);
    }
}