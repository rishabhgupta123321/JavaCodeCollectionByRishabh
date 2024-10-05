                                     /*Reverse String*/


// this below code is incorrect


/*

import java.util.Scanner;
class Reversestring{
    public static void main(String []argss){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any String or message: ");
        String a = r.nextLine();
        StringBuffer ref = new StringBuffer(a);
        String b = ref.reverse();    // here we are using StringBuffer so we have to use here also 
                                    // StringBuffer class instead of String class  
        
                                    // in this reverse method in parathesis i will not write anything because 
                                    // for reversing any string this should be empty and here this reverse method 
                                    // we call with the ref      referrence variable and so in this referrence ref 
                                    // variable i in StringBuffer class i havae to write in parenthesis the string or a variable that is 
                                    // referrening to any string 
        System.out.println(b);
        r.close();
    }
}

*/














// this below code is correct



/*

import java.util.Scanner;
class Reversestring{
    public static void main(String []argss){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter any String or message: ");
        String a = r.nextLine();
        StringBuffer ref = new StringBuffer(a);     // in this reverse method in parathesis i will not write anything because 
                                    for reversing any string this should be empty and here this reverse method 
                                    we call with the ref      referrence variable and so in this referrence ref 
                                    variable i in StringBuffer class i havae to write in parenthesis the string or a variable that is 
                                    referrening to any string 
        StringBuffer b = ref.reverse();        // here in this we have to take also StringBuffer datatype for b variable 
        System.out.println(b);
        r.close();
    }
}

*/






// import java.util.Scanner;
// class Reversestring{
//     public static void main(String []argss){
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter any String or message: ");
//         String a = r.nextLine();
//         StringBuffer ref = new StringBuffer(a);    
//         System.out.println(ref.reverse());
//         r.close();
//     }
// }







// import java.util.Scanner;
// class Reversestring{
//     public static void main(String []argss){
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter any String or message: ");
//         String a = r.nextLine();
//         StringBuilder ref = new StringBuilder(a);    
//         System.out.println(ref.reverse());
//         r.close();
//     }
// }






// import java.util.Scanner;
// class Reversestring{
//     public static void main(String []argss){
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter any String or message: ");
//         String a = r.nextLine();
//         StringBuilder ref = new StringBuilder(a);    
//         StringBuilder b = ref.reverse();        
//         System.out.println(b);
//         r.close();
//     }
// }










// class Reversestring{
//     public static void main(String []argss){
//         String a = "hello ankit";
//         StringBuilder ref = new StringBuilder(a);    
//         StringBuilder b = ref.reverse();        
//         System.out.println(b);
//     }
// }



// class Reversestring{
//     public static void main(String []argss){
//         String a = "hello ankit";
//         StringBuilder ref = new StringBuilder(a);          
//         System.out.println(ref.reverse());
//     }
// }



// class Reversestring{
//     public static void main(String []argss){
//         StringBuilder ref = new StringBuilder("hello ankit");          
//         System.out.println(ref.reverse());   // in this we have to not give 
                                                // any value in reverse method paranthesis
//     }
// }



// class Reversestring{
//     public static void main(String []argss){
//         StringBuffer ref = new StringBuffer("hello ankit");          
//         System.out.println(ref.reverse());   // in this we have to not give any value in reverse method paranthesis
//     }
// }




// import java.util.Scanner;
// class Reversestring{
//     public static void main(String []argss){
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter any String or message: ");
//         String a = r.nextLine();
//         int b = a.length();
//         for(int i = b-1;i>=0;i--){
//             System.out.print(a.charAt(i)); 
//         }
//         r.close();
//     }
// }






// import java.util.Scanner;
// class Reversestring{
//     public static void main(String []argss){
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter any String or message: ");
//         String a = r.nextLine();
//         int b = a.length();
//         for(int i = b-1;i>=0;i--){
//             char c = a.charAt(i);   // for character we have to use the char datatype 
//             System.out.print(c); 
//         }
//         r.close();
//     }
// }






// class Reversestring{
//     public static void main(String []argss){
//         String a = "aaaassss";
//         int b = a.length();    // length is equal to 0 to b-1 index value 
//         for(int i = b-1;i>=0;i--){
//             char c = a.charAt(i);   // for character we have to use the char datatype 
//             System.out.print(c); 
//         }
//     }
// }






// class Reversestring{
//     public static void main(String []argss){
//         String a = "aaaassss";
//         int b = a.length();    // length is equal to 0 to b-1 index value 
//         for(int i = b-1;i>=0;i--){
//             System.out.print(a.charAt(i)); 
//         }
//     }
// }  






// now this below code is the standard way - 



class Reversestring{
    public static void main(String[] args) {
        int l, i;
        String r = "learn codig";
        String r2 ="";
        l = r.length();
        for (i = l-1;i>=0;i--){
            r2 = r2+r.charAt(i);
        }
        System.out.print(r2);
    }
}