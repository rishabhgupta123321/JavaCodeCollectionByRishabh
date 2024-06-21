/* Star patterns- */





// Square pattern-

// class Starpatterns{
//     public static void main(String[] rags){
//         int i,j;
//         for(i=1;i<=5;i++)  // rows
//         {
//             for(j=1;j<=5;j++) // columns
//             {
//                 System.out.print("*" +" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }





// triangle patterns-



// class Starpatterns{
//     public static void main(String[] rags){
//         int i,j;
//         for(i=1;i<=5;i++)  // rows
//         {
//             for(j=1;j<=i;j++) // columns
//             {
//                 System.out.print("*" +" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }




// class Starpatterns{
//     public static void main(String[] rags){
//         int i,j;
//         for(i=0;i<5;i++)  // rows
//         {
//             for(j=1;j<=(5-i);j++) // columns
//             {
//                 System.out.print("*" +" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// class Starpatterns{
//     public static void main(String[] rags){
//         int i,j;
//         for(i=1;i<=5;i++)  // rows
//         {
//             for(j=1;j<=(5-i+1);j++) // columns
//             {
//                 System.out.print("*" +" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// class Starpatterns{
//     public static void main(String[] rags){
//         int i,j;
//         for(i=1;i<=5;i++)  // rows
//         {
//             for(j=1;j<=(6-i);j++) // columns
//             {
//                 System.out.print("*" +" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }





// class Starpatterns{
//     public static void main(String[] rags){
//         int i, j, k;
//         for(i = 1; i <= 5; i++)  // rows
//         {
//             for(k = 5 ; k > i; k--){
//                 System.out.print("  ");     // in this we have to take two space. 
//             }
//             for(j=1;j<=(i+(i-1));j++) // columns
//             {
//                 System.out.print("*" +" ");
//             }
//             System.out.print("\n");
//         }
//     }
// } 





// class Starpatterns{
//     public static void main(String[] rags){
//         int i, j, k;
//         for(i = 1; i <= 5; i++)  // rows
//         {
//             for(k = 5 ; k > i; k--){
//                 System.out.print(" ");     // in this we have to take two space. 
//             }
//             for(j=1;j<=(i+(i-1));j++) // columns
//             {
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// } 





class StarPatterns {
    public static void main(String[] args) {
        int i, j, k;
        int n = 5; // Number of rows

        for (i = 1; i <= n; i++) {  // Rows
            // Print spaces
            for (k = n; k > i; k--) {
                System.out.print("  ");
            }
            // Print stars
            for (j = 1; j <= (i + (i - 1)); j++) { // Columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
