import java.util.Scanner; // Importing Scanner class for user input

/**
 * This class checks whether a given number is an Armstrong number.
 * An Armstrong number (or Narcissistic number) for a three-digit number
 * is one that is equal to the sum of its own digits each raised to the power
 * of the number of digits.
 * For example: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
 */
class Armstrong {
    public static void main(String[] args) {
        int n, s = 0, a, c, r; // Declare variables: n for input, s for sum, a for calculation, c for original number, r for remainder
        Scanner ref = new Scanner(System.in); // Create Scanner object for user input

        // Prompt the user to enter a number
        System.out.print("Enter any number: ");
        n = ref.nextInt(); // Read the integer input
        c = n; // Store the original number for later comparison

        // Loop to extract each digit and calculate the Armstrong condition
        while (n > 0) {
            r = n % 10; // Get the last digit
            a = (r * r * r); // Calculate the cube of the digit
            s = s + a; // Add the cube to the sum
            n = n / 10; // Remove the last digit from the number
        }

        // Check if the calculated sum is equal to the original number
        if (c == s) {
            System.out.print("Armstrong number"); // Output if it is an Armstrong number
        } else {
            System.out.print("Not Armstrong number"); // Output if it is not an Armstrong number
        }
        
        ref.close(); // Close the Scanner to prevent resource leaks
    }
}
