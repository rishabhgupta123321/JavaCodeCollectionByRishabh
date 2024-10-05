                          /* Arithmetic operator Example- */



/*
import java.util.Scanner;
class Arithmeticoperator {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter data of two numbers:- ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Addition:- "+(a+b));
        System.out.println("Subtraction:- "+(a-b));
        System.out.println("Multiplication:- "+(a*b));
        System.out.println("Division:- "+(a/b));
        System.out.println("Remainder:- "+(a%b));
        obj.close();  // in this after this we had not needed any other input object that's why we can close this.
    }
}
*/






/*
import java.util.Scanner;
class Arithmeticoperator{
    public static void main(String[] args) {
        int a, b;
        Scanner oper = new Scanner(System.in);
        System.out.print("Enter any two numbers.... ");
        a = oper.nextInt();
        b = oper.nextInt();
        System.out.println("Addition - "+a+b);
        System.out.println("Substraction - "+(a-b));
        System.out.println("Multiplication - "+a*b);
        System.out.print("Division - "+a/b+"\n");
        System.out.print("Remainder - "+a%b);
        oper.close();

    }
}
*/





/*
import java.util.Scanner;
class Arithmeticoperator{
    public static void main(String[] args) {
        int a, b;
        Scanner oper = new Scanner(System.in);
        System.out.print("Enter any two numbers.... ");
        a = oper.nextInt();
        b = oper.nextInt();
        System.out.println("Addition - "+(a+b));
        System.out.println("Substraction - "+(a-b));
        System.out.println("Multiplication - "+(a*b));
        System.out.print("Division - "+(a/b)+"\n");
        System.out.print("Remainder - "+(a%b));
        oper.close();
    }
}
*/




/*
import java.util.Scanner;
class Arithmeticoperator{
    public static void main(String[] args) {
        int a, b;
        try(Scanner oper = new Scanner(System.in)){
        System.out.print("Enter any two numbers.... ");
        a = oper.nextInt();
        b = oper.nextInt();
        System.out.println("Addition - "+(a+b));
        System.out.println("Substraction - "+(a-b));
        System.out.println("Multiplication - "+(a*b));
        System.out.print("Division - "+(a/b)+"\n");
        System.out.print("Remainder - "+(a%b));
        // oper.close();
        }
    }
}
*/




import java.util.Scanner;
class Arithmeticoperator{
    public static void main(String[] args) {
        int a, b;
        try(Scanner oper = new Scanner(System.in)){
        System.out.print("Enter any two numbers.... ");
        a = oper.nextInt();
        b = oper.nextInt();
        System.out.println("Addition - "+(a+b));
        System.out.println("Substraction - "+(a-b));
        System.out.println("Multiplication - "+(a*b));
        System.out.print("Division - "+(a/b)+"\n");
        System.out.print("Remainder - "+(a%b));
        // oper.close();
        }
    }
}



