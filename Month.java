                    /*Enter month number and print number of days in a month with month name */
// Requirements-
// input  month number -  1 ------->    January= 31 Days







// import java.util.Scanner;
// class Month{
//     public static void main(String[] args) {
//         int n;
//         System.out.print("Enter any month number:- ");
//         Scanner r = new Scanner(System.in);
//         n = r.nextInt();
//         switch(n)
//         {
//             case 1:
//                 System.out.println("Jan = 31 Days");
//             break;
//             case 2:
//                 System.out.println("Feb = 28 Days");    //  but in leap year in feb we do have 29 days
//             break;
//             case 3:
//                 System.out.println("March = 31 Days");
//             break;
//             case 4:
//                 System.out.println("April = 30 Days");
//             break;
//             case 5:
//                 System.out.println("May = 31 Days");
//             break;
//             case 6:
//                 System.out.println("June = 30 Days");
//             break;
//             case 7:
//                 System.out.println("July = 31 Days");
//             break;
//             case 8:
//                 System.out.println("Aug = 31 Days");
//             break;
//             case 9:
//                 System.out.println("Sept = 30 Days");
//             break;
//             case 10:
//                 System.out.println("Oct = 31 Days");
//             break;
//             case 11:
//                 System.out.println("Nov = 30 Days");
//             break;         
//             case 12:
//                 System.out.println("Dec = 31 Days");
//             break; 

//             default:
//             System.out.println("Invalid month number");
//             break;       
//         }
//     r.close();
//     }
// }




// this program also we can make with      if      else if      else    logic.





/* 
import java.util.Scanner;
class Month{
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any month number:- ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        if(n==1){
                System.out.println("Jan = 31 Days");
        }
        else if(n==2){
                System.out.println("Feb = 28 Days");    //  but in leap year in feb we do have 29 days
        }
        else if(n==3){
                System.out.println("March = 31 Days");
        }
        else if(n==4){
                System.out.println("April = 30 Days");
        }
        else if(n==5){
                System.out.println("May = 31 Days");
            }
            else if(n==6){
                System.out.println("June = 30 Days");
            }
            else if(n==7){
                System.out.println("July = 31 Days");
            }
            else if(n==8){
                System.out.println("Aug = 31 Days");
            }
            else if(n==9){
                System.out.println("Sept = 30 Days");
            }
            else if(n==10){
                System.out.println("Oct = 31 Days");
            }
            else if(n==11){
                System.out.println("Nov = 30 Days");
            }         
            else if(n==12){
                System.out.println("Dec = 31 Days");
            }
            else{
            System.out.println("Invalid month number");       
        }
    r.close();
    }
}
*/

import java.util.Scanner;

public class Month{
    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Code no. of month: ");
        n = r.nextInt();
        r.close();
        switch(n){
            case 1: System.out.print("Jan == 31 days");
            break;
            case 2: System.out.println("feb == 28 days");  // in leap year in this will be 29 days.
            break;
            case 3: System.out.print("march == 31 days");
            break;
            case 4: System.out.print("april == 30 days");
            break;
            case 5: System.out.print("may == 31 days");
            break;
            case 6: System.out.print("Jun == 30 days");
            break;
            case 7: System.out.print("July == 31 days");
            break;
            case 8: System.out.print("aug == 31 days");
            break;
            case 9: System.out.print("sep == 30 days");
            break;
            case 10: System.out.print("oct == 31 days");
            break;
            case 11: System.out.print("nov == 30 days");
            break;
            case 12: System.out.print("dec == 31 days");
            break;
            default: 
            System.out.println("Invalid Code");
            break;
        }
    
    }
}





// in this we can also apply if-else condition also.

















