       /* count number of digits in a number-*/

// Requirement - 
// input 2342  ----->     4


/*
import java.util.Scanner;     // this java.util is a package for taking input by Scanner class.
class Digits{
    public static void main(String[] args){
        int n,count = 0;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: - ");
        n = r.nextInt();
        while(n>0){
            n=n/10;   // also we can write n/=10
            count++;
        }
        System.out.print("No of digits: - "+count);
    r.close();
    }
    }
*/





/*
import java.util.Scanner;     // this java.util is a package for taking input by Scanner class.
class Digits{
    public static void main(String[] args){
        int n,count = 0;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: - ");
        n = r.nextInt();
        for(int t = n;t>0;t=t/10){
            count++;
        }
        System.out.print("No of digits: - "+count);
    r.close();
    }
    }
    */








    import java.util.Scanner;     // this java.util is a package for taking input by Scanner class.
    class Digits{
        public static void main(String[] args){
            int n,count = 0;
            Scanner r = new Scanner(System.in);
            System.out.print("Enter any number: - ");
            n = r.nextInt();
            do {
                n=n/10;   // also we can write n/=10
                count++;
            }
            while(n>0);
            System.out.print("No of digits: - "+count);
        r.close();
        }
        }