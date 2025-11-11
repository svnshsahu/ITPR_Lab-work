// Write a program to claculate simple interest by using method.

// importing scanner class
import java.util.Scanner;                        
public class Simple_interest {
    // method to calculate simple interest
    static void simpleInterest(float p, float r, float t){    
        // formula for simple interest
        float si = (p * r * t) / 100;                   
        System.out.println("Simple Interest is: " + si);
    }

     // main method
    public static void main(String[] args) {      
        
    // scanner class object
        Scanner sc = new Scanner(System.in);              
        System.out.print("Enter Principal amount (in Rs). : ");
        // taking input from user
        int p = sc.nextInt();                 
        System.out.print("Enter Rate of interest (in %): ");
        int r = sc.nextInt();
        System.out.print("Enter Time period (in years): ");
        int t = sc.nextInt();
        // displaying input values
        System.out.println("Principal amount is: " + p);
        System.out.println("rate interest is: " + r);
        System.out.println("Time period is: " + t);
         // method call
        simpleInterest(p, r, t);      
        // closing scanner class object        
        sc.close();               
    }
}