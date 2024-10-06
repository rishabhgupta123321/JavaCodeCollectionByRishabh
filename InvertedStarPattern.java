class InvertedStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // rows
            for (int j = 5; j >= i; j--) {  // columns
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}
