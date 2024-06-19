                    /*Relational operators Examples */





import java.util.Scanner;
public class Relationaloperator {
    public static void main(String[] args) {
    int a, b;
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    a=obj.nextInt();
    b=obj.nextInt();
    System.out.println("True/False: "+(a<b));
    System.out.println("True/False: "+(a>b));
    System.out.println("True/False: "+(a<=b));
    System.out.println("True/False: "+(a>=b));
    System.out.println("True/False: "+(a!=b));
    System.out.println("True/False: "+(a==b));
    obj.close();                 // this closing method is optional for using.
}
}