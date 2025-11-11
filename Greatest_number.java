// Write a program to calculate gratest number betweeen two numbers by using method.

     // importing scanner class
import java.util.Scanner;

public class Greatest_number {
    // method to find greatest number
    static void greatest(int a, int b){
        if (a > b) {
            System.out.println(a + " is the greatest number.");
        } else if (a < b) {
            System.out.println(b + " is the greatest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
    // main method
    public static void main(String[] args) {
        // scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        // taking input from user
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        // displaying input values
        System.out.println("First number is: " + a);
        System.out.println("Second number is: " + b);
        // method call
        greatest(a, b);
        // closing scanner class object
        sc.close();
    }
}