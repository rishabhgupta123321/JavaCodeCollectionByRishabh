                                       /*Recursion in java*/

                            

// class Recursion{
//     public static void main(String []args)
//     {
//         Recursion r = new Recursion();
//         int c = r.sum(5);       // calling  
//         System.out.print("Sum of First N("+ "5" +") natural number: "+ c);
//     }
//     int sum(int b)    // non-static method with integer data type parameter and with integer retrun type
//     {
//         if(b>0){      // this recursion is like for loop , in for loop also we have condition 
//             return b+sum(b-1);   // calling 
//         }
//         else{
//             return 0;   
//         }
//     }

// }





// class Recursion{
//     static int b = 5;
//     public static void main(String []args)
//     {
//         Recursion r = new Recursion();
//         int c = r.sum(b);       // calling  
//         System.out.print("Sum of First N("+ "5" +") natural number: "+ c);
//     }
//     int sum(int b)    // non-static method with integer data type parameter and with integer retrun type
//     {
//         if(b>0){      // this recursion is like for loop , in for loop also we have condition 
//             return b+sum(b-1);   // calling 
//         }
//         else{
//             return 0;   
//         }
//     }

// }









// this below code is incorrect

/*

class Recursion{
    int b = 5;
    public static void main(String []args)
    {
        Recursion r = new Recursion();
        int c = r.sum(b);       // calling  
        System.out.print("Sum of First N("+ "5" +") natural number: "+ c);
    }
    int sum(int b)    // non-static method with integer data type parameter and with integer retrun type
    {
        if(b>0){      // this recursion is like for loop , in for loop also we have condition 
            return b+sum(b-1);   // calling 
        }
        else{
            return 0;   
        }
    }

}

*/







class Recursion {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        int result = r.sum(5);  // calling the sum method and storing the result
        System.out.println(result);  // printing the result
    }

    int sum(int b) {  // non-static method with integer data type parameter and integer return type
        if (b > 0) {  // recursion condition (like a for loop condition)
            return b + sum(b - 1);  // recursive call with b-1
        } else {
            return 0;  // base case to stop recursion
        }
    }
}
