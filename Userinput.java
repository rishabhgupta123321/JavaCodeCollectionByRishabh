import java.util.Scanner;
class Userinput{
    public static void main(String[] args){
    int a,b;
    Scanner ojs = new Scanner(System.in);
    System.out.print("Enter value: ");
    a = ojs.nextInt();
    b = ojs.nextInt();
    System.out.println(a+" "+b);
    System.out.println(a+ +b);
    System.out.println(a + b);
    ojs.close();          // this ojs.close()    show that now we don't 
    }                   // of input object for taking any input, 
}            // so that's why we want to close the object which we created for taking the input.