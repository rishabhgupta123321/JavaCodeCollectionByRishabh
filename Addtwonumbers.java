     /* Add Two Numbers Program in java(Without user input)  */ 






// class Addtwonumbers{
//     public static void main(String args[]){
//         int a = 2, b = 4;   
//         System.out.print(a+b);           // so in this we have add operator logic for adding to numbers without taking user input.
//     }
// }




// class Addtwonumbers{
//     public static void main(String args[]){
//         int a = 2, b = 4;   
//         System.out.print("Sum = "+(a+b));         
//     }
// }



                   /* Add two numers in java by taking user input -  */



import java.util.Scanner;
class Addtwonumbers{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number - ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
        obj.close();
    }
}






/* 
import java.util.Scanner;
class Addtwonumbers{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number - ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
    }
}    
*/




/*
import java.util.Scanner;
class Addtwonumbers{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number - "); 
        try (Scanner obj = new Scanner(System.in)){    // for automatically closed the Scanner class object.
        a = obj.nextInt();
        b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
        obj.close();
        }
    }
}
*/





/*
import java.util.Scanner;
class Addtwonumbers{
    public static void main(String[] args){
        int a,b;
        System.out.println("Enter two number - "); 
        try (Scanner obj = new Scanner(System.in)){    // for automatically closed the Scanner class object.
        a = obj.nextInt();
        b = obj.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+ sum);
        }
    }
}
*/