         /* make calculator program */





// import java.util.Scanner;
// class calculator{
//     public static void main(String []args){
//         int a,b,ch;
//         Scanner ref = new Scanner(System.in);
//         System.out.print("Enter any two numbers:- ");
//         a = ref.nextInt();
//         b = ref.nextInt();
//         System.out.print("Select operaion ");
//         ch = ref.nextInt();
//         if(ch==1){
//             System.out.println(a+" + "+ b +" = "+ (a+b));
//         }
//         else if(ch==2){
//             System.out.println(a+" * "+ b+ " = " +(a*b));
//         }
//         else if(ch==3){
//             System.out.println(a+" - "+ b +" = "+ (a-b));
//         }
//         else if(ch==4){
//             System.out.print(a+" / "+ b +" = " +(a/b));
//         }
//         else{
//             System.out.print(a+" % "+ b +" = "+ (a%b));
//         }
//     ref.close();
//     }
// }


/**
import java.util.Scanner;
class calculator{
    public static void main(String []args){
        int a,b,ch;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any two numbers:- ");
        a = ref.nextInt();
        b = ref.nextInt();
        System.out.println("Select operaion ");
        System.out.println("1. Addition operation- ");
        System.out.println("2. Subtraction operaion- ");
        System.out.println("3. Multiplication operaion- ");
        System.out.println("4. Divide operaion- ");
        System.out.println("5. Modulus operaion- ");
        ch = ref.nextInt();
        switch (ch) {
            case 1:
                System.out.println(a+" + "+ b +" = "+ (a+b));
                break;
            case 2:
                System.out.println(a+" - "+ b +" = "+ (a-b));
                break;
            case 3:
                System.out.println(a+" * "+ b+ " = " +(a*b));
                break;
            case 4:
                if(b!=0){   
                System.out.print(a+" / "+ b +" = " +(a/b));
                }
                else{
                    System.out.println("Error: Division by Zero is not allowed.");
                }
                break;
            case 5:
            if(b!=0){ 
                System.out.print(a+" % "+ b +" = "+ (a%b));
            } else {
                System.out.println("Error: Division by Zero is not allowed.");
            }
            break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
    ref.close();
    }
}
*/



/**
import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        int n,m; char ch;
        Scanner reff = new Scanner(System.in);
        System.out.print("Enter any two number:  ");
        n = reff.nextInt();
        m = reff.nextInt();
        System.out.print("Enter your operation: ");
        ch = reff.next().charAt(0);
        if(ch == '+'){
            System.out.print(n + " + "+ m +" = " +(n+m));
        }
        else if(ch == '-'){
            System.out.print(n + " - "+ m +" = " +(n-m));
        }
            else if(ch == '*'){
                System.out.print(n + " * "+ m +" = " +(n*m));
            }
            else if(ch == '/'){
                System.out.print(n + " / "+ m +" = " +(n/m));
            }
            else{
                System.out.print(n + " % "+ m +" = " +(n%m));
            }
            reff.close();
    }
}
*/






import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        int n,m; char ch;
        Scanner reff = new Scanner(System.in);
        System.out.print("Enter any two number:  ");
        n = reff.nextInt();
        m = reff.nextInt();
        System.out.print("Enter your operation: ");
        ch = reff.next().charAt(0);
        if(ch == '+'){
            System.out.print(n + " + "+ m +" = " +(n+m));
        }
        else if(ch == '-'){
            System.out.print(n + " - "+ m +" = " +(n-m));
        }
            else if(ch == '*'){
                System.out.print(n + " * "+ m +" = " +(n*m));
            }
            else if(ch == '/'){
                System.out.print(n + " / "+ m +" = " +(n/m));
            }
            else{
                System.out.print(n + " % "+ m +" = " +(n%m));
            }
            reff.close();
    }
}