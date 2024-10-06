class HollowSquareStarPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // rows
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {  // borders
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");  // spaces
                }
            }
            System.out.print("\n");
        }
    }
}
