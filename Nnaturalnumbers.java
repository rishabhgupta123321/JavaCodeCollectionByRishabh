/* First n natural numbers prints - */

/*
import java.util.Scanner;
class Nnaturalnumbers {
    public static void main(String[] args){
        int n,i;
        System.out.print("Enter the number of terms- ");
        Scanner rjjjj = new Scanner(System.in);
        n = rjjjj.nextInt();        // here nextInt() is the method for Scanner class.
        for(i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        rjjjj.close(); 
    }
}
*/

// in this above this code is running but IDE is not accepting above code by closing the scanner class.
// so for that we can use try method in Scanner object with curly bracket. otherwise motsly this is correct code above.
// so for this we know - 



/**
import java.util.Scanner;
class Nnaturalnumbers {
    public static void main(String[] args){
        int n,i;
        System.out.print("Enter the number of terms- ");
        try (Scanner rjjjj = new Scanner(System.in)){      //in this code this object rjjjj will automatically close.
        n = rjjjj.nextInt();        // here nextInt() is the method for Scanner class.
        for(i=1;i<=n;i++){
            System.out.print(i+" ");
        } 
    }
}
}
*/










/* 
import java.util.Scanner;
class Nnaturalnumbers {
    public static void main(String[] args){
        int n,i;
        System.out.print("Enter the number of terms- ");
        try (Scanner rjjjj = new Scanner(System.in)){      // try with curly bracket is for automatically close the scanner class.
        n = rjjjj.nextInt();        // here nextInt() is the method for Scanner class.
        for(i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        rjjjj.close(); 
    }
}
}
*/



/*
import java.util.Scanner;
class Nnaturalnumbers {
    public static void main(String[] args){
        int n,i;
        System.out.print("Enter the number of terms- ");
        try (Scanner rjjjj = new Scanner(System.in)){      // try with curly bracket is for automatically close the scanner class.
        n = rjjjj.nextInt();        // here nextInt() is the method for Scanner class.
        for(i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
}
*/










/* 
import java.util.Scanner;

class Nnaturalnumbers {
    public static void main(String[] args) {
        int n, i;
        System.out.print("Enter the number of terms: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        for (i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}
*/









// for automatically close the object i can also use try


/* 
import java.util.Scanner;

class Nnaturalnumbers {
    public static void main(String[] args) {
        System.out.print("Enter the number of terms: ");
        
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } // the scanner is automatically closed here
    }
}
*/






// import java.util.Scanner;
// /**
//  * Nnaturalnumbers
//  */
// public class Nnaturalnumbers {
//     public static void main(String[] args) {
//         int n;      // here n will work as a limit where natural number will print till n 
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter any number:....  ");
//         n = r.nextInt();    // this nextInt() is the method of the Scanner class
//         if(n>=1){
//         for(int i = 1;i<=n; i++){
//             System.out.print(i+" ");
//         }
//     }
//     else{
//         System.out.println("Invalid value.... ");
//     }
//         r.close();
//     }
// }







// for understanding the program we have to do dry run so that program we will understand easily. 

import java.util.Scanner;
/**
 * Nnaturalnumbers
 */
public class Nnaturalnumbers {
    public static void main(String[] args) {
        int n;      // here n will work as a limit where natural number will print till n 
        Scanner r = new Scanner(System.in);
        System.out.print("Enter no. of term :....  ");
        n = r.nextInt();    // this nextInt() is the method of the Scanner class
        for(int i = 1;i<=n; i++){         // here i++ (post-increment) will work in this loop after all the expression(Statement) will print and then this will excute for next iteration in for loop.
            System.out.print(i+" ");
        }
        r.close();
    }
}






















