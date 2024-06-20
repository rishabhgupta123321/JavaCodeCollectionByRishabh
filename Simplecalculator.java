// simple calculator program using switch statement.



// this is like a if else-if statement.
import java.util.Scanner;
class Simplecalculator{
    public static void main(String []args){
       int a = 3, b = 5, ch;
       System.out.println("Enter user choice..! "); 
       Scanner ref = new Scanner(System.in);
        ch = ref.nextInt();
        
        switch(ch){        // here ch is a expression(condition)
            case 1: 
            System.out.println("Sum = "+ (a+b));
            break;                    // in this break statement will execute when case 1 will true otherwise 
            case 2:   
            System.out.println("Subtr = "+ (a-b));                    
                                   // this will go to the case 2 and then if true then break and come outside of the switch statement
            break;                           // and then if case 2 and execute and after that if we will not 
            case 3:  
            System.out.println("multi = "+ (a*b));
                                // apply break then after without seeing any condition this will print all statement 
            break;                     // so for this we have to use break in switch statement.
            case 4:
            System.out.println("div = "+ (a%b));
            break;
            default:
            System.out.println("Invalid choice..!");
        }
    ref.close();
    }


}