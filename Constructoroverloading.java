                        /*Constructor overloading*/




/*
class A{
    int a; double b; double c ; String d;
    A(){  // default constructor 
        a = 1; b = 9.3;
    }
    A(int z, String s){  // parameterized constrtuctor 
        a = z;
        d = s;
    }
    A(int e, double q, String z){  // parameterized constrtuctor 
        a = e; b = q; d = z;
    }
    void show(){    // this is the show method , and in this void we have to write mandatory where void is the datatype of method
        System.out.println(a+" "+b+" "+d);
    }
}
class Constructoroverloading{
    public static void main(String []argss){
        A r = new A();
        System.out.println(r.a+" "+r.b);
        A ref = new A(30, "jkkkk");
        System.out.println(ref.a+" "+ref.d);
        A r1 = new A(10, 0.4, "heloo");
        r1.show();
    }
}

*/




// class B{
//     int a; double b; double c ; String d;

// /*    B(){  // default constructor 
//         a = 1; b = 9.3;
//     }    */
//     private B(){        // we know , that we can not write both default and private constructor both so this with confuse compiler 
//                             //that's why we always take one either default or private 
//         a = 1; b = 9.3;
//     }
//     B(int z, String s){  // parameterized constrtuctor 
//         a = z;
//         d = s;
//     }
//     B(int e, double q, String z){  // parameterized constrtuctor 
//         a = e; b = q; d = z;
//     }
//     void show(){    // this is the show method , and in this void we have to write mandatory where void is the datatype of method
//         System.out.println(a+" "+b+" "+d);
//     }
//     public static void main(String []argss){
//         B r = new B();
//         System.out.println(r.a+" "+r.b);
//         B ref = new B(30, "jkkkk");
//         System.out.println(ref.a+" "+ref.d);
//         B r1 = new B(10, 0.4, "heloo");
//         r1.show();
//     }
// }









// class B{
//     int a; 
//     double b; 
//     double c; 
//     String d;

//     // Commented out private constructor to allow default constructor usage.
//     /*
//     private B(){        // Private constructor (cannot be used outside the class)
//         a = 1; 
//         b = 9.3;
//     }
//     */

//     B(){  // Default constructor
//         a = 1; 
//         b = 9.3;
//     }

//     B(int z, String s){  // Parameterized constructor 
//         a = z;
//         d = s;
//     }

//     B(int e, double q, String z){  // Parameterized constructor 
//         a = e; 
//         b = q; 
//         d = z;
//     }

//     void show(){  // Method to display values
//         System.out.println(a + " " + b + " " + c);
//     }

//     public static void main(String[] args){
//         B r = new B();  // Using default constructor
//         System.out.println(r.a + " " + r.b);
        
//         B ref = new B(30, "jkkkk");  // Using parameterized constructor
//         System.out.println(ref.a + " " + ref.d);
        
//         B r1 = new B(10, 0.4, "hello");  // Using parameterized constructor
//         r1.show();
//     }
// }


















// class B{
//     int a; 
//     double b; 
//     double c; 
//     String d;

//     // Commented out private constructor to allow default constructor usage.
//     /*
//     private B(){        // Private constructor (cannot be used outside the class)
//         a = 1; 
//         b = 9.3;
//     }
//     */

//     private B(){  // Private constructor
//         a = 1; 
//         b = 9.3;
//     }

//     B(int z, String s){  // Parameterized constructor 
//         a = z;
//         d = s;
//     }

//     B(int e, double q, String z){  // Parameterized constructor 
//         a = e; 
//         b = q; 
//         d = z;
//     }

//     void show(){  // Method to display values
//         System.out.println(a + " " + b + " " + c);
//     }

//     public static void main(String[] args){
//         B r = new B();  // Using private constructor
//         System.out.println(r.a + " " + r.b);
        
//         B ref = new B(30, "jkkkk");  // Using parameterized constructor
//         System.out.println(ref.a + " " + ref.d);
        
//         B r1 = new B(10, 0.4, "hello");  // Using parameterized constructor
//         r1.show();
//     }
// }







// constructor overloading means using more than one contrustor 










// below code is incorrect 

// class B{
//     int a; 
//     double b; 
//     double c; 
//     String d;

//     // Commented out private constructor to allow default constructor usage.
//     /*
//     private B(){        // Private constructor (cannot be used outside the class)
//         a = 1; 
//         b = 9.3;
//     }
//     */

//     private B(){  // Private constructor
//         a = 1; 
//         b = 9.3;
//     }

//     B(int z, String s){  // Parameterized constructor 
//         a = z;
//         d = s;
//     }

//     B(int e, double q, String z){  // Parameterized constructor 
//         a = e; 
//         b = q; 
//         d = z;
//     }

//     void show(){  // Method to display values
//         System.out.println(a + " " + b + " " + c);
//     }

// }

// class A{
//     public static void main(String[] args){
//         B r = new B();  // Using private constructor   because we can not use the private constructor outside the class
//         System.out.println(r.a + " " + r.b);
        
//         B ref = new B(30, "jkkkk");  // Using parameterized constructor
//         System.out.println(ref.a + " " + ref.d);
        
//         B r1 = new B(10, 0.4, "hello");  // Using parameterized constructor
//         r1.show();
//     }
// }








