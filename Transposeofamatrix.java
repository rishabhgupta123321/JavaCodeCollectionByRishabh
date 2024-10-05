                                          /*Print transpose matrix*/
// Requirements - transpose means a[i][j] will become a[j][i]  





/*

import java.util.Scanner;
class Transposeofamatrix{ 
    public static void main(String []argss){
        int a[][] = new int[2][2];
        try(Scanner r = new Scanner(System.in)){
            System.out.println("Enter the elements of Array: ");
            for(int i=0;i<2;i++){
                for(int j = 0;j<2;j++){
                    a[i][j] = r.nextInt();
                }
            }
            System.out.println("Enter the elements of Array: ");
            for(int i=0;i<2;i++){
                for(int j = 0;j<2;j++){
                System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Transpose of the matrix: ");
                for(int i=0;i<2;i++){
                for(int j = 0;j<2;j++){
                System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}

*/











// this below code is incorrect code- 


/*

import java.util.Scanner;
class Transposeofamatrix{ 
    public static void main(String []argss){
        int a[][] = new int[2][2];  // in this we have given size of the container is 2 means we can input the two 
                                // values but also we should know here that here we can only take input of index value 
                                // 0 and 1 because size is two , if we take index value means i and j is more than 1 
                                // it means for that value we have not any space or container for storing so that if we take 
                                // in loop value from 1 to <3 means 2 then this will given the index out of bounds error 
                                // so for this i have to use only from starting like from 0 to <2 means 1 in loop
        try(Scanner r = new Scanner(System.in)){
            System.out.println("Enter the elements of Array: ");
            for(int i=1;i<3;i++){
                for(int j = 1;j<3;j++){
                    a[i][j] = r.nextInt();
                }
            }
            System.out.println("Enter the elements of Array: ");
            for(int i=1;i<3;i++){
                for(int j = 1;j<3;j++){
                System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Transpose of the matrix: ");
                for(int i=1;i<3;i++){
                for(int j = 1;j<3;j++){
                System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}

*/







import java.util.Scanner;
class Transposeofamatrix{ 
    public static void main(String []argss){
        int a[][] = new int[2][2];
        try(Scanner r = new Scanner(System.in)){
            System.out.println("Enter the elements of Array: ");
            for(int i=0;i<=1;i++){
                for(int j = 0;j<=1;j++){
                    a[i][j] = r.nextInt();
                }
            }
            System.out.println("Enter the elements of Array: ");
            for(int i=0;i<=1;i++){         // rows
                for(int j = 0;j<=1;j++){    // columns
                System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Transpose of the matrix: ");
                for(int i=0;i<=1;i++){
                for(int j = 0;j<=1;j++){
                System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}