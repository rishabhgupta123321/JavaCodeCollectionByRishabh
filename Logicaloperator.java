/* Logical operator Example */


/*





public class Logicaloperator {
    public static void main(String[] args) {
        // This works like binary in logical operations, similar to 0 and 1.
        System.out.println("Logical And: ");
        System.out.println((5 > 3) && (8 > 4)); // All conditions are true, so the result will be true.
        System.out.println((5 < 3) && (8 > 4)); // One condition is false and the other is true, so the result will be false.
        System.out.println((5 < 3) && (8 < 4)); // All conditions are false, so the result will be false.
        System.out.println((5 > 3) && (8 < 4)); // One condition is true and the other is false, so the result will be false.
        // These are the expressions of our logical AND operator.
    }
}  


*/





// logical operator we can do operation with value and variables.


/* Logical operator Example */

public class Logicaloperator {
    public static void main(String[] args) {
        // This works like binary in logical operations, similar to 0 and 1.
        int a = 5,b=3,c=8,d=4;
        
        System.out.println("Logical And: ");
        System.out.println((a > b) && (c > d)); // All conditions are true, so the result will be true.
        System.out.println((a < b) && (c > d)); // One condition is false and the other is true, so the result will be false.
        System.out.println((a < b) && (c < d)); // All conditions are false, so the result will be false.
        System.out.println((a > b) && (c < d)); // One condition is true and the other is false, so the result will be false.
        // These are the expressions of our logical AND operator.
   
        
        System.out.println("Logical OR: ");
        System.out.println((a > b) || (c > d)); // All conditions are true, so the result will be true.
        System.out.println((a < b) || (c > d)); // One condition is false and the other is true, so the result will be true.
        System.out.println((a < b) || (c < d)); // All conditions are false, so the result will be false.
        System.out.println((a > b) || (c < d)); // One condition is true and the other is false, so the result will be true.


        System.out.println("Logical NOT: ");
        // logical operator is a unary operator but it works with conditions.
        System.out.println(!(a > b)); // condition true then result according to not operator is false.
        System.out.println(!(a < b)); // condition false then result according to not operator is true.
        System.out.println(!(3 < 5));// false
        System.out.println(!(4 < 2));// true
   
    }

}  
