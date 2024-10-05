                                            /* Mirror Matrix using 2-D Array */ 
// Requirements - in this Mirror Matrix if we have 2-D Matrix then in this if we can maek the second column to first column and first
// column to second column then it will be the Mirror Matrix


import java.util.Scanner;
class Mirrormatrixof2dmatrix{
    public static void main(String []argss){
        Scanner r = new Scanner(System.in);
        int a[][] = new int[2][2];
        System.out.println("Enter data elements of an array: ");
        for(int i = 0;i<=1;i++){    // rows 
            for(int j=0;j<=1;j++){  // columns
                a[i][j] = r.nextInt();
            }
        }
        System.out.println("Matrix of an Array: ");
        for(int i = 0;i<=1;i++){
            for(int j=0;j<=1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(); 
        }
        System.out.println("Mirror Matrix: ");
        for(int i = 0;i<=1;i++){
            for(int j=1;j>=0;j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();   
        }
        r.close();
    }
}