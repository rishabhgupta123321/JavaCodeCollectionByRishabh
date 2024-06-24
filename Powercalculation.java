          /*Calculate power of a number- */

import java.util.Scanner;
class Powercalculation{
    public static void main(String[] args){
        int n = 5, p = 2,z=1;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the number....- ");
        n = r.nextInt();
        System.out.print("Enter the power of n number.....- ");
        p = r.nextInt();
        for(int i = 1; i<=p;i++){
            z = z*n;
        }
        System.out.print("power "+ p+ " of "+ n + " is " +z);
    r.close();
    }
}



// import java.util.Scanner;
// class Powercalculation {
//     public static void main(String[] args) {
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter the number....- ");
//         int n = r.nextInt();
//         System.out.print("Enter the power of n number.....- ");
//         int p = r.nextInt();
//         int result = 1;
//         for (int i = 0; i < p; i++) {
//             result *= n;
//         }
//         System.out.println("power " + p + " of " + n + " is " + result);
//         r.close();
//     }
// }



// import java.util.Scanner;
// class Powercalculation {
//     public static void main(String[] args) {
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter the number....- ");
//         double n = r.nextDouble();
//         System.out.print("Enter the power of n number.....- ");
//         double p = r.nextDouble();
//         double result = Math.pow(n, p);
//         System.out.println("power " + p + " of " + n + " is " + result);
//         r.close();
//     }
// }






// import java.util.Scanner;
// class Powercalculation {
//     public static void main(String[] args) {
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter the number....- ");
//         int n = r.nextInt();
//         System.out.print("Enter the power of n number.....- ");
//         int p = r.nextInt();
//         int result = power(n, p);
//         System.out.println("power " + p + " of " + n + " is " + result);
//         r.close();
//     }

//     static int power(int n, int p) {
//         if (p == 0)
//             return 1;
//         else
//             return n * power(n, p - 1);
//     }
// }












// class Powercalculation{
//     public static void main(String[] args){
//         int n = 5, p = 2,z=1;
//         for(int i = 1; i<=p;i++){
//         z = z*n;
//         }
//         System.out.print("power "+ p+ " of "+ n + " is " +z);
//     }
// }