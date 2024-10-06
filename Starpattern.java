/* Star Pattern Program */

// This program demonstrates various star patterns using nested loops in Java.

class Starpattern {
    public static void main(String[] args) {

        // Uncomment one of the sections below to see different star patterns.

        /*
         * Pattern 1: Right-Angled Triangle (Left-Aligned)
         * Output:
         * *
         * * *
         * * * *
         * * * * *
         */
        /*
        for (int i = 1; i <= 5; i++) { // Iterate through rows
            for (int j = 1; j <= i; j++) { // Iterate through columns
                System.out.print("*" + " "); // Print star and space
            }
            System.out.print("\n"); // Move to the next line after each row
        }
        */

        /*
         * Pattern 2: Right-Angled Triangle (Right-Aligned)
         * Output:
         * * * * *
         * * * *
         * * *
         * *
         */
        /*
        for (int i = 1; i <= 5; i++) { // Iterate through rows
            for (int j = 5; j >= i; j--) { // Iterate through columns
                System.out.print("*" + " "); // Print star and space
            }
            System.out.print("\n"); // Move to the next line after each row
        }
        */

        /*
         * Pattern 3: Inverted Right-Angled Triangle
         * Output:
         * * * * *
         * * * *
         * * *
         * *
         */
        /*
        for (int i = 5; i >= 1; i--) { // Iterate through rows
            for (int j = 1; j <= i; j++) { // Iterate through columns
                System.out.print("*" + " "); // Print star and space
            }
            System.out.print("\n"); // Move to the next line after each row
        }
        */

        /*
         * Pattern 4: Right-Angled Triangle with Spaces (Left-Aligned)
         * Output:
         *     *
         *    **
         *   ***
         *  ****
         * *****
         */
        /*
        for (int i = 1; i <= 5; i++) { // Iterate through rows
            for (int j = i; j < 5; j++) { // For space (columns)
                System.out.print(" "); // Print space
            }
            for (int j = 1; j <= i; j++) { // Iterate through columns
                System.out.print("*"); // Print star
            }
            System.out.print("\n"); // Move to the next line after each row
        }
        */

        /*
         * Pattern 5: Right-Angled Triangle with Spaces (Right-Aligned)
         * Output:
         * *****
         *  ****
         *   ***
         *    **
         *     *
         */
        /*
        for (int i = 1; i <= 5; i++) { // Iterate through rows
            for (int j = 1; j < i; j++) { // For space (columns)
                System.out.print("  "); // Print two spaces
            }
            for (int j = i; j <= 5; j++) { // Iterate through columns
                System.out.print("*" + " "); // Print star and space
            }
            System.out.print("\n"); // Move to the next line after each row
        }
        */

        /*
         * Pattern 6: Full Square Pattern
         * Output:
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        /*
        for (int i = 1; i <= 5; i++) { // Iterate through rows
            for (int j = 1; j <= 5; j++) { // Iterate through columns
                System.out.print("*" + " "); // Print star and space
            }
            System.out.print("\n"); // Move to the next line after each row
        }
        */

        /*
         * Pattern 7: Hollow Square Pattern
         * Output:
         * * * * *
         * *     *
         * *     *
         * *     *
         * * * * *
         */
        /*
        for (int i = 1; i <= 5; i++) { // Iterate through rows
            for (int j = 1; j <= 5; j++) { // Iterate through columns
                if (i == 1 || i == 5 || j == 1 || j == 5) { // Check for borders
                    System.out.print("*" + " "); // Print star
                } else {
                    System.out.print("  "); // Print space for hollow part
                }
            }
            System.out.print("\n"); // Move to the next line after each row
        }
        */

        /*
         * Pattern 8: Hollow Square Pattern (without spaces)
         * Output:
         * *****
         * *   *
         * *   *
         * *   *
         * *****
         */
        for (int i = 1; i <= 5; i++) { // Iterate through rows
            for (int j = 1; j <= 5; j++) { // Iterate through columns
                if (i == 1 || i == 5 || j == 1 || j == 5) { // Check for borders
                    System.out.print("* "); // Print star with a space
                } else {
                    System.out.print("  "); // Print two spaces for the hollow part
                }
            }
            System.out.print("\n"); // Move to the next line after each row
        }

    }
}
