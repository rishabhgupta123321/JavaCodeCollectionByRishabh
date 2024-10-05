/* Print all odd number from 1 to n- */
/* print odd number in the given range -  */





// import java.util.Scanner;
// class Oddnumber{
//     public static void main(String[] args) {
//     int n,i;
//     System.out.print("Enter the no. of terms- ");
//     try (Scanner y = new Scanner(System.in)){
//     n = y.nextInt();
//     for(i=1;i<=n;i=i+2){
//     System.out.print(i+" ");
//     }
//     y.close();
// }
// }
// }





// import java.util.Scanner;
// class Oddnumber{
//     public static void main(String[] args) {
//     int n,i;
//     System.out.print("Enter the no. of terms- ");
//     try (Scanner y = new Scanner(System.in)){
//     n = y.nextInt();
//     for(i=1;i<=n;i=i+2){
//     System.out.print(i+" ");
//     }
// }
// }
// }






// import java.util.Scanner;
// class Oddnumber{
//     public static void main(String[] args) {
//     int n,i;
//     System.out.print("Enter the no. of terms- ");
//     Scanner y = new Scanner(System.in);
//     n = y.nextInt();
//     for(i=0;i<n/2;i++){
//     System.out.print((2 * i + 1)+" ");
//     }
//     y.close();
// }
// }





// import java.util.Scanner;
// class Oddnumber{
//     public static void main(String[] args) {
//     int n,i;
//     System.out.print("Enter the no. of terms- ");
//     Scanner y = new Scanner(System.in);
//     n = y.nextInt();
//     for(i=1;i<n/2;i++){
//     System.out.print((2 * i - 1)+" ");
//     }
//     y.close();
// }
// }






// import java.util.Scanner;
// class Oddnumber{
//     public static void main(String[] args) {
//     int n,i;
//     System.out.print("Enter the no. of terms- ");
//     try (Scanner y = new Scanner(System.in)){
//     n = y.nextInt();
//     for(i=0;i<n/2;i++){
//     System.out.print((2 * i + 1)+" ");
//     }
//     y.close();
// }
// }
// }




// import java.util.Scanner;
// class Oddnumber{
//     public static void main(String[] args) {
//     int n,i;
//     System.out.print("Enter the no. of terms- ");
//     try (Scanner y = new Scanner(System.in)){
//     n = y.nextInt();
//     for(i=0;i<n/2;i++){
//     System.out.print((2 * i + 1)+" ");
//     }
// }
// }
// }












// import java.util.Scanner;
// class Oddnumber{
//     public static void main(String[] args) {
//     int n,i;
//     System.out.print("Enter the no. of terms- ");
//     try (Scanner y = new Scanner(System.in)){
//     n = y.nextInt();
//     for(i=0;i<n;i++){
//     if(i%2 == 1){
//         System.out.print(i+" ");
//     }
//     }
// }
// }
// }




// print all odd number from 1 to n 
// example - like 1 to 10 then it should be 1,3,5,7,9
// requirements - for loop and logic of odd number finding 
// write the basic syntax 




/**
import java.util.Scanner;
public class Oddnumber {
    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter no. of term....  ");
        n = r.nextInt();
        System.out.print("All odd numbers - ");
        for(int i = 1;i<=n;i++){
            if(i%2 != 0 ){      // here i can also write that     i%2==1    
             System.out.print(i+" ");   
            }
        }
    r.close();
    }
}
*/





import java.util.Scanner;
public class Oddnumber {
    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter no. of term....  ");
        n = r.nextInt();
        System.out.print("All odd numbers - ");
        for(int i = 1;i<=n;i=i+2){    // in between odd number and even number difference is one so we will increase the one and also we will shift one because here we don't want even value also.
            System.out.print(i+" ");      // i++ means that i = i+1  
        }
    r.close();
    }
}





