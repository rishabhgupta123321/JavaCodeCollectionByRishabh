/*Sum of the odd and even number-*/

/* in this firstly user will give the input and then if input no. is even then 
we will print the sum of the even number and then if input no. is the odd then we will 
print the sum of odd numbers.
*/



/*
import java.util.Scanner;
class Oddeven{
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the no. of term-- ");
        n = r.nextInt();
        if(n%2==0){
            for(i=0;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("Sum of Even numbers-- "+ sum);
        }
        else{
            for(i=1;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("Sum of Odd numbers-- "+ sum);
        }
    }
}
*/





// import java.util.Scanner;
// class Oddeven{
//     public static void main(String[] args) {
//         int n,i,sum=0;
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter the no. of term-- ");
//         n = r.nextInt();
//         if(n%2==0){
//             for(i=0;i<=n;i=i+2){
//                 sum=sum+i;
//             }
//             System.out.println("Sum of Even numbers-- "+ sum);
//         }
//         else{
//             for(i=1;i<=n;i=i+2){
//                 sum=sum+i;
//             }
//             System.out.println("Sum of Odd numbers-- "+ sum);
//         }
//         r.close();
//     }
// }








// import java.util.Scanner;
// class Oddeven{
//     public static void main(String[] args) {
//         int n,i,sum=0;
//         try (Scanner r = new Scanner(System.in)){
//         System.out.print("Enter the no. of term-- ");
//         n = r.nextInt();
//         if(n%2==0){
//             for(i=0;i<=n;i=i+2){
//                 sum=sum+i;
//             }
//             System.out.println("Sum of Even numbers-- "+ sum);
//         }
//         else{
//             for(i=1;i<=n;i=i+2){
//                 sum=sum+i;
//             }
//             System.out.println("Sum of Odd numbers-- "+ sum);
//         }
//         r.close();
//         }
//     }
// }












import java.util.Scanner;
class Oddeven{
    public static void main(String[] args) {
        int n,i,sum=0;
        try (Scanner r = new Scanner(System.in)){
        System.out.print("Enter the no. of term-- ");
        n = r.nextInt();
        if(n%2==0){
            for(i=0;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("Sum of Even numbers-- "+ sum);
        }
        else{
            for(i=1;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.println("Sum of Odd numbers-- "+ sum);
        }
        }
    }
}




//  odd number - 1,3,5,7,9,11,13,15,17.............
//  even number - 0,2,4,6,8,10,12,14,16,18..............