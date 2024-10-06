/* 
 * This program adds two matrices of the same size (2x2).
 * The program prompts the user to enter the elements of both matrices 
 * and then displays the sum of the two matrices.
 */

// Importing the Scanner class for user input
import java.util.Scanner;

class AdditionOfTwoMatrix {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initializing matrices
        int[][] a = new int[2][2]; // First matrix
        int[][] b = new int[2][2]; // Second matrix
        int[][] c = new int[2][2]; // Resultant matrix for sum

        // Input elements for the first matrix
        System.out.print("Enter elements of the First Matrix: ");
        for (int i = 0; i < 2; i++) { // Loop through rows
            for (int j = 0; j < 2; j++) { // Loop through columns
                a[i][j] = scanner.nextInt(); // Read user input
            }
        }

        // Input elements for the second matrix
        System.out.print("Enter elements of the Second Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = scanner.nextInt(); // Read user input
            }
        }

        // Display the first matrix
        System.out.println("First Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " "); // Print each element
            }
            System.out.println(); // New line after each row
        }

        // Display the second matrix
        System.out.println("Second Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " "); // Print each element
            }
            System.out.println(); // New line after each row
        }

        // Calculate and display the sum of the two matrices
        System.out.println("Sum of Matrices: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j]; // Add corresponding elements
                System.out.print(c[i][j] + " "); // Print each element of the sum
            }
            System.out.println(); // New line after each row
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
