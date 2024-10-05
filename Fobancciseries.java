                             /*  w.a.p. to print Fibonacci Series */
// Requirements - 0, 1, 1, 2, ---->  term ---->  6 ----> 0, 1, 1, 2, 3, 5 
// term    means no. of elements in Fobancci Series
// a = 0 , b = 1, c = a+b = 0+1 = 1


import java.util.Scanner;
class Fobancciseries{
    public static void main(String []args){
        int term, a = 0, b = 1, c;
        // in this value will be come according to term and iterate the values so we will use for loop for this.
        Scanner r = new Scanner(System.in);
        System.out.print("Enter no. of term: ");
        term = r.nextInt();
        System.out.print("Fobancci Series: ");
        for(int i = 1;i<=term;i++){
                System.out.print(a+" ");
                c = a+b;
                a = b;
                b = c;             
            
        }

r.close();
    }
}


