// void fun(){
//         int c = 2; // local variable because this is also inside the method 
//     }







    // void make(int b){ // local variable 
    //     int j; // local variable
    //     /* so here in this make method we have two local variable b and j and
    //     they have scope b and j only in this method in make method till.      
        
    //     */
    // }









// public static void main(String[] args){
//         int a = 3; // local variable
//     }
// }










// class Variables{
//     int a = 4; // instance variable
//     public static void main(String[] args){
//         Variables ref = new Variables();
//         System.out.print(ref.a);
//     }
// }












// class Variables{
//     static int b = 3; // static variable
//     int a = 4; // instance variable
//     public static void main(String[] args){
//         int c = 9;  //local 
//         Variables ref = new Variables();
//         System.out.println(ref.a);
//         System.out.println(b);
//         System.out.print(c);
//     }
// }










/*  local and instance variable can make different - different type copy it means that if in any method any variable has changed the value so when 
this will go to the outside of the method then this will but if i talk about 
     static variable this variable can make only one memory copy*/




// class Variables{
//     static int a = 4;    // static variable
//     void make(){
//         int b = 4;        // local variable
//         System.out.println(a+" "+b);
//         ++a; ++b;
//     }
//     public static void main(String[] args) {
//         Variables t = new Variables();
//         t.make();
//         t.make();
//     }
// }










/*
class Variables{
    static int a = 6;    // static variable
    int b = 6;         // instance variable
    void make(){
        Variables x = new Variables();
        System.out.println(a+" "+x.b);
        ++a; ++x.b;
    }
    public static void main(String[] args) {
        Variables t = new Variables();
        t.make();
        t.make();
    }
}
*/








/*
public class Variables{
    static int b = 10;  // static variable
    int c = 20;  // instance variable 
    public static void main(String[] args) {
        int a = 10; // local variable
        Variables sd = new Variables();
        System.out.println(sd.c);
        System.out.println(Variables.b);
        System.out.print(a);
    }
}
*/





public class Variables{
    static int a = 10;   // static variable
    void fun(){
        int b = 10;    // local variable 
        System.out.println(a+" "+b);    // 10  10  
        ++a; ++b;          // 11 11 after again 11 10
    }
    public static void main(String[] args) {
        Variables adss = new Variables();
        adss.fun();
        adss.fun();
    }
}