                                /* Print Array elements using Array class methods */

                         /*   toString()   asList()       deepToString()         methods */


// with the help of these methods we can print array's elements without taking for loop or for-each loop 
// when we have String datatype value in array then we can use mostly both    toString()   and  asList()  method 
// but in integer datatype      this toString()  is work better and   in this integer datatype    asList()  only take 
// reference value from array as a parameter , so when we have integer value then we have to use toString()  method 









/*

import java.util.Arrays;       // Arrays class is in java.util package
class Arrayusingarrayclassmethods{
    public static void main(String[] args) {
        String a[] = {"Learn","Coding","Keypoints","Education"};
        System.out.print("toString() "+Arrays.toString(a));   // array is a class 
        System.out.print("\n asList() "+Arrays.asList(a));  
    }
}

*/








/*
import java.util.Arrays;       // Arrays class is in java.util package
class Arrayusingarrayclassmethods{
    public static void main(String[] args) {
        String a[] = {"Learn","Coding","Keypoints","Education"};
        System.out.println("toString() "+Arrays.toString(a));   // array is a class 
        System.out.print("asList() "+Arrays.asList(a));  
    }
}
*/    





/*
import java.util.Arrays;       // Arrays class is in java.util package
class Arrayusingarrayclassmethods{
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println("toString() "+Arrays.toString(a));   // array is a class 
        System.out.print("asList() "+Arrays.asList(a));  
    }
}
    
*/







                                    /*deepToString()  method  */
// it is for two-dimensional array 






/*

import java.util.Arrays;       // Arrays class is in java.util package
// import java.lang.Array;                  // it is wrong import 
class Arrayusingarrayclassmethods{
    public static void main(String[] args) {
        int a[][] = {{1,2},{2,4},{3,5},{1,6},{6,3}};
        System.out.print("deepToString() "+Arrays.deepToString(a));
    }
}

*/




/*

import java.util.Arrays;       // Arrays class is in java.util package
// import java.lang.Array;                  // it is wrong import 
class Arrayusingarrayclassmethods{
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        a[0][0] = 23;
        a[0][1] = 28;
        a[1][0] = 26;
        a[1][1] = 24;
        System.out.print("deepToString() "+Arrays.deepToString(a));
    }
}

*/








