//Question 1: Write a program to calculate area of a reactangle.Use custom exception:

import java.util.Scanner;

class InvalidDimensionsException extends Exception {
    public InvalidDimensionsException(String message) {
        super(message);
    }
}

class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) throws InvalidDimensionsException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionsException("Length and width must be positive numbers!");
        }
        this.length = length;
        this.width = width;
    }
  
    public double area() {
        return length * width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            Rectangle r = new Rectangle(length, width);
            System.out.println("Area = " + r.area());

        } catch (InvalidDimensionsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
