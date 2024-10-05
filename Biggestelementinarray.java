                           /*  Find biggest element in Array */


import java.util.Scanner;
class Biggestelementinarray{
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner reff = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        for(int i = 0;i<a.length;i++){
            a[i] = reff.nextInt();
        }
        int max = a[0];  // we have just suppose that a[0]  is the maximum value in array
        for(int i = 1;i<a.length;i++){
            if(a[i]>max){       // here in max for converting the value we can also use swap method also
                max = a[i];
            }
        }
        System.out.print("Biggest element in Array is: "+ max);
    reff.close();
    }   
}