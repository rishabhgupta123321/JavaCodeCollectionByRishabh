          /*Calculate power of a number- */




/**

import java.util.Scanner;
class Powercalculation{
    public static void main(String[] args){
        int n, p,z=1;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the number....- ");
        n = r.nextInt();
        System.out.print("Enter the power of n number.....- ");
        p = r.nextInt();
        for(int i = 1; i<=p;i++){
            z = z*n;
        }
        System.out.print("power "+ p+ " of "+ n + " is " +z);
    r.close();
    }
}
*/



// import java.util.Scanner;
// class Powercalculation {
//     public static void main(String[] args) {
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter the number....- ");
//         int n = r.nextInt();
//         System.out.print("Enter the power of n number.....- ");
//         int p = r.nextInt();
//         int result = 1;
//         for (int i = 0; i < p; i++) {
//             result *= n;
//         }
//         System.out.println("power " + p + " of " + n + " is " + result);
//         r.close();
//     }
// }



// import java.util.Scanner;
// class Powercalculation {
//     public static void main(String[] args) {
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter the number....- ");
//         double n = r.nextDouble();
//         System.out.print("Enter the power of n number.....- ");
//         double p = r.nextDouble();
//         double result = Math.pow(n, p);         // this is the formula we can use for this taking power and so this will be the Math.pow(n, p)
//         System.out.println("power " + p + " of " + n + " is " + result);
//         r.close();
//     }
// }






// import java.util.Scanner;
// class Powercalculation {
//     public static void main(String[] args) {
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter the number....- ");
//         int n = r.nextInt();
//         System.out.print("Enter the power of n number.....- ");
//         int p = r.nextInt();
//         int result = power(n, p);
//         System.out.println("power " + p + " of " + n + " is " + result);
//         r.close();
//     }
                                                   // this is the part recursion .
//     static int power(int n, int p) {
//         if (p == 0)
//             return 1;
//         else
//             return n * power(n, p - 1);
//     }
// }












// class Powercalculation{
//     public static void main(String[] args){
//         int n = 5, p = 2,z=1;
//         for(int i = 1; i<=p;i++){
//         z = z*n;
//         }
//         System.out.print("power "+ p+ " of "+ n + " is " +z);
//     }
// }








/**
// 2^4 = 2*2*2*2 = 16  it means iterations (Repetation)
import java.util.Scanner;
class Powercalculation{
    public static void main(String []args){
        int n, p,m=1;
        System.out.print("Enter any number.... ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        System.out.print("Enter power for number.. ");
        p = r.nextInt();
        for(int i = 1;i<=p;i++){
            m=m*n;
        }
        System.out.print("the power "+ p +" of "+n+ " is "+m);
    r.close();
    }
}
*/



import java.util.Scanner;
/**
 * Powercalculation
 */
public class Powercalculation {
    public static void main(String[] args) {
        double n,p,result;
        Scanner r = new Scanner(System.in);    // in this when we  apply formula then remember that we can not take integer or any other datatype in this we can take only the double datatype value
        System.out.print("Enter number: ");    // and in the double datatype value we can put input integer also because we know that in double we have 8 byte and in integer we have 4 byte size so we can put , in this we can see like this also 
                                                    // that in this automatically compiler will do implicit typecasting.
        n = r.nextInt();
        System.out.print("Enter power: ");
        p = r.nextInt();
        result = Math.pow(n, p);    
        System.out.print(result);
        r.close();
    }
}





// so here in the above code Math.pow(, )  is a method that come in java.lang package like java.lang.Math  but here java.lang package is a default package , so that's why don't write 
// other-wise we can also write and then in this package we know that System class also come. 
// in this Math.pow(, )      Math is a class and pow(, )  is a method of Math class 

/**
Math: This is a class that provides methods for performing basic numeric operations like exponentiation, square root, trigonometric functions, etc.

pow(): This is a static method of the Math class. It takes two arguments:

The base number (in your code, n).
The exponent (in your code, p).
*/


