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