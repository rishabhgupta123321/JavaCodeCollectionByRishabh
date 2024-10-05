/* If else-if ladder statement....! -  */




// this we apply when we have many conditions then we can apply.


// import java.util.Scanner;
// class Ifelseifladderstatement{
//     public static void main(String[] args) {
//         int marks; 
//         System.out.print("Enter your marks:- ");
//         Scanner ref = new Scanner(System.in);
//         marks = ref.nextInt();
//         if(marks>=80){
//             System.out.println("Topper Student");
//         }
//         else if (marks<80 && marks >= 60){
//             System.out.println("First Student");
//         }
//         else{
//             System.out.println("Second Student");
//         }
//         ref.close();
//     }
// }





import java.util.Scanner;
class Ifelseifladderstatement{
    public static void main(String[] args) {
        int a;
        try(Scanner ksla = new Scanner(System.in)){
        System.out.print("Enter any number.... ");
        a = ksla.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        else if (a==0)
        {
            System.out.println("neigher +ve number or nor -ve");
        }
        else{
            System.out.println("Negative number");
        }
    }
    }
}










// import java.util.Scanner;
// class Ifelseifladderstatement{
//     public static void main(String[] args) {
//         int a;
//         try(Scanner ksla = new Scanner(System.in)){
//         System.out.print("Enter any number.... ");
//         a = ksla.nextInt();
//         switch(a){
//             case 1: System.out.println("positive number");
//             break;
//             case 2: System.out.println("neigher +ve number or nor -ve");
//             break;
//             case 3: System.out.println("Negative number");
//             default: System.out.println("Invalid input");
//         }
//     }
//     }
// }