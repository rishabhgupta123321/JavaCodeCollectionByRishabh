                             /*  w.a.p. to print Fibonacci Series */
// Requirements - 0, 1, 2, 3, ---->  term ---->  6 ----> 0, 1, 2, 3, 6 
// term    means no. of elements in Tribonacci Series
// a = 0 , b = 1, c = 2 ----> d = a+b+c ----> d = 3




import java.util.Scanner;
class Tribonacciseries{
    public static void main(String []args){
        int term, a = 0, b = 1, c = 2, d;
        // in this value will be come according to term and iterate the values so we will use for loop for this.
        Scanner r = new Scanner(System.in);
        System.out.print("Enter no. of term: ");
        term = r.nextInt();
        System.out.print("Tribonacci Series: ");
        for(int i = 1;i<=term;i++){
                System.out.print(a+" ");
                d = a+b+c;
                a = b;
                b = c;             
                c = d;
        }

r.close();
    }
}