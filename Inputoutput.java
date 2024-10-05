// import java.util.Scanner;
// class Inputoutput{
//     public static void main(String[] ar){
//         String a;
//         System.out.println("Enter name: ");
//         Scanner obj = new Scanner(System.in);
//         a = obj.nextLine();
//         System.out.print("This is the name: = " + a);
        // obj.close();
//     }
// }




// import java.util.Scanner;
// class Inputoutput{
//     public static void main(String[] ar){
//         int a;
//         System.out.println("Enter data: ");
//         Scanner obj = new Scanner(System.in);
//         a = obj.nextInt();
//         System.out.print("This is the data: = " + a);
        // obj.close();
//     }
// }





/* in below code when we will give the input then we have to put only
          the same datatype value that in code we have used method 
          name and then if we will put different value then 
          it will show an inputmistmatch exception error */



/*
import java.util.Scanner;
class Inputoutput {
    public static void main(String[] args){
        int a;
        System.out.print("Enter data: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("This is the data: = " + a);
        scanner.close(); 
    }
}
*/






/*
import java.util.Scanner;
public class Inputoutput{
    public static void main(String[] args) {
        int a;      // variable 
        Scanner obj = new Scanner(System.in);  // for taking input with the help of Scanner class. 
        System.out.println("Enter any data value:- ");
        a = obj.nextInt();
        System.out.print("data is here:- "+ a );
        obj.close();
    }
}
*/

// in this System.in , System is a pre-defined class and in is for taking input.
//nextInt() is a method of Scanner class, this method take input of only integer value and we can call this with only Scanner class.


import java.util.Scanner;
public class Inputoutput{
    public static void main(String[] args) {
        int a,b;      // variable 
        Scanner obj = new Scanner(System.in);  // for taking input with the help of Scanner class. 
        System.out.println("Enter any data value:- ");
        a = obj.nextInt();  // for taking input basically we bind the object with method 
        b = obj.nextInt();
        System.out.print("data is here:- "+ a  +" "+ b);
        obj.close();
    }
}