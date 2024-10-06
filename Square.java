import java.util.Scanner; // Importing Scanner class for user input
import java.lang.Math;    // Importing Math class for mathematical operations (optional, as it's part of the default package)

class Square {
    public static void main(String[] argss) {
        int n; // Variable to store the user-input number
        double m; // Variable to store the calculated square root

        // Create a Scanner object for reading input from the console
        Scanner lkss = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter any number: ");
        n = lkss.nextInt(); // Read the integer input from the user

        // Calculate the square root of the input number using the Math.sqrt() method
        m = Math.sqrt(n); // The sqrt() method returns the square root of the argument

        // Display the result of the square root calculation
        System.out.println("Square root of " + n + " is: " + m);

        // Close the Scanner object to prevent resource leaks
        lkss.close();
    }
}
