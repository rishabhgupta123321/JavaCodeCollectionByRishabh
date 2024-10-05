/*Finding that number is even or odd number- */
    

                /* Odd - Even program */



/**
import java.util.Scanner;
class Oddevenprogram{
    public static void main(String []args){
        int n;
        System.out.println("Enter any number:- ");      // this is the message that we have passed 
        Scanner r = new Scanner(System.in);
        n = r.nextInt();     // this nextInt() method is from or for Scanner class 
        if(n%2==0){ // % sign is modulus sign for finding the remainder.
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        r.close();
    }
    
}
*/





/*
import java.util.Scanner;
class Oddevenprogram{
    public static void main(String []args){
        int n;
        System.out.println("Enter any number:- ");
        try (Scanner r = new Scanner(System.in)){   // try for automatically close the scanner class.
        n = r.nextInt();     // this nextInt() method is from or for Scanner class 
        if(n%2==0){ // % sign is modulus sign for finding the remainder.
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        r.close();
    }
}   
}
*/




/* 
import java.util.Scanner;
class Oddevenprogram{
    public static void main(String []args){
        int n;
        System.out.println("Enter any number:- ");
        try (Scanner r = new Scanner(System.in)){   // try for automatically close the scanner class.
        n = r.nextInt();     // this nextInt() method is from or for Scanner class 
        if(n%2==0){ // % sign is modulus sign for finding the remainder.
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}   
}
*/









// find that given number by user is even or odd 
// so for this we firstly think about the requirement and then we think about what logic we can apply 
// and then we will write the basic syntax of the program and then we will write the complete program , this should be the approach of writing any program
// for understanding we can do the dry run also.



import java.util.Scanner;
/**
 * Oddevenprogram
 */
public class Oddevenprogram {
    public static void main(String[] args) {
        int a;
        try(Scanner sjsj = new Scanner(System.in)){    // System.in is the     stream  of taking input in java
        System.out.print(" Enter any number.....  ");
        a = sjsj.nextInt();
        if (a%2==0) {
            System.out.print("Even number");
        }
        else{
            System.out.print("Odd number");
        }
    }        
    }
}