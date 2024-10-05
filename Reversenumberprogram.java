                              /*Reverse number program*/
// Requirements
// input -  123    ------>     321 





/* 
import java.util.Scanner;
class Reversenumberprogram{
    public static void main(String []argggg){
        int n,r;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        n = obj.nextInt();
        System.out.print("Reverse Number is - ");
        for(int i=n;i>0;i=i/10){     // i here we are doing updation by dividing for quotient.
            r=i%10;  // r is remainder.
            System.out.print(r);
           }
        obj.close();
        
    }
}
*/




/*
import java.util.Scanner;
class Reversenumberprogram{
    public static void main(String []argggg){
        int n,r;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        n = obj.nextInt();
        System.out.print("Reverse Number is - ");
        while(n>0){     // i here we are doing updation by dividing for quotient.
            r=n%10;  // r is remainder.
            System.out.print(r);
            n = n/10;       
        }
        obj.close();
        
    }
}
*/





/*
import java.util.Scanner;
public class Reversenumberprogram{
    public static void main(String[] args) {
        int n, result;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = r.nextInt();    // 123
        for(int i = n; i>0;i = i/10){
            result = i%10;  //321
            System.out.print(result);
        }  // 12 1  0
        r.close();
    }
}
*/







import java.util.Scanner;
public class Reversenumberprogram{
    public static void main(String[] args) {
        int n, result;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = r.nextInt();    // 123
        while(n>0){
            result = n%10;
            System.out.print(result);
            n = n/10;
        }
        r.close();
    }
}