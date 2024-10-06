class HollowTriangle {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {  // rows
            for (j = 1; j <= (5 - i); j++) {  // columns
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}
