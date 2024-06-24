/*Finding that number is even or odd number- */



import java.util.Scanner;
class Oddevenprogram{
    public static void main(String []args){
        int n;
        System.out.println("Enter any number:- ");
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