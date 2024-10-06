import java.util.Scanner; // Importing Scanner class for user input

/**
 * This class calculates the area of a triangle using two different methods:
 * 1. Heron's formula: When the lengths of all three sides are known.
 * 2. Base and height: When the base and height of the triangle are provided.
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
        // Declare variables for the sides of the triangle and area
        int a, b, c; // Sides of the triangle
        double area; // Area of the triangle
        int s; // Semiperimeter of the triangle

        // Create a Scanner object for capturing user input
        Scanner ref = new Scanner(System.in);
        
        // Prompt the user to enter the lengths of the triangle's sides
        System.out.print("Enter all three sides of a triangle: ");
        a = ref.nextInt(); // First side
        b = ref.nextInt(); // Second side
        c = ref.nextInt(); // Third side
        
        // Calculate the semiperimeter
        s = ((a + b + c) / 2);
        
        // Calculate the area using Heron's formula
        area = Math.sqrt((s) * (s - a) * (s - b) * (s - c));
        
        // Display the area of the triangle
        System.out.println("Area of the triangle is: " + area);
        
        // Close the Scanner
        ref.close();
    }
}
