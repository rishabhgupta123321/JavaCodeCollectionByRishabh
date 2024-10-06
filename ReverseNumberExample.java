// This program demonstrates three different ways to print numbers in reverse order.

// Example 1: Print numbers from 10 to 1 on the same line
class ReverseNumberExample_1 {
    public static void main(String[] args) {
        // Print numbers from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line after printing
    }
}

// Example 2: Print numbers from 10 to 1, each on a new line
class ReverseNumberExample_2 {
    public static void main(String[] args) {
        // Print numbers from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

// Example 3: Print numbers from user-defined number to 1
import java.util.Scanner;

class ReverseNumberExample_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter any number: ");
        int n = scanner.nextInt(); // Read user input
        // Print numbers from n to 1
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        scanner.close(); // Close the scanner to free resources
    }
}
