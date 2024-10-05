          /* Find square root of a number */
// input 25 ----->  5



/*
import java.util.Scanner;
class Square{
    public static void main(String []argss){
        int n;
        double m;
        Scanner lkss = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = lkss.nextInt();
        m = Math.sqrt(n);   // in this i know that Math is a class name that is in java.lang package but that is default so we can also write or not that's not matter 
        //                   here sqrt is the method of Math class 
        System.out.println("Square root of "+ n+" is : "+ m);     // in this we have passed a message and concetaantion operator also
        lkss.close();
    }
}
*/






import java.util.Scanner;
import java.lang.Math;    // it is the default package in java 
class Square{
    public static void main(String []argss){
        int n;
        double m;
        Scanner lkss = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = lkss.nextInt();
        m = Math.sqrt(n);   // in this i know that Math is a class name that is in java.lang package but that is default so we can also write or not that's not matter 
        //                   here sqrt is the method of Math class 
        System.out.println("Square root of "+ n+" is : "+ m);     // in this we have passed a message and concetaantion operator also
        lkss.close();
    }
}