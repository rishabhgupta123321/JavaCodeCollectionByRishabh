                           /* prime number program */
/*
                           // Requirements - 
// input number - 7 -----> prime number 
// like other numbers also like 2 , 3 , 5 , 7 , 11 are prime numbers 
// prime number always divide only by 1 and by itself like ex- 7 that 7 number is divide with 1 and only 7 .
*/





/*
import java.util.Scanner;
class Primenumber{
    public static void main(String[] args) {
        int n,count=0;
        Scanner ress = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = ress.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }    
        if(count==2){
            System.out.print("Given number is Prime number");
        }    
        else{
            System.out.print("Not prime number");
        }
        ress.close();
    }
}
*/






import java.util.Scanner;
class Primenumber{
    public static void main(String[] args) {
        int n,j=0;
        Scanner ress = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = ress.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                j++;
            }
        }    
        if(j==2)
            System.out.print("Given number is Prime number");
        
        else
            System.out.print("Not prime number");
        
        ress.close();
    }
}