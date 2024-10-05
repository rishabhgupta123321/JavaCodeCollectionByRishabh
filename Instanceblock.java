                                        /* Instance block */



//   class A{
//     int a ; int c ; String b ;

//     {            // instance block that is like method but without any name 
//     a = 4; 
//     c = 5;
//     System.out.println(a+" "+c);
//     }


//     A(){
//         a = 3; 
//         b = "lajlka";
//         System.out.println(a+" "+b);
//         }
    
    
//         void show(){
//         c = 5;
//         b = "lallklj";
//         System.out.println(c + " "+b);
//     }


//   }
//   class Instanceblock{
//     public static void main(String []args){
//     A r = new A();
//     r.show();
//   }

// }


















// class A{
//     int a ; int c ; String b ;



//     A(){
//         a = 3; 
//         b = "lajlka";
//         System.out.println(a+" "+b);
//         }
    

        
//     {            // instance block that is like method but without any name  this will exectue first of all 
//         a = 4; 
//         c = 5;
//         System.out.println(a+" "+c);
//         }


    
//         void show(){
//         c = 5;
//         b = "lallklj";
//         System.out.println(c + " "+b);
//     }

    
//   }
//   class Instanceblock{
//     public static void main(String []args){
//     A r = new A();
//     r.show();
//   }

// }










// class A{
//     int a ; int c ; String b ;



//     A(){
//         a = 3; 
//         b = "lajlka";
//         System.out.println(a+" "+b);
//         }
    

        
//     {            // instance block that is like method but without any name  this will exectue first of all 
//         a = 4; 
//         c = 5;
//         System.out.println(a+" "+c);
//         }


    
//         void show(){
//         c = 5;
//         b = "lallklj";
//         System.out.println(c + " "+b);
//     }

    
//   }
//   class Instanceblock{
//     public static void main(String []args){
//     A r = new A();              // we know that for instance variable also we need to create the object 
//     r.show();
//   }

// }












// this is incorrect code because in this we can not access static method we can access the instance variable 
// class A{
//     int a ; int c ; String b ;

//     A(){
//         a = 3; 
//         b = "lajlka";
//         System.out.println(a+" "+b);
//         }
    

        
//     {            // instance block that is like method but without any name  this will exectue first of all 
//         a = 4; 
//         c = 5;
//         System.out.println(a+" "+c);
//         }


    
//         static void show(){
//             System.out.println("learn coding");
//         }



//        void shjow(){     // non-static method 
//             System.out.println("ln coding");
//         }

    
//   }
//   class Instanceblock{
//     public static void main(String []args){
//     A.show();
//     A r = new A();              // we know that for instance variable also we need to create the object 
//     r.shjow();
//   }

// }










// in this below code instance block will not execute because we have not created any object 
// and we know that we can only access the logic of the instance block after creating the object 

// so in this we will only get the method output result    that is         learn coding 
class A{
    int a ; int c ; String b ;
        
    {            // instance block that is like method but without any name  this will exectue first of all 
        a = 4; 
        c = 5;
        System.out.println(a+" "+c);
        }

        static void show(){
            System.out.println("learn coding");
        }

    
  }
  class Instanceblock{
    public static void main(String []args){
    A.show();
    // A r = new A();              // we know that for instance variable also we need to create the object 

  }

}