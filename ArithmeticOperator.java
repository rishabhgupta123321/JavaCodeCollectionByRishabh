import java.util.Scanner; // Importing Scanner class for user input

/**
 * This class demonstrates the use of arithmetic operators in Java.
 * It performs basic arithmetic operations: addition, subtraction, multiplication,
 * division, and modulus (remainder) on two user-provided integers.
 */
class ArithmeticOperator {

    public static void main(String[] args) {
        // Declare variables to hold the two numbers
        int a, b; // Two integer variables for user input

        // Using try-with-resources to ensure that the Scanner is closed automatically
        try (Scanner oper = new Scanner(System.in)) {
            // Prompt the user to enter two numbers
            System.out.print("Enter any two numbers: ");
            
            // Read the first integer from user input
            a = oper.nextInt(); // First number
            // Read the second integer from user input
            b = oper.nextInt(); // Second number
            
            // Perform and display the results of various arithmetic operations
            System.out.println("Addition: " + (a + b)); // Calculate and display the sum
            System.out.println("Subtraction: " + (a - b)); // Calculate and display the difference
            System.out.println("Multiplication: " + (a * b)); // Calculate and display the product
            System.out.print("Division: " + (a / b) + "\n"); // Calculate and display the quotient
            System.out.print("Remainder: " + (a % b)); // Calculate and display the remainder
            // No need to explicitly close the Scanner as it will be closed automatically
        }
    }
}
