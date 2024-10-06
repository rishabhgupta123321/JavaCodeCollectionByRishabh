class PyramidStarPattern {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {  // rows
            for (j = i; j < 5; j++) {  // spaces
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {  // columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
