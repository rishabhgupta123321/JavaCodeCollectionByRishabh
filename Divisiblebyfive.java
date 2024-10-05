                    /*A program to check divisibility of 5*/
// requirements - 
// input - 10     ------>   divisible by 5  
// input - 12     ------>   not divisible by 5 



/*
import java.util.Scanner;
class Divisiblebyfive{
    public static void main(String[] args){
        int n;
        System.out.print("Enter any number ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();               // because here we have conditional program so we will use if else logic.

        if(n%5 == 0){
            System.out.println("your number is Divisible by 5");
        }
        else{
            System.out.println("your number is not Divisible by 5");
        }
        r.close();
    }
}
    */





import java.util.Scanner;
public class Divisiblebyfive{
    public static void main(String[] args) {
        int a;
        Scanner rr = new Scanner(System.in);
        a = rr.nextInt();
        if(a%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Not Divisible by 5");
        }
        rr.close();
    }
}