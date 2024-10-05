



                /* if else statement */


// finding the number that it is +ve or  -ve number. 

/*
import java.util.Scanner;
class Ifelsestatement{
    int n;
    public static void main(String[] args){
        System.out.println("Enter any number..!");
        Ifelsestatement ref = new Ifelsestatement();
        int x = ref.n;
        Scanner orr = new Scanner(System.in);
        x = orr.nextInt(); 
        if(x>=0){
            System.out.println("+ve number");
        }
        else{
            System.out.println("-ve number");
        }
        orr.close();
    }
}
*/




// zero is neither positive nor negative number it is a neutral number

// find that number is positive or not

// import java.util.*;  // here we can also use * instead of taking Scanner because * is for all classes which is present in util package
// class Ifelsestatement{
//     public static void main(String[] args) {
//         int a;
//         Scanner ref = new Scanner(System.in);
//         System.out.print("Enter any number.. ");
//         a = ref.nextInt();
//         if(a>=0){
//             System.out.println("Positive number +ve");
//         }
//         else{ 
//             System.out.print("Negative number");
//         }
//         ref.close();
//     }
// }









// import java.util.*;  // here we can also use * instead of taking Scanner because * is for all classes which is present in util package
// class Ifelsestatement{
//     public static void main(String[] args) {
//         int a;
//         Scanner ref = new Scanner(System.in);
//         System.out.print("Enter any number.. ");
//         a = ref.nextInt();
//         if(a>=0)
//             System.out.println("Positive number +ve");  /* because we are using only one single statement in if and else condition 
//             so here we can also remove the curly bracket this will not give any error.*/
        
//         else 
//             System.out.print("Negative number");
        
//         ref.close();
//     }
// }











import java.util.Scanner;  // here we can also use * instead of taking Scanner because * is for all classes which is present in util package
class Ifelsestatement{
    public static void main(String[] args) {
        int a;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number.. ");
        a = ref.nextInt();
        if(a>=0)
            System.out.println("Positive number +ve");  /* because we are using only one single statement in if and else condition 
            so here we can also remove the curly bracket this will not give any error.*/
        
        else 
            System.out.print("Negative number");
        
        ref.close();
    }
}