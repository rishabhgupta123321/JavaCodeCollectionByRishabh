class FullSquareStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // rows
            for (int j = 1; j <= 5; j++) {  // columns
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}
