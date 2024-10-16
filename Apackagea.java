                                                         /*User-defined package*/





                                                    // package in this we have four access modifier

// private

// package akhilesh;
// class Apackage{
//     private void show(){
//         System.out.println("Learn coding!");
//     }
//     public static void main(String []args){
//         Apackage r = new Apackage();
//         r.show();
//     }
// }




// package akhilesh;
// class Apackage{
//     private void show(){
//         System.out.println("Learn coding!");
//     }

// class Apckagetwo{
//     public static void main(String []args){
//         Apackage r = new Apackage();
//         r.show();
//     }
// }
// }






// incorrect below

// package akhilesha;
// class Apackagea{
//     private void show(){
//         System.out.println("Learn coding!");
//     }
// }

// class Apckagetwo{
//     public static void main(String []args){
//         Apackagea r = new Apackagea();
//         r.show();
//     }
// }





// package akhilesha;
// class Apackagea{
//     void show(){      // default access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }

// class Apckagetwo{
//     public static void main(String []args){
//         Apackagea r = new Apackagea();
//         r.show();
//     }
// }




// incorrect below 

// package akhilesha;
// class Apackagea{
//     Private void show(){      // default access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }

// class Apckagetwo extends Apackagea
// {
//     public static void main(String []args){
//         Apackagea r = new Apackagea();
//         r.show();
//     }
// }






// package akhilesha;
// class Apackagea{
//     default void show(){      // default access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }

// class Apckagetwo{
//     public static void main(String []args){
//         Apackagea r = new Apackagea();
//         r.show();
//     }
// }





// incorrect 

// package akhilesha;
// class Apackagea{
//     public default void show(){      // default access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }





// protected 





// below code is correct

// package akhilesha;
// class Apackagea{
//     protected void show(){      // protected access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }

// class Apckagetwo{
//     public static void main(String []args){
//         Apackagea r = new Apackagea();
//         r.show();
//     }
// }





// below code is correct 
// and mostly in protected members we use inheritance like extends keyword



// package akhilesha;
// class Apackagea{
//     protected void show(){      // protected access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }

// class Apckagetwo extends Apackagea{
//     public static void main(String []args){
//         Apckagetwo r = new Apckagetwo();
//         r.show();
//     }
// }






// package akhilesha;
// public class Apackagea{
//     protected void show(){      // protected access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }

// class Apckagetwo extends Apackagea{
//     public static void main(String []args){
//         Apckagetwo r = new Apckagetwo();
//         r.show();
//     }
// }







// public access modifier 


// package akhilesha;
// public class Apackagea{
//     public void show(){      // protected access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }

// class Apckagetwo{
//     public static void main(String []args){
//         Apackagea r = new Apackagea();
//         r.show();
//     }
// }







// below code is incorrect 

// package akhilesha;
// class Apackagea{
//     public void show(){      // protected access modifier 
//         System.out.println("Learn coding!"); 
//     }
// }





// below code is correct

package akhilesha;
public class Apackagea{
    public void show(){      // protected access modifier 
        System.out.println("Learn coding!"); 
    }
}





