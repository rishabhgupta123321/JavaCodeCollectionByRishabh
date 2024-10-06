class PyramidPattern {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {  // rows
            for (k = 5; k > i; k--) {  // spaces
                System.out.print("  ");
            }
            for (j = 1; j <= (i + (i - 1)); j++) {  // columns
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
