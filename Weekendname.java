                /*Enter code of Day and print name of Day */  /*Print day name of Weekend */
                // input code (0-6) 


/*
import java.util.Scanner;
class Weekendname{
    public static void main(String[] args) {
        int n;
        System.out.print("Enter code of Day- ");
        try (Scanner r = new Scanner(System.in)){
        n = r.nextInt();

        switch (n) 
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Code");
                break;
        }
        r.close();
        }
    }
}
    */





// import java.util.Scanner;
// public class Weekendname{
//     public static void main(String[] arg){
//         int a;
//         System.out.print("Enter code of day: ");
//         Scanner r = new Scanner(System.in);
//         a = r.nextInt();
//         r.close();
//         // now we have to use switch statement for selection 
//         switch(a){
//             case 0: 
//             System.out.println("Sunday");
//             break;
//             case 1:
//             System.out.println("Monday");
//             break;
//             case 2: 
//             System.out.println("Tuesday");
//             break;
//             case 3: 
//             System.out.println("Wednesday");
//             break;
//             case 4: 
//             System.out.println("Thursday");
//             break;
//             case 5: 
//             System.out.println("Friday");
//             break;
//             case 6: 
//             System.out.println("Saturday");
//             break;
//             default: 
//             System.out.println("Invalid code ");
//         }
//     }
// }





import java.util.Scanner;
public class Weekendname{
    public static void main(String[] arg){
        int a;
        System.out.print("Enter code of day: ");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        // now we have to use switch statement for selection 
        switch(a){
            case 0: 
            System.out.println("Sunday");
            break;
            case 1:
            System.out.println("Monday");
            break;
            case 2: 
            System.out.println("Tuesday");
            break;
            case 3: 
            System.out.println("Wednesday");
            break;
            case 4: 
            System.out.println("Thursday");
            break;
            case 5: 
            System.out.println("Friday");
            break;
            case 6: 
            System.out.println("Saturday");
            break;
            default: 
            System.out.println("Invalid code ");
        }
        r.close();
    }
}