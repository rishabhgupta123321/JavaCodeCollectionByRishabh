            /* Ternary  operator example-    */


// this operator we use for checking any condititon , and this operator second name is conditional operator.









// this below is to find maximum number or greater number in comparision to two numbers.


/* 
class Ternaryoperator{
    public static void main(String[] args){
    int a = 2, b = 3,Max;
    Max = (a>b) ? a : b;   // in this that before ? is a condition that condition if will satisfy then this will give
                            // a otherwise this when will false then this will give us b which is 3.
    System.out.println(Max);
    }
}

*/








/*     NOW ONE QUESTION COME THAT WHEN WE HAVE if/else OPERATOR THEN WHY WE USE TERNARY OPERATOR THEN 
 *      HERE WE HAVE TO KNOW THAT THIS HAS TWO REASON - 
 *      1. IT HAS ONE LINE (LINE OF CODE IN ONLY ONE LINE) IN COMPARISION TO if/else
 *      2. And in this for understanding ternary  operator we have to apply more thinking and logic.
 * 
 * 
 * 
 * 
 */






 // for finding maximum number in between three numbers by usin ternary operator    -

 
 /* 
   class Ternaryoperator{
    public static void main(String[] args){     // here this is like nested if/else code.
    int a = 2, b = 3, c = 4,Max;
    Max = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c);   
    System.out.println(Max);
    }
}
*/




// like that in above code also we can see that if we will go to write maximum number in between three number 
// according to if/else statement then we have to write 10 to 20 line of code and in this we can write in only one line
// this is the benefit of this ternary operator.





 
// class Ternaryoperator{
//     public static void main(String[] args){     // here this is like nested if/else code.
//     int a = 2, b = 2, c = 2,Max;
//     Max = ((a>b) ? ((a>c)?a:c) : ((b>c)?b:c)); 
//     System.out.println(Max);
//     }
// }


/**
 * Ternaryoperator
 */
public class Ternaryoperator {
    public static void main(String[] args) {
        int a = 4, b = 2, c = 5;
        int Max,Maxt;
        Max = ((a>b)?a:b);
        Maxt = ((a>b)?((a>c)?a:c):((b>c)?b:c));
        System.out.println(Max +" "+Maxt);
    }   
}