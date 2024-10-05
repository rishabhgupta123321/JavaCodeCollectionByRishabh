/** 

class Lecture_7_P_s_v_m{
    public static void main(String []args){
        System.out.print("Hello World!");
    }
}   

*/



// class Lecture_7_P_s_v_m{
//     static void main(String []args){       // this will give error because of public keyword is not present here.
//         System.out.print("Hello World!");
//     }
// }





// class Lecture_7_P_s_v_m{
//     public void main(String []args){            // this will give the error because of static keyword is not present here.
//         System.out.print("Hello World!");
//     }
// } 






/** 
class Lecture_7_P_s_v_m{
    void show(){
        System.out.println("show method is this");
    }
    public static void main(String []args){
        show();                       // so we are calling show() method in main method 
                            // becuase beginning of the program is from main method. 
        System.out.print("Hello World!");     
    }
}  
*/
  



// so here the above code this will give the error because we know that show() method is non-static and we can not call this in class or member of class without 
// taking any reference and without creating any object . in this we can not take reference from a static main method as a context in this we have to create any object for calling this in main method 
// by taking any reference variable name.

// for this we have to make object for show method and for this we have to make a reference of class.




/** 
class Lecture_7_P_s_v_m{
    void show(){  // this show method is a non-static method.
        System.out.println("show method is this");
    }
    public static void main(String []args){
        Lecture_7_P_s_v_m ref = new Lecture_7_P_s_v_m();    // here new keyword is for creating the object.     
        ref.show();    // and here we are taking the reference as a ref variable name for creating the object.                                    
        System.out.print("Hello World!");     
    }
}  
    */



/**
    class Lecture_7_P_s_v_m{
        static void show(){  // this show method is a non-static method.
            System.out.println("show method is this");
        }
        public static void main(String []args){
            show();    // and here we are taking the reference as a ref variable name for creating the object.                                    
            System.out.print("Hello World!");     
        }
    }  
        */


/**
        class Lecture_7_P_s_v_m{
            static void show(){  // this show method is a non-static method.
                System.out.println("show method is this");
            }
            public static void main(String []args){
                Lecture_7_P_s_v_m.show();    // and here we are taking the reference as a ref variable name for creating the object.                                    
                System.out.print("Hello World!");      // this is the standard method of calling any static method with taking reference of class name.
            }
        }  
            
        */



        


/* 
class Lecture_7_P_s_v_m{
    public static void main(String[] args) {
        System.out.print(args[0]);
    }
}

*/



class Lecture_7_P_s_v_m{
    public static void main(String[] i) {  // array variable argument name we can give me anything. 
        System.out.print(i[1]);    
    }
}