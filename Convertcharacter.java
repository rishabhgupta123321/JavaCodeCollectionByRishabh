      /* convert character uppercase to lowercase and vice-versa*/
// input  a to z then ----->   Uppercase 
// input A to Z then ----->  Lowercase 





/*
import java.util.Scanner;
import java.lang.Character;
class Convertcharacter{                        
    public static void main(String []args){
        char ch,ch2,ch3;
        System.out.print("Enter any Character ");
        Scanner ref = new Scanner(System.in);
        ch = ref.nextLine().charAt(0);      // charAt is from String class method and nextInt() or next() from Scanner class method
    //    ch = ref.next().charAt(0);     // here in Scanner class we have not given any method for character so for this we are using charAt() which is form string class. 
        

    if (ch>='A' && ch<='Z'){
       ch2 = Character.toLowerCase(ch);          // in java for converting the character we have a method which is   toLowerCase();      and also toUpperCase()  ,
        // this method provides by java that convert uppercase character to lowercase character,
            //  and this method is inside in the Character class in java,
        //  and this  Character      class   is in java.lang package in java and,
        //  this package is default package in java so this we can import,
        //  or if we don't import this then also this will work

        System.out.println("Lowercase "+ ch2);
 
    }

    else{
        ch3 = Character.toUpperCase(ch);
        System.out.println("Uppercase "+ ch3);
    }

ref.close();

    }
}
*/






//  convert character LowerCase to UpperCase or 
// UpperCase to LowerCase convert 
// input is : A to Z then LowerCase : a to z 
// input is : a to z then UpperCase : A to Z







/*
import java.util.Scanner;
import java.lang.Character;
class Convertcharacter{
    public static void main(String[] args) {
        char ch,ch1,ch2;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any character: ");
        ch = ref.nextLine().charAt(0);
        if ( ch >= 'a' && ch <= 'z' ){
            ch1=Character.toUpperCase(ch);
            System.out.print("Uppercase is: "+ch1);
         }
        else{
            ch2 = Character.toLowerCase(ch);
            System.out.print("Lowercase is: "+ ch2 );
         }
        ref.close();
    }
}
    */





    import java.util.Scanner;
    import java.lang.Character;
    class Convertcharacter{
        public static void main(String[] args) {
            char ch,ch1,ch2;
            Scanner ref = new Scanner(System.in);
            System.out.print("Enter any character: ");
            ch = ref.nextLine().charAt(0);
            if ( ch >= 'a' && ch <= 'z' ){
                ch1=Character.toUpperCase(ch);
                System.out.print("Uppercase is: "+ch1);
             }
            else{
                ch2 = Character.toLowerCase(ch);
                System.out.print("Lowercase is: "+ ch2 );
             }
            ref.close();
        }
    }





























/*
import java.util.Scanner;
import java.lang.Character;
class Convertcharacter{
    public static void main(String []args){
        char ch,ch2,ch3;
        System.out.print("Enter any Character ");
        Scanner ref = new Scanner(System.in);
        ch = ref.nextLine().charAt(0);      // charAt is from String class method and nextInt() or next() from Scanner class method
    //    ch = ref.next().charAt(0);     // here in Scanner class we have not given any method for character so for this we are using charAt() which is form string class. 
        

    if (ch>='A' && ch<='Z'){
       ch2 = Character.toLowerCase(ch);          // in java for converting the character we have a method which is   toLowerCase();      and also toUpperCase()  ,
        // this method provides by java that convert uppercase character to lowercase character,
            //  and this method is inside in the Character class in java,
        //  and this  Character      class   is in java.lang package in java and,
        //  this package is default package in java so this we can import,
        //  or if we don't import this then also this will work

        System.out.println("Lowercase "+ ch2);
 
    }

    else{
        ch3 = Character.toUpperCase(ch);
        System.out.println("Uppercase "+ ch3);
    }



    }
}
    */








 