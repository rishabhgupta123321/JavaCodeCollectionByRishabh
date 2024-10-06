/* 
* Demonstrate different ways to add two numbers in Java.
*/

/* 
 * Add Two Numbers Program in Java (Without User Input)
 */
class AddTwoNumbersWithoutInput1 {
    public static void main(String[] args) {
        int a = 2, b = 4;
        System.out.print("Sum = " + (a + b)); // Adding two numbers without taking user input.
    }
}

class AddTwoNumbersWithoutInput2 {
    public static void main(String[] args) {
        int a = 2, b = 4;
        System.out.print("Sum = " + (a + b)); // Adding two numbers and displaying the result.
    }
}

/*
 * Add Two Numbers in Java by Taking User Input
 */
class AddTwoNumbersWithInput1 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}

/* 
 * Incorrect Code Example 
 * This code does not close the Scanner object.
 */
class IncorrectAddTwoNumbersWithInput {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
        // Note: Scanner is not closed here, which can lead to resource leaks.
    }
}

/*
 * Correctly Closing Scanner Object with Try-With-Resources
 */
class AddTwoNumbersWithInput2 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter two numbers:");
        try (Scanner scanner = new Scanner(System.in)) { // Automatically closes the Scanner object.
            a = scanner.nextInt();
            b = scanner.nextInt();
            int sum = a + b;
            System.out.println("Sum = " + sum);
        }
    }
}

/*
 * Add Two Numbers without Taking User Input
 */
class AddTwoNumbersWithoutInput3 {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        System.out.println("Sum = " + (a + b)); // Adding two predefined numbers.
    }
}

/*
 * Sum of Two Numbers Program
 * Requirement: Two variables with values
 * Logic: Use Arithmetic operator for addition of two variables
 */
class SumOfTwoNumbers {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int sum = a + b;
        System.out.println("Sum = " + sum); // Displaying the sum of two numbers.
    }
}

/*
 * Add Two Numbers by Taking User Input
 */
class AddTwoNumbersWithUserInput {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in); // System.in is the input stream of the Scanner class.
        System.out.print("Enter any two numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum); // Displaying the sum of the input numbers.
        scanner.close();
    }
}
