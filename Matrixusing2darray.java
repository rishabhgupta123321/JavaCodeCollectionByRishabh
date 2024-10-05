                                 /*Print matrix using 2-D array */


import java.util.Scanner;
class Matrixusing2darray{
    public static void main(String []args){
        int a[][] = new int [2][2];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Data in 2-D matrix: ");
        for(int i = 0;i<2;i++){     // this i and j is also the index value so because we have take size is 2 so 
                                     // index value will be from 0 to 1
            for (int j = 0;j<2;j++){
                a[i][j] = r.nextInt();
            }
            // System.out.print("\n");
        }
        System.out.println("Data in 2-D matrix: ");
        for(int i = 0;i<2;i++){
            for (int j = 0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        r.close(); 
    }
}