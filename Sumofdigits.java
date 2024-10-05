                /*Sum of Digits- */
// Requirements - 
// input 123 - -------> sum of digits - 1+2+3 = 6




/*
import java.util.Scanner;
class Sumofdigits{
    public static void main(String[] args) {
        int n,r,s=0;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number:- ");
        n = ref.nextInt();
        System.out.print("Sum of digits- ");
        while(n>0){
            r = n%10;                // for remainder 
            s = s+r; 
            n = n/10;          // and for quotient 
        }
        System.out.print(s);
        ref.close();
    }
}
*/




/*
import java.util.Scanner;
class Sumofdigits{
    public static void main(String[] args) {
        int n,result,sum=0;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = r.nextInt();
        for(int i = n; i>0;i = i/10){
            result = i%10;
            sum = sum + result;
        }
        System.out.println("Sum of digits is: "+ sum);
    r.close();
    }
}
*/






/*
import java.util.Scanner;
class Sumofdigits{
    public static void main(String[] args) {
        int n,r,s=0;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number:- ");
        n = ref.nextInt();
        System.out.print("Sum of digits- ");
        for(int i=n;i>0;i=i/10){
            r = i%10;
            s = s+r;
        }
        System.out.print(s);
        ref.close();
    }
}
*/



/*
class Sumofdigits{
    public static void main(String[] argss){
        int n = 257;
        byte b = (byte)n;
        System.out.print(b);
    }
}
    */

// in above 1 is output is coming because i know that byte (8 bit) range is from -128 to 127, so it means we have 256 so 
// it mwans we have 1 extra value that will come as a output. 256 is 0000 0001 0000 0001 so this will the last 8 bit 

// boolean b = false;




/*
class Sumofdigits{
public static void main(String []argss){
int n = 10;
System.out.println(n);
if(n==10){
    n=20;
    System.out.println(n);
}
System.out.println(n);
}
}
*/



/*
class Sumofdigits{
    public static void main(String []argss){
    int maximum = 10;
    System.out.println("maximum");
    
    }
    }
*/



/*
class Sumofdigits{
    public static void main(String []argss){
    int i = 1;
    while(i==1){
        System.out.print(i);
    }
    }
    }
*/




/*
class Sumofdigits{
    public static void main(String []argss){
    int sum = 0;
    for(int i=0,j=0; i<5 && j<5; ++i, j=i+1){ // 0 0    1 2  2 3     3 4    4 5  condition false  
    sum += i;  // 0  1 3 6
    System.out.print(sum);  // 0136 
    }    // 0+1 = 1 , 1+1 = 2   2 3     3 4    4 5
    }
    }

*/



/*
class Sumofdigits{
    public static void main(String []argss){
    int sum = 0;
    for(int i=0,j=0; i<5 && j<5; ++i, j=i+1) 
    sum += i;  
    System.out.print(sum);  
             // so without curly bracket in for loop values will be override so that in 0 then 1 then 2 then 6 value will come so in this 
             // in output will come is 6.
    }
    }
    */


/*
    class Sumofdigits{
        public static void main(String []argss){
        int i = 1;
        for(i=0;i++<=10;){
            System.out.print(i);
        }
        }
        }
    */