                              /*increment and decrement operator example- */





//  class incrementdecrement_operator{
//     public static void main(String[] args){
//         int a = 2;
//         System.out.println("Preincrement of a operant:- ");
//         System.out.println(++a);          // 3  // (3)
//         System.out.println("Postincrement of a operant:- ");
//         System.out.println(a++);        // 3      // (4)
//         System.out.println("Predecrement of a operant:- ");
//         System.out.println(--a);     // 3   // (3)
//         System.out.println("Postdecrement of a operant:- ");
//         System.out.println(a--);   // 3  // (2)
//     }
// }












// public class prepost{
//     public static void main(String[] args){
//         int a = 2;
//         System.out.println("Preincrement of a operant:- ");
//         System.out.println(++a);          // 3  // (3)
//         System.out.println("Postincrement of a operant:- ");
//         System.out.println(a++);        // 3      // (4)
//         System.out.println("Predecrement of a operant:- ");
//         System.out.println(--a);     // 3   // (3)
//         System.out.println("Postdecrement of a operant:- ");
//         System.out.println(a--);   // 3  // (2)
//     }
// }



class incrementdecrement_operator{
    public static void main(String[] args) {
        int a = 2;
        System.out.println("prepost-increment of a operant is - "+ (++a)); // pre-increment 
        System.out.println("prepost-increment of a operant is - "+ (a++));  // post-increment
        System.out.println("prepost-decrement of a operant is - "+ (--a));
        System.out.println("prepost-decrement of a operant is - "+ (a--));
    }
}