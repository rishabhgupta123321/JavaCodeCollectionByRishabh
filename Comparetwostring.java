                                  /*Compare two Strings*/


// equals always see the data object 
// == operator see the object also and data variable also 





// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "Lion" ;   // literal way of making string object Lion 
//         String b = "Lion";         // checking the object value only 
//         if(a == b){
//             System.out.print("True");
//         }
//         else{
//             System.out.print("False");
//         }
//     }
// }










// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "Lion" ;   // literal way of making string object Lion 
//         String b = "Lion";      // checking the object value only 
//         if(a == b)
//             System.out.print("True");
        
//         else
//             System.out.print("False");
        
//     }
// }
    






// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "LiON" ;   // literal way of making string object Lion 
//         String b = "Lion";       // checking the object value only 
//         if(a == b){
//             System.out.print("True");
//         }
//         else{
//             System.out.print("False");
//         }
//     }
// }






// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "Lion" ;   // literal way of making string object Lion 
//         String b = new String("Lion");                // new keyword way of making the String object  
//         if(a == b){                    // checking the referrening variable instead of object value 
//             System.out.print("True");
//         }
//         else{
//             System.out.print("False"); // false will come because referrening variable is not same
//         }
//     }
// }






// // error will come in this that is compilation error 
// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "Lion" ;   // literal way of making string object Lion 
//         String a = new String("Lion");               // new keyword way of making the String object  
//         if(a == a){        // in this, this will show the compiler error because we can not make same variable again 
//             System.out.print("True");
//         }
//         else{
//             System.out.print("False");
//         }
//     }
// }




// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "Lion" ;   // literal way of making string object Lion 
//         String b = "Tiger";         // checking the object value only 
//         if(a == b){
//             System.out.print("True");
//         }
//         else{
//             System.out.print("False");
//         }
//     }
// }







// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "Lion" ;   // literal way of making string object Lion 
//         String b = "Lion";         // checking the object value only 
//         if(a.equals(b)){
//             System.out.print("True");
//         }
//         else{
//             System.out.print("False");
//         }
//     }
// }






// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "Lion" ;   // literal way of making string object Lion 
//         String b = "LiON";         // checking the object value only 
//         if(a.equals(b)){
//             System.out.print("True");
//         }
//         else{
//             System.out.print("False");
//         }
//     }
// }




// class Comparetwostring{
//     public static void main(String []argss)
//     {
//         String a = "Lion" ;   // literal way of making string object Lion 
//         String b = new String("Lion");   // new keyword way of making the String object    
//         if(a.equals(b)){               // checking the object value only 
//             System.out.print("True");        // true
//         }
//         else{
//             System.out.print("False");
//         }
//     }
// }






class Comparetwostring{
    public static void main(String []argss)
    {
        String a = "Lion" ;   // literal way of making string object Lion 
        String b = new String("LiON");   // new keyword way of making the String object    
        if(a.equals(b)){               // checking the object value only 
            System.out.print("True");        // false
        }
        else{
            System.out.print("False");
        }
    }
}