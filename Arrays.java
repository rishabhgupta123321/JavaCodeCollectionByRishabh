                /* Arrays in java */






                            /* Static Arrays */






/*


class Arrays{
    public static void main(String []argss){
        // int a[];  //    array varaiable a declaration // first way
        // a[] = new int[5];     // creating the object with the help of new  and assignning value in array a 
        // int a[] = new int[5]    // in this i have declare an array and then i have created object and then assign value in array a . this is the second way  
        // int a[] = {10, 20, 30, 40, 50};  // this is the third way 
        // System.out.print(a[2]);        // in this we can not write like this - int a[5] = {10, 20, 30, 40, 50};
        // int a[];
        // a = new int[5];
        int a[] = {10, 20, 30, 40, 50};
        System.out.print(a[2]); 
        // int a[];
        // int a[] = {10, 20, 30, 40, 50};    like this we can not do this will give me error 
    }
}


*/



/*

class Arrays{
    public static void main(String[] args) {
        int a[];  // Decelaration of an array
        a = new int[5];      // create an object for an array for taking inputs of elements
        
        // now size is 5 means we can give the five elements, 
        // so for giving i have to do from 0 index to n-1 , where n is size of an array 

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        // After stroing the value i have to print the value so now for this we can use for and for-each loop
        for(int i=0; i<a.length;i++){    // i is a index value.
            System.out.print(a[i]+" ");
        }


    }
}

*/






/*
class Arrays{
    public static void main(String[] args) {
 // Decelaration of an array
        int a[] = new int[5];      // create an object for an array for taking inputs of elements
        
        // now size is 5 means we can give the five elements, 
        // so for giving i have to do from 0 index to n-1 , where n is size of an array 

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        // After stroing the value i have to print the value so now for this we can use for and for-each loop
        for(int i=0; i<a.length;i++){    // i is a index value.
            System.out.print(a[i]+" ");
        }


    }
}

*/











                                 /* IN Dynamic Arrays - */

// in this we have to take input for taking the size of an array , and here size represents the number of elements in array. 



/*

import java.util.Scanner;
class Arrays{
    public static void main(String[] args) {
        int size;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter size of an array- ");
        size = r.nextInt();
        int a[] = new int[size];
        System.out.print("Enter array elements values - ");
        // now i have to take the input of array elements
        for(int i=0;i<size;i++){   // i is index value
            a[i] = r.nextInt();
        } 
        System.out.print("Printed Arrays values - ");
        for(int i = 0; i<size;i++){
            System.out.print(a[i]+" ");
        }
        r.close();
    }
}

*/









// This below method for dynamic array is wrong because in this we have taken declare i in before the 
// two for loop and outside and when we have execute this then it will show some error so for this i have to take 
// declare in both for loop for i 





/*

import java.util.Scanner;
class Arrays{
    public static void main(String[] args) {
        int size,i;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter size of an array- ");
        size = r.nextInt();
        int a[] = new int[size];
        System.out.print("Enter array elements values - ");
        // now i have to take the input of array elements
        for(i=0;i<size;i++){   // i is index value
            a[i] = r.nextInt();
        } 
        System.out.print("Printed Arrays values - ");
        for(i = 0; i<size;i++){
            System.out.print(a[i]+" ");
        }
        r.close();
    }
}

*/







//                                     /* BY FOR-EACH LOOP DYNAMIC ARRAY- */





/*
import java.util.Scanner;
class Arrays{
    public static void main(String[] args) {
        int size;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter size of an array- ");
        size = r.nextInt();
        int a[] = new int[size];
        System.out.print("Enter array elements values - ");
        // now i have to take the input of array elements
        for(int i=0;i<size;i++){   // i is index value
            a[i] = r.nextInt();
        } 
        System.out.print("Printed Arrays values - ");
        for(int b : a){          // FOR-EACH LOOP      // in this we will not write like a with subscript operator like a[] , we have to write only a
            System.out.print(b+" ");
        }
        r.close();
    }
}
*/

















