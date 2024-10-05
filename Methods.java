                                 /* java methods program */



// this is incorrect code- 




/*

class Methods{
    public static void main(String []argss){
        Disp();          // this is the wrong because in this we can not call non-static method in static method 
                            // directly 
    }
        void Disp()
        {
            System.out.print("Learn Coding");
        }
    
}

*/





// so for making this non-static method into static so that we can call in main method that is static 
// so for this we have to create a object and with the help of the object reference variable we have to call
// that method 



// this is the correct code - 


/*
class Methods{
    public static void main(String []argss)
    
    {
        Methods rreef = new Methods();    // object creation 
        rreef.Disp();           // calling method with reference object variable
    }

        void Disp()  // non-static method  
        {
            System.out.print("Learn Coding");
        }
}
*/






class Methods{
    public static void Add(){      // this is the public static method so here we don't 
                                    // need to create object
        int a = 20, b = 20;
        System.out.print(a+b);  
    } 
    public static void main(String []argss)
    {
        Methods rreef = new Methods();    // object creation 
        rreef.Disp();           // calling method with reference object variable
        Methods.Add();       // static method calling with class name 
    }

        void Disp()
        {
            System.out.println("Learn Coding");
        }
}   

  


  