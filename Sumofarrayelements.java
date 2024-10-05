                            /* Find Sum of Array elements */


import java.util.Scanner;
class Sumofarrayelements{
    public static void main(String []args){
    int sum = 0;
    int a[] = new int[4];
    Scanner r = new Scanner(System.in);
    System.out.print("Enter array elements: ");
    for(int i = 0;i<a.length;i++){
        a[i] = r.nextInt();
    }                                             // here in between we have input and output so we don't take new line statement 
    System.out.print("Array elements: ");
    for(int i = 0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();                  // here both above and below is output statement, so that's why we have taken new line statement  
    for(int i = 0;i<a.length;i++){
        sum += a[i];      // sum = sum+a[i]
    }
    System.out.print("Sum of Array elements is : "+sum);
    r.close();
    }
}
