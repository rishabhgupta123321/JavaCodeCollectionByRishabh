////////////*Area of rectangle*////////////////////////


// requirement- 
// input length 
// input breath
// formula ----->  length*breath



/**
import java.util.Scanner;
class Rectanglearea{
    public static void main(String []args){
        int l,b,area;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter value for sides - ");
        l = ref.nextInt();
        b = ref.nextInt();
        area = l*b;
        System.out.print("Area of rentangle is:- "+ area);
        ref.close();
    }
}
*/



// requirements is take input of length and breath 
// formula = length.breath.
import java.util.Scanner;
class Rectanglearea 
{
    public static void main(String []argss){
        int l,b;
        try(Scanner ref = new Scanner(System.in)){
        System.out.print("Enter length of Rectangle: ");
            l = ref.nextInt();
        System.out.print("Enter breath of Rectangle: ");
            b = ref.nextInt();
        int area = l*b;
        System.out.print("Area of Rectangle is : "+ area );
        }
    }
}




















