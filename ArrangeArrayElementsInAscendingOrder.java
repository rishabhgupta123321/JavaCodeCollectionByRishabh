import java.util.Scanner; // Importing Scanner class for user input

/**
 * This class demonstrates sorting an array in ascending order.
 * The sorting is done using a simple swapping technique (Bubble Sort-like).
 * 
 * Example: 
 * Input: 10, 29, 91, 34, 2 
 * Output: 2, 10, 29, 34, 91
 */
class ArrangeArrayElementsInAscendingOrder {
    public static void main(String[] args) {
        int i, j, temp; // Declare variables for loop counters and a temporary variable for swapping
        int a[] = new int[5]; // Declare an array of size 5

        // Try-with-resources to automatically close the Scanner object
        try (Scanner r = new Scanner(System.in)) {
            // Prompt the user to input array elements
            System.out.print("Enter 5 array elements: ");
            for (i = 0; i < a.length; i++) {
                a[i] = r.nextInt(); // Reading array elements from user input
            }

            // Display the array before sorting
            System.out.print("Before arranging the array elements: ");
            for (i = 0; i < a.length; i++) {
                System.out.print(a[i] + " "); // Print each element
            }

            // Sorting logic: Nested loops to compare and swap elements
            for (i = 0; i < a.length; i++) {
                for (j = i + 1; j < a.length; j++) {
                    // Swap if the current element is greater than the next one
                    if (a[i] > a[j]) {
                        temp = a[i];  // Store the larger element in temp
                        a[i] = a[j];  // Assign the smaller element to a[i]
                        a[j] = temp;  // Assign the larger element to a[j]
                    }
                }
            }

            // Display the array after sorting
            System.out.println(); // Line break
            System.out.print("After arranging the array elements: ");
            for (i = 0; i < a.length; i++) {
                System.out.print(a[i] + " "); // Print sorted array
            }
        }
    }
}
