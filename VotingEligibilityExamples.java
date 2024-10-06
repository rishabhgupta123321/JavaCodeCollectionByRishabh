// This program checks voting eligibility based on age using multiple examples.

// Importing Scanner class for user input
import java.util.Scanner;

class VotingEligibilityExamples {
    
    // Example 1: Using Ternary Operator
    public static void example1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read user input
        String eligibleMessage = "Congratulations, you are eligible to vote.";
        String notEligibleMessage = "Sorry, you are not eligible to vote.";
        String result = (age >= 18) ? eligibleMessage : notEligibleMessage;
        System.out.println(result);
        scanner.close(); // Close the scanner to free resources
    }

    // Example 2: Using if-else Statement
    public static void example2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read user input
        
        // Check eligibility using if-else statement
        if (age >= 18) {
            System.out.println("Congratulations, you are eligible to vote.");
        } else {
            System.out.println("Sorry, you are not eligible to vote.");
        }
        scanner.close(); // Close the scanner to free resources
    }

    // Example 3: Incorrect Example (Class and variable names)
    /*
    class Vote {
        public static void main(String[] args) {
            int n;
            Scanner r = new Scanner(System.in);
            System.out.print("Enter any numbers: ");
            n = r.nextInt();
            if (n >= 18) {
                System.out.print("Congratulations, you are eligible for votes");
            } else {
                System.out.print("Sorry, you are not eligible for votes");
            }
            r.close();
        }
    }
    // Note: This class definition is incorrect because classes cannot be defined within other classes in Java.
    */

    // Example 4: Ternary Operator Example
    public static void example4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read user input
        String result = (age >= 18) ? "Congratulations, you are eligible to vote." : "Sorry, you are not eligible to vote.";
        System.out.println(result);
        scanner.close(); // Close the scanner to free resources
    }

    public static void main(String[] args) {
        System.out.println("Example 1:");
        example1(); // Run example 1
        
        System.out.println("\nExample 2:");
        example2(); // Run example 2

        System.out.println("\nExample 4:");
        example4(); // Run example 4
    }
}
