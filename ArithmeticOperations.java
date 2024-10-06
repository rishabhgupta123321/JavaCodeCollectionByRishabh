import java.util.Scanner; // Importing Scanner class for user input

/**
 * This class demonstrates the use of arithmetic operators in Java.
 * It performs basic arithmetic operations: addition, subtraction, multiplication,
 * division, and modulus (remainder) on two user-provided integers.
 */
class Arithmetic {
    
    public static void main(String[] args) {
        // Declare variables to hold the two numbers
        int a, b; // Two integer variables for user input

        // Prompt the user to enter two numbers
        System.out.print("Enter data of two numbers: ");
        
        // Create a Scanner object for capturing user input
        Scanner obj = new Scanner(System.in);
        
        // Read the first integer from user input
        a = obj.nextInt();
        // Read the second integer from user input
        b = obj.nextInt();
        
        // Perform and display the results of various arithmetic operations
        System.out.println("Addition: " + (a + b)); // Calculate and display the sum
        System.out.println("Subtraction: " + (a - b)); // Calculate and display the difference
        System.out.println("Multiplication: " + (a * b)); // Calculate and display the product
        System.out.println("Division: " + (a / b)); // Calculate and display the quotient
        System.out.println("Remainder: " + (a % b)); // Calculate and display the remainder
        
        // Close the Scanner to prevent resource leaks as no further input will be needed
        obj.close();
    }
}
