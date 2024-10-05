                                  /* Find Length of an array */


import java.util.Scanner;
class Lengthofanarray{
    public static void main(String []args){
        int a[] = new  int[5];  // size is 5 so length will be 5 and element will be 5
        System.out.print("\nEnter Array elements: ");
        Scanner r = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        System.out.print("Array elements: ");
        for(int b : a){
            System.out.print(b+" ");
        }
        System.out.print("\nLength of an array is: "+a.length);
        r.close();
    }
}