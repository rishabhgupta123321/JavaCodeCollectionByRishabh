                             /* Addition (sum) of the two matrix */



// for addition of two matrix , size of both matrix should be similiar

// in 2-D Array we have two columns and two rows , so we can make this with for loop

import java.util.Scanner;
class Additionoftwomatrix{
    public static void main(String []argss){
        Scanner r  = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int [2][2];
        int c [][] = new int [2][2];
        System.out.print("Enter elements of First Array: "); 
        for(int i = 0;i<2;i++){  // rows
            for(int j = 0; j<2;j++){   // column
                a[i][j] = r.nextInt();
            }
        }
        System.out.print("Enter elements of Second Array: "); 
        for(int i = 0;i<2;i++){
            for(int j = 0; j<2;j++){
                b[i][j] = r.nextInt();
            }
        }
        System.out.println("First Array: "); 
        for(int i = 0;i<2;i++){
            for(int j = 0; j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second Array: "); 
        for(int i = 0;i<2;i++){
            for(int j = 0; j<2;j++){  
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of Arrays: "); 
        for(int i = 0;i<2;i++){
            for(int j = 0; j<2;j++){  
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        r.close();
    }
}