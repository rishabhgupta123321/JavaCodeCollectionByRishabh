/* Print A to Z alphabets using a for loop. */

class PrintAlphabetsAtoZ {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) { // Character should be enclosed in single quotes.
            System.out.print(i + " ");
        }
    }
}

/* 
 * Explanation:
 * After 'Z', the loop increments 'i', which becomes 91 (ASCII value).
 * 91 corresponds to the character '[' which is greater than 'Z'.
 */

class PrintAlphabetsAtoZAlternative {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

/* 
 * Requirement: 
 * Write a program that prints letters from 'A' to a given character. 
 * Logic: Take input from the user and print characters up to the input character.
 */

import java.util.Scanner;

class PrintAlphabetsUpToInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar;

        System.out.print("Enter any character: ");
        inputChar = scanner.nextLine().charAt(0);

        // Check if the input character is lowercase.
        if (inputChar >= 'a' && inputChar <= 'z') {
            for (char ch = 'a'; ch <= inputChar; ch++) { 
                // You can also use while or do-while loop, but for loop is commonly used here.
                System.out.print(ch + " ");
            }
        }

        // Check if the input character is uppercase.
        if (inputChar >= 'A' && inputChar <= 'Z') {
            for (char ch = 'A'; ch <= inputChar; ch++) {
                System.out.print(ch + " ");
            }
        }

        scanner.close();
    }
}
