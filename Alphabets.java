              /*print A to Z alphabets- */




/**
class Alphabets{
    public static void main(String[] args) {
        for(char i = 'A'; i<='Z' ; i++) {     // when we write character then we write this with single qoute.           
            System.out.print(i+" ");
        }
    } 
}

*/


    // in this after z when this loop will go to i++ then in this because 
    // z ASCII value is 90 so when i++ happen then this will become 91 
    //and 91 ASCII value is for      [    this character.           '
  // it means in this we know that in the left square bracket    '['    is greater than 'Z'.


/**
class Alphabets{
    public static void main(String[] args) {
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print(ch+" ");
        }
    }
}
*/





// Requirement 
// think about logic and write basic syntax and then this will be done.

import java.util.Scanner;
class Alphabets{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        char cha;
        System.out.print("Enter any character: ");
        cha = r.nextLine().charAt(0);
        if(cha>='a' && cha<='z'){
        for(char ch = 'a'; ch<=cha; ch++){ // in this we can use also while and do-while loop but in mostly we use for loop that's why we have taken this loop.
            System.out.print(ch+" ");
        }
    }
    if(cha>='A' && cha<='Z'){
        for(char ch = 'A'; ch<=cha; ch++){
            System.out.print(ch+" ");
        }
    }

        r.close();
    }
}

    