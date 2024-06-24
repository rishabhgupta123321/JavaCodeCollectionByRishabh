              /*Maximum number between two Numbers- */




/*
class Maxnumber{
    public static void main(String[] args){
        int a = 2,b = 4;
        if(a>b){   // 2>4   wrong 
            System.out.print(a);
        }
        else{    // 2<4  correct 
            System.out.print(b);
        }
    }
}
    */





import java.util.Scanner;
class Maxnumber{
    public static void main(String[] args){
        int a,b;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any two numbers --  ");
        a= r.nextInt();
        b= r.nextInt();
        if(a>b){    
            System.out.print(a);
        }
        else{     
            System.out.print(b);
        }
    r.close();
    }
}






/*
import java.util.*;      // * is for all classes like Scanner and others. 
class Maxnumber{
    public static void main(String[] args){
        int a,b;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any two numbers --  ");
        a= r.nextInt();
        b= r.nextInt();
        if(a>b){    
            System.out.print(a);
        }
        else{     
            System.out.print(b);
        }
    r.close();
    }
}
*/ 






/*
import java.util.Scanner;
class Maxnumber{
    public static void main(String[] args){
        int a,b;
        try (Scanner r = new Scanner(System.in)){
        System.out.print("Enter any two numbers --  ");
        a= r.nextInt();
        b= r.nextInt();
        if(a>b){    
            System.out.print(a);
        }
        else{     
            System.out.print(b);
        }
    r.close();
        }
    }
}
*/









/*
import java.util.Scanner;
class Maxnumber{
    public static void main(String[] args){
        int a,b;
        try (Scanner r = new Scanner(System.in)){
        System.out.print("Enter any two numbers --  ");
        a= r.nextInt();
        b= r.nextInt();
        if(a>b){    
            System.out.print(a);
        }
        else{     
            System.out.print(b);
        }
        }
    }
}
*/

