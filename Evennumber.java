/* Print all even number from 1 to n- */
/* print even number in the given range -  */



// import java.util.Scanner;
// class Evennumber{
//     public static void main(String []args){
//         int i,n;
//         Scanner x = new Scanner(System.in);
//         System.out.print("Enter the no. of term..- ");
//         n=x.nextInt();
//         for(i = 0;i<=n;i=i+2){
//             System.out.print(i+" ");
//         }
//     x.close();
//     }
// }



// import java.util.Scanner;
// class Evennumber{
//     public static void main(String []args){
//         int i,n;
//         try (Scanner x = new Scanner(System.in)){
//         System.out.print("Enter the no. of term..- ");
//         n=x.nextInt();
//         for(i = 0;i<=n;i=i+2){
//             System.out.print(i+" ");
//         }
//     x.close();
//     }
// }
// }




// import java.util.Scanner;
// class Evennumber{
//     public static void main(String []args){
//         int i,n;
//         try (Scanner x = new Scanner(System.in)){
//         System.out.print("Enter the no. of term..- ");
//         n=x.nextInt();
//         for(i = 0;i<=n;i=i+2){
//             System.out.print(i+" ");
//         }
//     }
// }
// }





// import java.util.Scanner;
// class Evennumber{
//     public static void main(String []args){
//         int i,n;
//         try (Scanner x = new Scanner(System.in)){
//         System.out.print("Enter the no. of term..- ");
//         n=x.nextInt();
//         for(i = 0;i<=n/2;i++){
//             System.out.print(2*i+" ");
//         }
//     }
// }
// }





// import java.util.Scanner;
// class Evennumber{
//     public static void main(String []args){
//         int i,n;
//         try (Scanner x = new Scanner(System.in)){
//         System.out.print("Enter the no. of term..- ");
//         n=x.nextInt();
//         for(i = 1;i<=((n/2)+1);i++){          // in this for it is happening according to the precedence.
//             System.out.print(2*i-2+" ");
//         }
//     }
// }
// }







import java.util.Scanner;
class Evennumber{
    public static void main(String []args){
        int i,n;
        try (Scanner x = new Scanner(System.in)){
        System.out.print("Enter the no. of term..- ");
        n=x.nextInt();
        for(i = 0;i<=n;i++){          // in this for it is happening according to the precedence.
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
}






