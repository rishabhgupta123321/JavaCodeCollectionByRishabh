                                    /*String in java*/

/*

class Stringinjava{
    public static void main(String []argdss){
        String a = "ankit";      // String literal
        System.out.println(a);                                     // String literal and new keyword
        String b = "ankit";       // String literal
        System.out.println(b);
        
        a.concat("kumar");
        System.out.println(a);
    
    
    }
}

*/








// class Stringinjava{
//     public static void main(String []argdss){
//         String a = "ankit";      // String literal     
//         System.out.println(a);                  // ankit            // String literal and new keyword
//         String b = "ankit";       // String literal
//         System.out.println(b);      // ankit
        
//         a.concat("kumar");
//         System.out.println(a);    // ankit
//     }
// }







// class Stringinjava{
//     public static void main(String []argdss){
//         String a = "ankit";      // String literal     
//         System.out.println(a);                  // ankit            // String literal and new keyword
//         String b = "ankit";       // String literal
//         System.out.println(b);      // ankit
        
//         a = a.concat(" kumar");
//         System.out.println(a);    // ankit
//     }
// }

 // so now according to above code this memory of a object ankit has destroyed and came to the ankit kumar 




 // this new keyword object store in the heap memory of jvm 
//  class Stringinjava{
//     public static void main(String []argdss){
//         String a = new String("ankit");          //  new keyword
//         System.out.println(a);
//         String b = new String("ankit");          //  new keyword
//         System.out.println(b);
//         a.concat(" kumar");
//         System.out.println(a);
//     }
// }







 class Stringinjava{
    public static void main(String []argdss){
        String a = new String("ankit");          //  new keyword
        System.out.println(a);
        String b = new String("ankit");          //  new keyword
        System.out.println(b);
        a = a.concat(" kumar");    // By assigning this in again a then before a memory will be destroyed 
        System.out.println(a);
        a = "kumar";       // String literal // we have assign the kumar object in a so before all memory of a will be destroyed
        System.out.println(a);
    }
}