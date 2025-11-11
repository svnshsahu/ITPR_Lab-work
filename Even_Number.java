// Write a program in java to input any 20 numbers and print only even numbers among them.

import java.util.Scanner; // Importing Scanner class for user input

/*----- Defining a class for Even Number Display ----*/
class EvenNumberFinder {
    int[] numbers; // declaration of array to store numbers

    // Constructor
    public EvenNumberFinder() {
        // initializing number of elements to be stored
        numbers = new int[20];

        // Creating object of Scanner class to initialize elements into the array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 20 numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt(); // Reading input and storing number at given index in array
        }

        System.out.println("--------------------------------------------");
        sc.close(); // closing scanner object to avoid resource leak
    }

    // method to display even numbers from the array
    private void displayEvenNumbers() {
        System.out.println("Even numbers are: ");
        boolean found = false;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                System.out.print(numbers[index] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No even numbers found.");
        }
        System.out.println("\n--------------------------------------------");
    }

    // method to display all numbers and call even number method
    public void displayData() {
        // Displaying all numbers to the userArrayExample
        System.out.println("Numbers entered are: ");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");
        }
        System.out.println("\n--------------------------------------------");

        // Displaying even numbers
        displayEvenNumbers();
    }
}

/*------------------------*/
public class Even_Number {
    public static void main(String[] args) {
        // Creating object
        EvenNumberFinder evenFinder = new EvenNumberFinder();
        evenFinder.displayData();
    }
}