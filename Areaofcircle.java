/* Area of Circle Program */

// Requirements:
// Area of Circle = π * r * r
// PI can be approximated as 22/7 or 3.14

import java.util.Scanner;

// Class to calculate area of a circle using a constant value for PI
class AreaOfCircleWithConstantPI {
    public static void main(String[] args) {
        final double PI = 3.14; // Final keyword means this value cannot be changed
        int radius; // Variable to store radius
        double area; // Variable to store calculated area

        // Creating Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextInt(); // Read user input for radius

        // Calculate area of the circle
        area = PI * radius * radius; // Formula for area
        System.out.println("Area of circle: " + area); // Output the result

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}

// Class to calculate area of a circle with user-defined PI
class AreaOfCircleWithUserDefinedPI {
    public static void main(String[] args) {
        int radius; // Variable to store radius
        final double PI = 3.14; // Final keyword indicates this value is constant
        double area; // Variable to store calculated area

        // Creating Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextInt(); // Read user input for radius

        // Calculate area of the circle
        area = PI * radius * radius; // Formula for area
        System.out.println("Area of circle: " + area); // Output the result

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
