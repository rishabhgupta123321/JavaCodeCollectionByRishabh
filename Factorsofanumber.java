                /*Find factors of a number */
// requirements -         // By making the basic syntax and reqirements and by making a sample example of input and output,
//  then for making the logic of the program become very easy for program.
// input - 10 ------>     1    2    5    10  



/*
import java.util.Scanner;
class Factorsofanumber{
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number:- ");
        // after this we have to enter any value in the run time after compilation so we have to take Scanner class with package.
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        System.out.print("Factor of "+ n + " is - ");
        for(int i = 1 ; i<=n; i++){
            if(n%i == 0){
                System.out.print(i+" ");  // here we have used concetenation operator
            }
        }
    r.close();
    }
}
    */

import java.util.Scanner;
public class Factorsofanumber{
    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = r.nextInt();
        System.out.print("Factors of "+ n + "would be: ");
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        r.close();
    }
}