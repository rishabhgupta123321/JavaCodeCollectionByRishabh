       /* count number of digits in a number-*/

// Requirement - 
// input 2342  ----->     4


/*
import java.util.Scanner;     // this java.util is a package for taking input by Scanner class.
class Digits{
    public static void main(String[] args){
        int n,count = 0;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: - ");
        n = r.nextInt();
        while(n>0){
            n=n/10;   // also we can write n/=10
            count++;
        }
        System.out.print("No of digits: - "+count);
    r.close();
    }
    }
*/





/*
import java.util.Scanner;     // this java.util is a package for taking input by Scanner class.
class Digits{
    public static void main(String[] args){
        int n,count = 0;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: - ");
        n = r.nextInt();
        for(int t = n;t>0;t=t/10){
            count++;
        }
        System.out.print("No of digits: - "+count);
    r.close();
    }
    }
    */







/**
    import java.util.Scanner;     // this java.util is a package for taking input by Scanner class.
    class Digits{
        public static void main(String[] args){
            int n,count = 0;
            Scanner r = new Scanner(System.in);
            System.out.print("Enter any number: - ");
            n = r.nextInt();
            do {
                n=n/10;   // also we can write n/=10
                count++;
            }
            while(n>0);
            System.out.print("No of digits: - "+count);
        r.close();
        }
        }
        */




// Requirement-
// 9028 then digits is 4 then how 


/**
import java.util.Scanner;
public class Digits{
    public static void main(String[] args) {
        int n,i=0;  // i is the number of digits.
        System.out.print("Enter any number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        while(n>0){
            n = n/10;
            // i=i+1;
            i++;
        }
        System.out.print("The number of digits will be: "+ i);
        r.close();
    }
}
*/


// while taking the number in integer datatype i can take only till 9 digit number but if i will put more than 9 digit number then it will 
// show the error that is inputmismatchexception error so for this solving this error we take number as a string and then we measure the length of this 
// for finding the number of digits.






// import java.util.Scanner;
// public class Digits {
//     public static void main(String[] args) {
//         System.out.print("Enter any number: ");
//         Scanner r = new Scanner(System.in);
//         String input = r.nextLine(); // Read input as a String
//         int i = input.length(); // Get the length of the input string
//         System.out.print("The number of digits will be: " + i);
//         r.close();
//     }
// }




/**
import java.util.Scanner;
class Digits{
    public static void main(String[] args) {
        int n,count = 0;
        Scanner r = new Scanner(System.in);
            System.out.print("Enter any number: ");
            n = r.nextInt();
            for(int t = n;t>0;t=t/10){    // in if basically we know that we have increment/decrement where actually that is the updation.
                count++;
            }
            System.out.print("no. of digit is "+count);
            r.close();
        }
    }
*/






// import java.util.Scanner;
// public class Digits{
//     public static void main(String[] args) {
//         int n,i=0;  // i is the number of digits.
//         System.out.print("Enter any number: ");
//         Scanner r = new Scanner(System.in);
//         n = r.nextInt();
//         do{
//             i++;
//             n=n/10;
//         }
//         while(n>0);
//         System.out.print("The number of digits will be: "+ i);
//         r.close();
//     }
// }