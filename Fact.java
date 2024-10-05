/*Factorial of a number-  */
// Requirement - input 5 ------->  120 (5*4*3*2*1) == (1*2*3*4*5)


/*
import java.util.Scanner;
class Fact{
    public static void main(String[] args){
        int i,n,facto=1;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the number for factorial....");
        n = r.nextInt();
        for(i=1;i<=n;i++){
            facto = facto*i; 
        }
        System.out.print("Factorial of a number is "+ facto);
    r.close();
    }
}
*/



/**
import java.util.Scanner;
class Fact{
    public static void main(String[] args){
        int i,n,facto=1;
        try(Scanner ref = new Scanner(System.in)){   // automatically closed.
        System.out.print("Enter the number for factorial....");
        n = ref.nextInt();
        for(i=n;i>=1;i--){
            facto = facto*i; 
        }
        System.out.print("Factorial of a number is "+ facto);
    ref.close();
    }
}
}
*/






import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        int n,facto = 1;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = r.nextInt();
        for(int i = n;i>=1;i--){
            facto *= i;
        }
        System.out.print("Factorial of "+ n + " is "+ facto);
        r.close();
    }    
}