// Write a program to find out hcf of two numbers using recursion.
import java.util.Scanner;
public class HCF {
    // Method to calculate HCF using recursion
    public static int calculateHCF(int a, int b) {
        if (b == 0) {
            return a; // Base case: if b is 0, HCF is a
        } else {
            return calculateHCF(b, a % b); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt(); // Read the first input number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt(); // Read the second input number

        int hcf = calculateHCF(num1, num2); // Call the method to calculate HCF

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        sc.close(); // Close the scanner
    }
}