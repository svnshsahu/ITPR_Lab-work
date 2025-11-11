//Write a program to find out sum of 10 numbers given by user in array.
import java.util.Scanner;
public class Sum {
    // Method to calculate sum of elements in an array
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num; // Add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        int[] numbers = new int[10]; // Array to hold 10 numbers

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt(); // Read each number into the array
        }

        int sum = calculateSum(numbers); // Call the method to calculate sum

        System.out.println("The sum of the entered numbers is: " + sum);

        sc.close(); // Close the scanner
    }
}