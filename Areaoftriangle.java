                 /*Area of triangle*/
// Requirements- 
// length of the sides - a,b,c
// when we have three side in triangle then 
// we have to apply heron's formula -     ((s*(s-a)*(s-b)*(s-c))^(1/2))
// means that square-root of (s*(s-a)*(s-b)*(s-c))
// in this formula s is semiperimeter of triangle which is -  ((a+b+c)/2)  

// and other than that if we have base and height of a triangle then we can use this method 
// for finding the area of a triangle in java that is -  (b*h/2)  here b is base and h is height.


// for Math class we have this package which is import java.lang.Math;  
// and this package is a default package if we don't write this package then also this will be work. 
//  this package for import the Math method so that math formula we can use.


/*
import java.util.Scanner;   // for Scanner class this java.util package is importing.
import java.lang.Math;    // for Math class we have this package which is import java.lang.Math;  and this package is a default package if we don't write this package then also this will be work. //  this package for import the Math method so that math formula we can use.
class Areaoftriangle{ 
        public static void main(String[] args){
            int a,b,c,s;
            double area;   // semiperimeter can be  in the floating point because here we are dividing by 2.
            Scanner ref = new Scanner(System.in);
            System.out.println("Enter the side of the triangle- ");
            a = ref.nextInt();
            b = ref.nextInt();
            c = ref.nextInt();
            s = ((a+b+c)/2);   // here typecasting from int to double can be possible.
            System.out.println("Area of the te is - "+ s);
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));            // here sqrt mehtod for square-root and Math is a class here which we are import from java.lang.Math package.
            System.out.println("Area of the triangle is - "+ area);  // sqrt method is in Math class and here in this Math class .       
            ref.close();
        }
}
*/



/*
import java.util.Scanner;   // for Scanner class this java.util package is importing.
// import java.lang.Math;    // for Math class we have this package which is import java.lang.Math;  and this package is a default package if we don't write this package then also this will be work. //  this package for import the Math method so that math formula we can use.
class Areaoftriangle{ 
        public static void main(String[] args){
            int a,b,c,s;
            double area;   // semiperimeter can be  in the floating point because here we are dividing by 2.
            Scanner ref = new Scanner(System.in);
            System.out.println("Enter the side of the triangle- ");
            a = ref.nextInt();
            b = ref.nextInt();
            c = ref.nextInt();
            s = ((a+b+c)/2);   // here typecasting from int to double can be possible.
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));            // here sqrt mehtod for square-root and Math is a class here which we are import from java.lang.Math package.
            System.out.println("Area of the triangle is - "+ area);  // sqrt method is in Math class and here in this Math class .       
            ref.close();
        }
}
*/






/*
import java.util.Scanner;   // for Scanner class this java.util package is importing.
import java.lang.Math;      //  this package for import the Math method so that math formula we can use.
class Areaoftriangle{
        public static void main(String[] args){
            int a,b,c;
            double s,area;   // semiperimeter can be  in the floating point because here we are dividing by 2.
            Scanner ref = new Scanner(System.in);
            System.out.println("Enter the side of the triangle- ");
            a = ref.nextInt();
            b = ref.nextInt();
            c = ref.nextInt();
            s = ((a+b+c)/2);   // here typecasting from int to double can be possible.
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));            // here sqrt for square-root and Math is a method here which we are import from java.lang.Math package.
            System.out.println("Area of the triangle is - "+ area);         
            ref.close();
        }
}
*/






// if we have base and height then what wil be happen.

/*
import java.util.Scanner;   
class Areaoftriangle{
        public static void main(String[] args){
            int b,h;
            double area;   
            Scanner ref = new Scanner(System.in);
            System.out.println("Enter the base of the triangle- ");
            b = ref.nextInt();
            System.out.println("Enter the height of the triangle- ");
            h = ref.nextInt();
            area = ((b*h)/2);    
            System.out.println("Area of the triangle is - "+ area);         
            ref.close();
        }
}
*/

import java.util.Scanner;
public class Areaoftriangle{
    public static void main(String []rsd){
        int a,b,c;
        double area;
        int s;    // s is semiperimeter 
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter all three sides of a triangle: ");
        a = ref.nextInt();
        b = ref.nextInt();
        c = ref.nextInt();
        s = ((a+b+c)/2);
        area = Math.sqrt((s)*(s-a)*(s-b)*(s-c));       // this is the heron's formula
        System.out.println("Area of the triangle is: "+ area);
        ref.close();
    }
}