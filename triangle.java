// write a program to check three angles form a triangle or not.
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        float angle1 = sc.nextFloat();
        System.out.print("Enter second angle: ");
        float angle2 = sc.nextFloat();
        System.out.print("Enter third angle: ");
        float angle3 = sc.nextFloat();
        float sum = angle1 + angle2 + angle3;
        System.out.println("Angle 1 : " + angle1);
        System.out.println("Angle 2: " + angle2);
        System.out.println("Angle 3: " + angle3);
        if (sum == 180) {
            System.out.println("The angles form a triangle.");
        } 
        else {
            System.out.println("The angles do not form a triangle.");
        }
        sc.close();
    }
}