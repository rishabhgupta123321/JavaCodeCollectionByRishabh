                   /* Print Array elements in Reverse order*/




/*

import java.util.Scanner;                   
class Arrayelementsinreverseorder{
    public static void main(String []args){
        int a[] = new int[5];
        // here 5 is size means no. of elements but because here 5 is with array Declaration variable also so 5 show that also that 
        // no. of container is 5 
        // here 5 we can write but in standard way we have to write a.length that is also 5

        Scanner r = new Scanner(System.in);
        System.out.print("Enter Array elements: ");
        for(int i = 0; i<a.length; i++){
            a[i] = r.nextInt();
        }
        System.out.print("Array elements: ");
        for(int i = 0; i<(a.length);i++){
            System.out.print(a[i]+ " ");
        }
        System.out.print("\nArray elements in reverse order: ");
        for(int i = a.length-1; i>=0;i--){     // a.length-1 , because index starts from 0 so length is 5 and this should be 4 
            System.out.print(a[i]+ " ");
        }
        r.close();
    }
}

*/








import java.util.Scanner;                   
class Arrayelementsinreverseorder{
    public static void main(String []args){
        int a[] = new int[5];
        // here 5 is size means no. of elements but because here 5 is with array Declaration variable also so 5 show that also that 
        // no. of container is 5 
        // here 5 we can write but in standard way we have to write a.length that is also 5

        Scanner r = new Scanner(System.in);
        System.out.print("Enter Array elements: ");
        for(int i = 0; i<a.length; i++){
            a[i] = r.nextInt();
        }
        System.out.print("Array elements: ");
        for(int b : a){                         // for-each loop 
            System.out.print(b+ " ");
        }
        System.out.print("\nArray elements in reverse order: ");
        for(int i = a.length-1; i>=0;i--){     // a.length-1 , because index starts from 0 so length is 5 and this should be 4 
            System.out.print(a[i]+ " ");
        }
        r.close();
    }
}






