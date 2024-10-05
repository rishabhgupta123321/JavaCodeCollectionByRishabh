     /* Add Two Numbers Program in java(Without user input)  */ 






// class Addtwonumbers{
//     public static void main(String args[]){
//         int a = 2, b = 4;   
//         System.out.print(a+b);           // so in this we have add operator logic for adding to numbers without taking user input.
//     }
// }




// class Addtwonumbers{
//     public static void main(String args[]){
//         int a = 2, b = 4;   
//         System.out.print("Sum = "+(a+b));         
//     }
// }



                   /* Add two numers in java by taking user input -  */


/*
import java.util.Scanner;
class Addtwonumbers{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number - ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
        obj.close();
    }
}
*/





/* 
import java.util.Scanner;
class Addtwonumbers{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number - ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
    }
}    
*/




/*
import java.util.Scanner;
class Addtwonumbers{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number - "); 
        try (Scanner obj = new Scanner(System.in)){    // for automatically closed the Scanner class object.
        a = obj.nextInt();
        b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
        obj.close();
        }
    }
}
*/





/*
import java.util.Scanner;
class Addtwonumbers{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number - "); 
        try (Scanner obj = new Scanner(System.in)){    // for automatically closed the Scanner class object.
        a = obj.nextInt();
        b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
        }
    }
}
*/



       



                      /*Add two numbers without taking user input */




// public class Addtwonumbers
//     {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 20;
//         System.out.println(a+b);
//     }                                                           
//     }



/**
public class Addtwonumbers
    {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        System.out.println("sum = "+(a+b));  // this is the message + logic of adding two numbers.
                                    //here + is in between message and addition of variable is working like a concetanation.
        }                                                           
    }
*/






// sum of two numbers program 
// requirement is two variables with values
// logic - use Arithmetic operator for addition of two variables
// write basic syntax of addition of two variables



/**
 * Addtwonumbers
 */
// public class Addtwonumbers {
//     public static void main(String[] args) {
//     int a = 2, b = 5;
//      int Sum = a+b;
//      System.out.println(" Sum "+ Sum );   
//     }
// }



import java.util.Scanner;
public class Addtwonumbers {
    public static void main(String[] args) {
    int a, b;
    Scanner r = new Scanner(System.in);    // here System.in is the stream of the scanner class.
    System.out.print("Enter any two numbers....  ");
    a = r.nextInt();
    b = r.nextInt();
    int Sum = a+b;
    System.out.println(" Sum "+ Sum );   
    r.close();
    
}
} 