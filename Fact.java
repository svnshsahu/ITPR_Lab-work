// Write a program to find the factorial of a number by using recursion.
import java.util.Scanner;
public class Fact {

    // Method to calculate factorial using recursion
    public static long calculateFactorial(int number) {
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 for negative input
        } else if (number == 0) {
            return 1; // Factorial of 0 is 1
        } else {
            return number * calculateFactorial(number - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a non-negative number: ");
        int number = sc.nextInt(); // Read the input number

        long result = calculateFactorial(number); // Call the method to calculate factorial

        // Only print result if input was non-negative
        if (result != -1) {
            System.out.println("The factorial of " + number + " is: " + result);
        }

        sc.close(); // Close the scanner
    }
}