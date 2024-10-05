/* Bitwise operator  */
// this follow the binary concept .


// class Bitwiseoperator{
//     public static void main(String[] args){
//         int a = 4,b = 5;
//         System.out.println("And "+ (a & b));
//         System.out.println("OR "+ (a | b));
//         System.out.println("XOR "+ (a ^ b));
//         System.out.println("Complement "+ (~a));
//     }
// }       




class Bitwiseoperator
{
    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println(a&b);    // and means multiplication 
        System.out.println(a|b);    // or means addition
        System.out.println(a^b); 
        System.out.println(~b);
    }
}             // 2 = 010 , 5 = 101     (binary value)