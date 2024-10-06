/* Area of Square Program */
// Requirements: 
// area = side * side 



import java.util.Scanner;

// Class to calculate the area of a square using integer input
class AreaOfSquareInteger {
    public static void main(String[] args) {
        int side, area;
        System.out.print("Enter the side of the square: ");
        Scanner ref = new Scanner(System.in);
        side = ref.nextInt();  // Example: side = 4

        area = side * side;     // Area calculation: 4 * 4 = 16
        System.out.print("Area of the square: " + area);
        ref.close();
    }
}




import java.util.Scanner;
// Class to calculate the area of a square using double input
class AreaOfSquareDouble {
    public static void main(String[] args) {
        double a;
        int area;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        a = ref.nextDouble();  // Accepting double for more precise values

        area = (int)(a * a);   // Area calculation: Cast to int for whole number
        System.out.print("Area of the square: " + area);
        ref.close();
    }
}
