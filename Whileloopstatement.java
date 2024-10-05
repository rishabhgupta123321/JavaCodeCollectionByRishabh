                             /*  WHILE LOOP EXAMPLE-..! */




/*

import java.util.Scanner;
class Whileloopstatement{
    public static void main(String[] args){
        int n;
        System.out.println("Enter value for condition:..! ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        while(n>=0){
            System.out.println("Company");
        }
        System.out.println("Invalid value:..!"); 
    ref.close();
    }
}


*/


  

// this above code is giving us the infinte no. of output.





// so now in this above code when we run we can see this is giving infinite output.
// so like this we don't know no. of iteration , so for this we apply while loop.





/* 
class Whileloopstatement{
    public static void main(String[] args){
        System.out.println("Company");
        System.out.println("Company");
        System.out.println("Company");
        System.out.println("Company");
        System.out.println("Company");
        System.out.println("Company");
    
    }
}
*/


// so like this above code if we print then it will take so much L.O.C. , so for this we 
// use while loop for like this. 








// in below if we want this like " company " output 10 times then also we will use while 
// loop where we do while loop.






// class Whileloopstatement{
//     public static void main(String[] args){
//         int n=1;       // i have done initialization process for n value.
//         while(n<=10){
//             System.out.println("Company");
//         n++;      //  Post-increment: n is incremented by 1 after this statement
//         }
//     }
// }


// and this above code is giving us limited no. of code's output.








/**
 * Whileloopstatement
 */
// import java.util.Scanner;
// public class Whileloopstatement {
//     public static void main(String[] args) {
//         int a;
//         Scanner obj = new Scanner(System.in);
//         a = obj.nextInt();
//         while(a>=0){
//             System.out.println("Hello hi");
//         }
//         System.out.println("Invalid value....");
//     }
// }





// import java.util.Scanner;
// public class Whileloopstatement {
//     public static void main(String[] args) {
//         int a;
//         Scanner obj = new Scanner(System.in);
//         a = obj.nextInt();
//         while(a>=0){
//             System.out.println("Hello hi");
//             ++a;
//         }
//         System.out.println("Invalid value....");
//     }
// }





// import java.util.Scanner;
// public class Whileloopstatement {
//     public static void main(String[] args) {
//         int a;
//         Scanner obj = new Scanner(System.in);
//         a = obj.nextInt();
//         while(a<=10){
//             System.out.println("Hello hi"+" ");
//             ++a;
//         }
//         System.out.println("Invalid value....");
//     }
// }





// here we don't know the number of iterations that how many iterations will be in advance.


import java.util.Scanner;
public class Whileloopstatement {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        while(a<=10){
            System.out.println(a);
            ++a;
        }
        System.out.println("Invalid value....");
        obj.close();
    }
}