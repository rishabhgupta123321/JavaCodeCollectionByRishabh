                   /* Print character in java-  */

//input 10 ----> 10
// input A ----> A







/*

import java.util.Scanner;
class Chararcter{
    public static void main(String []args){
        char ch;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter any character - ");
        ch =n.next().charAt(0);                 // like we know that for taking input integer we take 
                                                // nextInt()  but if we want to take input character then like integer in java there is 
                                                // not any method in java like we can write nextChar();  . so in this now come challenge 
                                                // where so for this solution we have given a method that is      charAt()      and this method is of a string class's method  
                                                // where in chatAt() which is not provided by Scanner, this provided by String, so in this charAt(), we have to put position in () for character like 0 index. 
                                                // in this we have to pass the integer value position 0 and 0 we write always because we will input a single character in our program, so here basic index is 0, so in this
                                                // single character in string have 0 position ,so this 0 will do index(indicate) the 0 position character and then print that character.

                                                // so now here we can write  object and with charAt() but here also we have problem that 
                                                // this n object reference is from scanner class but charAt() method is from or for String class 
                                                // so we can not call it from Scanner method so for this we have to take a Scanner class's method in between , that we will take next() method or nextLine method that is for string but here it will
                                                // be work like a for character method with charAt() method of string.
                    
        System.out.println("Character- "+ ch);
    n.close();
    }
}

*/





// import java.util.Scanner;
// class Chararcter{
//     public static void main(String []args){
//         char ch;
//         Scanner n = new Scanner(System.in);
//         System.out.print("Enter any character - ");
//         ch =n.next().charAt(0);
//         System.out.println("Character- "+ ch);
//     n.close();
//     }
// }




/*
import java.util.Scanner;
class Chararcter{
    public static void main(String []args){
        char ch;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter any character - ");
        ch =n.nextLine().charAt(0);
        System.out.println("Character- "+ ch);
    n.close();
    }
}
*/






/*
import java.util.Scanner;
class Chararcter{
    public static void main(String []args){
        char ch;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter any character - ");
        ch =n.next().charAt(2);
        System.out.println("Character- "+ ch);
    n.close();
    }
}    
*/







/*
import java.util.*;
class Chararcter{
    public static void main(String []args){
        char ch;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter any character - ");
        ch =n.next().charAt(2);
        System.out.println("Character- "+ ch);
    n.close();
    }
}
*/



// import java.util.Scanner;
// class Character{
//     public static void main(String[] args) {
//         char ch;
//         Scanner r = new Scanner(System.in);
//         System.out.print("Please Enter any character: ");
//         ch = r.next().charAt(0);
//         System.out.print("character: "+ch);
//         r.close();
//     }
// }





import java.util.Scanner;
class Character{
    public static void main(String[] args) {
        char ch;
        Scanner r = new Scanner(System.in);
        System.out.print("Please Enter any character: ");
        ch = r.nextLine().charAt(0);
        System.out.print("character: "+ch);
        r.close();
    }
}