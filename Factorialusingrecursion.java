                                /*  Factorial using recursion */



// this below code is incorrect 

/*

import java.util.Scanner;
class Factorialusingrecursion{
    
    public static void main(String []args)
    {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = r.nextInt();
        Factorialusingrecursion ref = new Factorialusingrecursion();
        int u = ref.factorial(n);
        System.out.print("Factorial of "+n+" is: "+ u);
        r.close();
    } 
    int factorial(int n)   // non-static 
    {
        if(n>0)
        {
            return n * factorial(n-1);
        }
        else{
            return 0;     // here in factorial we are using * not + it means so for that we have to return value 1 
                            // otherwise this will give the 0 output always
        }
    }

}

*/






// this below code is correct 



/*

import java.util.Scanner;
class Factorialusingrecursion{
    
    public static void main(String []args)
    {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = r.nextInt();
        Factorialusingrecursion ref = new Factorialusingrecursion();
        int u = ref.factorial(n);
        System.out.print("Factorial of "+n+" is: "+ u);
        r.close();
    } 
    int factorial(int n)   // non-static 
    {
        if(n>0)
        {
            return n * factorial(n-1);
        }
        else{
            return 1;    
        }
    }

}

*/





/*

import java.util.Scanner;
class Factorialusingrecursion {
    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = r.nextInt();                         

        Factorialusingrecursion ref = new Factorialusingrecursion();
        int u = ref.factorial(n);

        System.out.print("Factorial of " + n + " is: " + u);
        r.close();
    }

    int factorial(int n) {  // non-static method
        if (n == 0) {
            return 1;  // base case: 0! = 1
        } else {
            return n * factorial(n - 1);  // recursive case
        }
    }
}

*/






import java.util.Scanner;
class Factorialusingrecursion{
    
    public static void main(String []args)
    {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = r.nextInt();
        Factorialusingrecursion ref = new Factorialusingrecursion();
        int u = ref.factorial(n);
        System.out.print("Factorial of "+n+" is: "+ u);
        r.close();
    } 
    int factorial(int n)   // non-static 
    {
        if(n==0)  // because 0! == 1 
        {
            return 1;
        }
        else{         
            return n * factorial(n - 1);    
        }
    }

}