                      /* Array class methods in java */
                      /* sort(), equals(), copyOf() */

    




                       /* sort() methods(for ascending order making program) */


/*

import java.util.Arrays;
import java.util.Scanner;
class Arrayclassmethodss{
    public static void main(String[] rags){
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Data in Array: ");
        for(int i = 0; i<a.length; i++){
            a[i] = r.nextInt();
        }
        Arrays.sort(a);      
        System.out.print("Array elements: ");
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        r.close();
    }
}

*/








// given below is wrong

/*
import java.util.Arrays;
import java.util.Scanner;
class Arrayclassmethodss{
    public static void main(String[] rags){
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Data in Array: ");
        for(int i = 0; i<a.length; i++){
            a[i] = r.nextInt();
        }
        int b[] = Arrays.sort(a);     // we are not here copying the value so this is incorrect 
        for(int i = 0; i<a.length;i++){
            System.out.print(b[i]+ " ");
        }
        r.close();
    }
}

*/







                                  /* equals() method for doing comparison array's data value */




// By this we can check elements and size also  





/*

import java.util.Scanner;
import java.util.Arrays;
class Arrayclassmethodss{
    public static void main(String[] args) {
        int a[] = new int[6];
        int b[] = new int[6];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Data elements in Array a: ");
        for(int i=0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        System.out.print("Enter Data elements in Array b: ");
        for(int i=0;i<b.length;i++){
            b[i] = r.nextInt();
        }
        boolean b1 = Arrays.equals(a, b);
        System.out.print("is it these array equal: "+b1);
        r.close();
    }
}

*/




/*

import java.util.Arrays;
class Arrayclassmethodss{
    public static void main(String[] args) {
        int a[] = new int[6];
        int b[] = new int[6];
        boolean b1 = Arrays.equals(a, b);
        System.out.print("is it these array equal: "+b1);
    }
}

*/





/*

import java.util.Arrays;
class Arrayclassmethodss{
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[6];
        boolean b1 = Arrays.equals(a, b);
        System.out.print("is it these array equal: "+b1);
    }
}

*/











                                          /* copyOf() method */


/*

import java.util.Scanner;
import java.util.Arrays;
class Arrayclassmethodss{
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Data in Array a: ");
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        System.out.print("Data in Array a: ");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int b[] = Arrays.copyOf(a, 5); // here 5 is the size of b[]
        System.out.print("\nData in Array b: ");
        for(int i = 0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        r.close();
    }
}
 
*/






/*

import java.util.Scanner;
import java.util.Arrays;
class Arrayclassmethodss{
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Data in Array a: ");
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        System.out.print("Data in Array a: ");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int b[] = Arrays.copyOf(a, 6); // here 5 is the size of b[]
        System.out.print("\nData in Array b: ");
        for(int i = 0;i<b.length;i++){       // size 6 means index 0 to 5 
            System.out.print(b[i]+" ");
        }
        r.close();
    }
}

*/





import java.util.Scanner;
import java.util.Arrays;
class Arrayclassmethodss{
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Data in Array a: ");
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        System.out.print("Data in Array a: ");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int b[] = Arrays.copyOf(a, 6); 
        b[6] = 12;                      // here 5 is the size of b[]
        System.out.print("\nData in Array b: ");
        for(int i = 0;i<b.length;i++){       // size 6 means index 0 to 5 
            System.out.print(b[i]+" ");
        }
        r.close();
    }
}