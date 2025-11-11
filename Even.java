//Write a program to display first n even natural number.
import java.util.Scanner;
public class Even {
    // Method to display first n even natural numbers using recursion
    public static void displayEvenNumbers(int n) {
        if (n <= 0) {
            return; // Base case: if n is 0 or negative, do nothing
        } else {
            displayEvenNumbers(n - 1); // Recursive call with n-1
            System.out.print((2 * n) + " "); // Print the nth even number
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt(); // Read the input number

        if (n > 0) {
            System.out.println("The first " + n + " even natural numbers are:");
            displayEvenNumbers(n); // Call the method to display even numbers
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close(); // Close the scanner
    }
}
