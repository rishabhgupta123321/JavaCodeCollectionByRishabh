import java.util.Scanner;

class Arrangearrayelementsindescendingorder {
    public static void main(String[] args) {
        int i, j, temp;
        int a[] = new int[5]; // Array of size 5 as per the requirements

        // Create a Scanner object for input
        try (Scanner r = new Scanner(System.in)) {
            // Input the array elements
            System.out.print("Enter Array elements: ");
            for (i = 0; i < a.length; i++) {
                a[i] = r.nextInt();
            }

            // Display array before sorting
            System.out.print("Before arranging the array elements: ");
            for (i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }

            // Sorting array in descending order using nested loops
            for (i = 0; i < a.length; i++) {
                for (j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) { // Swap if current element is smaller
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

            // Display array after sorting in descending order
            System.out.println();
            System.out.print("After arranging the array elements in Descending order: ");
            for (i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
