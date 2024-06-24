           /*  Vowel or Consonant in java  */


           // input - a e i o u ----->  Vowel
           // input - b c d etc....   ----> Consonant

import java.util.Scanner;
class Checkvowel{
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter any character.....-  ");
        Scanner r = new Scanner(System.in);
        ch = r.nextLine().charAt(0); 
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Vowel character");
        }
        else{
            System.out.println("Consonant character");
        }
    r.close(); 
    }
}




// in this below code i know that r is a Scanner class type(method) but charAt() is a String class method
// so that it will not be able to call so for this firstly we have to do  call reference object from Scanner class's method 
// so we will take also Scanner class method that work for input string like next() or nextLine(), so in that method can input string 
// that also can input the character.




// in the logical or operator we have to satisfy any one condition but in the logical and 
// operator we have to satisfy all condition .