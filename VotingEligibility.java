// Question 2: Write a program to a person eligible for voting or not.A person will be if his age is greater or equals to 18:

import java.util.Scanner;

// Main Class first
public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkEligibility(age);

        } catch (NotEligibleForVotingException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer age.");
        } finally {
            sc.close();
        }
    }

    public static void checkEligibility(int age) throws NotEligibleForVotingException {
        if (age < 0) {
            throw new NotEligibleForVotingException("Age cannot be negative!");
        } else if (age < 18) {
            throw new NotEligibleForVotingException("You are not eligible to vote. Minimum age is 18.");
        } else {
            System.out.println("✅ You are eligible to vote!");
        }
    }
}

// Custom Exception (moved below)
class NotEligibleForVotingException extends Exception {
    public NotEligibleForVotingException(String message) {
        super(message);
    }
}
}
