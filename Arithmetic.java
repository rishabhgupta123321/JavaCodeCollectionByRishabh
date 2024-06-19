                          /* Arithmetic operator Example- */




import java.util.Scanner;
class Arithmetic {
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
