             /*  Palindrome number find program */
// Requirements is -  
// input is - 121 then reverse is 121 if 121 == 121 then output is palindrome 




/*
import java.util.Scanner;
class Panlindrome{
    public static void main(String[] args) {
        int n,r;

        Scanner reff = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = reff.nextInt();
        while(n>0){
            r = n%10;
            // a = System.out.print(r);          it is wrong because we can not store output print expression in any variable
            System.out.print(r);       // but here we can write like this.
            n /= 10;
        }
        reff.close();
    }
}
*/




// by this above code we can write reverse number by taking one one digit of a number but if we have to write reverse 
// number in single value one time so for this i have to follow below approach, this is-




// it is given below code is incorrect -


// import java.util.Scanner;
// class Panlindrome{
//     public static void main(String[] args) {
//         int n,r,s=0,c;
//     c = n;           // in this we are storing n value in c variable but we know that we haven't take yet any input n value so for this 
                            // firstly we have to take input and then store that's why it is giving error, so in below code it is correct 
//         Scanner reff = new Scanner(System.in);
//         System.out.print("Enter any number: ");
//         n = reff.nextInt();
//         while(n>0){
//             r = n%10;
//             s = ((s*10)+r);
//             n /= 10;
//         }
//         System.out.println("Reverse number is: "+ s);
//         if(c==s){
//             System.out.println("Panlindrome number");
//         }
//         else{
//             System.out.println("Not Palindrome number");
//         }
//         reff.close();
//     }
// }






// it is below code is correct one of above code that is - 

import java.util.Scanner;
class Panlindrome{
    public static void main(String[] args) {
        int n,r,s=0,c;
        Scanner reff = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = reff.nextInt();
        c = n;
        while(n>0){
            r = n%10;
            s = ((s*10)+r);
            n /= 10;
        }
        System.out.println("Reverse number is: "+ s);
        if(c==s){
            System.out.println("Panlindrome number");
        }
        else{
            System.out.println("Not Palindrome number");
        }
        reff.close();
    }
}