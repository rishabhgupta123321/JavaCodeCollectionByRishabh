                      /* Perfect number Program */

                      // Requirements - 
                      // input ----> 6 ----> 1 2 3 4 5 -----> 1 + 2 + 3 = 6 == 6 
                      // then 6 -----> Perfect number


/*                      
import java.util.Scanner;
class Perfectnumber{
    public static void main(String []args){
            int n, sum = 0;
            Scanner r = new Scanner(System.in);
            System.out.print("Enter any number: ");
            n = r.nextInt();
            for(int i = 1; i<n; i++){
                if(n%i==0){
                    sum = sum+i;
                } 
            }
            if(sum == n){
                System.out.print("Perfect number");
            }
            else{
                System.out.print("Not perfect number");
            }
            r.close();
    }
}
*/




import java.util.Scanner;
class Perfectnumber{
    public static void main(String []args){
            int n, sum = 0;
            Scanner r = new Scanner(System.in);
            System.out.print("Enter any number: ");
            n = r.nextInt();
            for(int i = 1; i<n; i++){
                if(n%i==0){
                    sum = sum+i;
                } 
            }
            if(sum == n)
                System.out.print("Perfect number");
            
            else
                System.out.print("Not perfect number");
            r.close();
    }
}