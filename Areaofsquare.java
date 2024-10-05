                /*Area of Square Program*/
// Reqirements- 
// area = side*side 

/*
import java.util.Scanner;   
class Areaofsquare{
    public static void main(String[] args){
        int side,area;
        System.out.print("Enter side of Square: ");
        Scanner ref = new Scanner(System.in);
        side = ref.nextInt();  //side = 4

        area = side*side;     // 4*4=16
        System.out.print("Area of Square:- "+area);
        ref.close();
    }
}
*/




// import java.util.Scanner;
// public class Areaofsquare{
//     public static void main(String []args){
//         int a, area;
//         Scanner ref = new Scanner(System.in);
//         System.out.print("Enter the side of square: ");
//         a = ref.nextInt();
//         area = a*a;
//         System.out.print("Side of square is: "+ area);
//         ref.close();
//     }
// }






import java.util.Scanner;
public class Areaofsquare{
    public static void main(String []args){
        double a;
        int area;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        a = ref.nextDouble();
        area = (int)(a*a);
        System.out.print("Side of square is: "+ area);
        ref.close();
    }
}
