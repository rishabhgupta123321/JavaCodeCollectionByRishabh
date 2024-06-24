               /*Print the ASCII value of a character - */

import java.util.Scanner;

class Asciivalueofcharacter{
    public static void main(String[] args) {
        char ch;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the any character....- ");
        ch = r.next().charAt(0);
        // i know that for ascii value i have to convert character value in integric value
        // and in this we have to know that character value has 2 byte size and integer value has 
        // 4 byte size so like this according to this i have to put 2 byte into 4 byte size so 
        // this we can do by using implicit typecasting method.
        int i = ch;
        System.out.print("ASCII value of "+ ch + " is " + i);
        r.close();
    }
}