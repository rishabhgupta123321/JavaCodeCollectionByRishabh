/* In condition or decision making statement we have two type's statement that is 1. if statement and 2. switch statement 
 * and in if statement we have many types like 1. simple if statement and 2. if else statement 3. if else ladder 4. 
 * Nested if else 
 */




// in when we do print any message then for new line we have to write println rather than print but in when we 
// take any input then automatically by compiler new line will take.  






/*
 //   here we have simple if statement in if statement- 
import java.util.Scanner;
class Simpleifstatement {
    public static void main(String asd[]){
        System.out.println("Enter your age..!");
        Scanner onb = new Scanner(System.in);
        int age = onb.nextInt();
        if(age>=18){
            System.out.println("You are Eligible for vote..!");    // Simple if statement in if statement
        }

        if(age<18){
            System.out.println("You are not Eligible for vote..!");    // Simple if statement in if statement
        }

        System.out.println("Thank you..!");
    onb.close();
    }

}

*/





// import java.util.Scanner;
// class Simpleifstatement{
//     public static void main(String[] args) {
//         int age;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter your age.... ");
//         age = obj.nextInt();
//         if(age>=18){
//             System.out.println("Congratulations, you are eligible for votes");
//         }
//         System.out.println("Thank you.");
//         obj.close();
//     }

// }








// import java.util.Scanner;
// class Simpleifstatement{
//     public static void main(String[] args) {
//         int age;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter your age.... ");
//         age = obj.nextInt();
//         if(age>=18){
//             System.out.println("Congratulations, you are eligible for votes");
//         }
//         if(age<16){
//             System.out.println("Sorry, you are eligible for votes");
//         }
//         System.out.println("Thank you.");
//         obj.close();
//     }
// }







// import java.util.Scanner;
// class Simpleifstatement{
//     public static void main(String[] args) {
//         int age;
//         Scanner obj = new Scanner(System.in);
//         System.out.print("Enter your age.... ");
//         age = obj.nextInt();
//         if(age>=18){
//             System.out.println("Congratulations, you are eligible for votes");
//         }
//         if(age<18){
//             System.out.println("Sorry, you are eligible for votes");
//         }
//         System.out.println("Thank you.");
//         obj.close();
//     }
// }








import java.util.Scanner;
class Simpleifstatement{
    public static void main(String[] args) {
        int age;
        try(Scanner obj = new Scanner(System.in)){
        System.out.print("Enter your age.... ");
        age = obj.nextInt();
        if(age>=18){
            System.out.println("Congratulations, you are eligible for votes");
        }
        if(age<18){
            System.out.println("Sorry, you are eligible for votes");
        }
        System.out.println("Thank you.");
    }
    }
}