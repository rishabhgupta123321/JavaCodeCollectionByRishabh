                                 /*throw and throws program*/





/*

class Throwandthrows{
    void hey(int a, int b)
    {      // non-static method            // non-static method 
        if(b==0){
        //  new InehyArithmeticException();  //so here new for creating the exception object with paranthesis // user defined exception 
        // here above we have only created the exception user defined but we also know that whenever we creat the exception 
        // that is usually explicitly and this exception ( user defined ) in jvm their is no any pre-defined , so we have to give 
        // this exception to the jvm so that jvm will execute this explicitly created exception // so that's why we will use the throw keyword
        throw new InehyArithmeticException();
    }
    else{
        int c = a/b;
        System.out.println(c);
    }
    }
    public static void main(String []args){
        Throwandthrows r = new Throwandthrows();
        r.hey(8,2);
    }   
}


*/        







// in above code we have created the user defined exception but in that also we can't take any other except that 
// that is declare in the compiler with jvm 

// so in this user defined exception also    we can't take          InheyArithmeticException()     , so in this 
// also we have to take any saved compiler exception but that can be different that will not same according to the 
// statement like above if statement        if we write Exception e then this will not be identify what exception in this 
// so in this we can take exception different also but saved exception so if in this their is ArithmeticException , so we can 
// take in this NullPointerException by creating the exception that can be like this 

// so in this above just we have created the user-defined exception explicity and send or throw to the jvm 







// so below code is correct 



/*

class Throwandthrows{
    void hey(int a, int b)
    {      // non-static method            // non-static method 
        if(b==0){
        //  new InehyArithmeticException();  //so here new for creating the exception object with paranthesis // user defined exception 
        // here above we have only created the exception user defined but we also know that whenever we creat the exception 
        // that is usually explicitly and this exception ( user defined ) in jvm their is no any pre-defined , so we have to give 
        // this exception to the jvm so that jvm will execute this explicitly created exception // so that's why we will use the throw keyword
        throw new ArithmeticException();
    }
    else{
        int c = a/b;
        System.out.println(c);
    }
    }
    public static void main(String []args){
        Throwandthrows r = new Throwandthrows();
        r.hey(8,2);
    }   
}


*/





/*

class Throwandthrows{
    void hey(int a, int b)
    {      // non-static method            // non-static method 
        if(b==0){
        //  new InehyArithmeticException();  //so here new for creating the exception object with paranthesis // user defined exception 
        // here above we have only created the exception user defined but we also know that whenever we creat the exception 
        // that is usually explicitly and this exception ( user defined ) in jvm their is no any pre-defined , so we have to give 
        // this exception to the jvm so that jvm will execute this explicitly created exception // so that's why we will use the throw keyword
        throw new ArithmeticException();
    }
    else{
        int c = a/b;
        System.out.println(c);
    }
    }
    public static void main(String []args){
        Throwandthrows r = new Throwandthrows();
        r.hey(8,0);
    }   
}


*/







/*

class Throwandthrows{
    void hey(int a, int b)
    {      // non-static method            // non-static method 
        if(b==0){
        //  new InehyArithmeticException();  //so here new for creating the exception object with paranthesis // user defined exception 
        // here above we have only created the exception user defined but we also know that whenever we creat the exception 
        // that is usually explicitly and this exception ( user defined ) in jvm their is no any pre-defined , so we have to give 
        // this exception to the jvm so that jvm will execute this explicitly created exception // so that's why we will use the throw keyword
        throw new NullPointerException();
    }
    else{
        int c = a/b;
        System.out.println(c);
    }
    }
    public static void main(String []args){
        Throwandthrows r = new Throwandthrows();
        r.hey(8,0);
    }   
}

*/






// now after using throw for creating the user-defind exception and now after throw to the jvm that exception 
// now if user want to that this will not handle that exception so user want that this handle by it's caller 
// so according to the exception in the main method that exception caller ( owner ) is the main method , this main method should 
// call that exception, so in that case user don't handle that exception so in this we use throws   for bypass the exception to the 
// caller like below and so for that we write throws with exception name  ,   in the method signature 


// void main();      so here this we call this statement as a method signature , 




// so in this below in hey method exception occur so this exception caller is the hey method so we will throws hey method like below 


/*

class Throwandthrows{
    void hey(int a, int b) throws ArithmeticException
    {      // non-static method            // non-static method 
        if(b==0){
        //  new InehyArithmeticException();  //so here new for creating the exception object with paranthesis // user defined exception 
        // here above we have only created the exception user defined but we also know that whenever we creat the exception 
        // that is usually explicitly and this exception ( user defined ) in jvm their is no any pre-defined , so we have to give 
        // this exception to the jvm so that jvm will execute this explicitly created exception // so that's why we will use the throw keyword
        throw new NullPointerException();
    }
    else{
        int c = a/b;
        System.out.println(c);
    }
    }
    public static void main(String []args) 
    {
        Throwandthrows r = new Throwandthrows();
        r.hey(8,0);
    }   
}


*/


// so in this when this bypass the exception by user to the caller hey method , so hey method should handle that exception by creating the 
// try-catach block but if that don't create so that will bypass that exception to the method caller that is main method 

// so after that main method should handle that exception and for handle that exception main method should create the try-catch block 







/*
class Throwandthrows{
    void hey(int a, int b) throws ArithmeticException
    {      // non-static method            // non-static method 
        if(b==0){
        throw new NullPointerException();
    }
    else{
        int c = a/b;
        System.out.println(c);
    }
    }
    public static void main(String []args) throws ArithmeticException
    {
        Throwandthrows r = new Throwandthrows();
        r.hey(8,0);
    }   
}

*/





// below code is incorrect 


/*

class Throwandthrows{
    void hey(int a, int b) 
    {      // non-static method            // non-static method 
       try{

        if(b==0){
        throw new InterruptedException("Division by zero is not allowed.");   // this is the checked exception 
        }
        else{
            int c = a/b;
            System.out.println(c);
        }

    }
        catch(InterruptedException e){
            System.out.println("Interrupted exception: "+e.getMessage());
        }
    }
    public static void main(String []args) 
    {
        Throwandthrows r = new Throwandthrows();
        r.hey(8,2);
    }   
}

*/





// so basically this above exception is the checked exception so after throw we must used the throws for handle the exception that
// user doesn't handle so but in the unchecked exception it is not mandatory to make or do the throws also 

// whenever we used throws anywhere so we want to that method or anyone that that person handle that exception like main method 
// so for that handle the exception we have to create the try-catch block




/*

class Throwandthrows{
    void hey(int a, int b) 
    {      // non-static method            // non-static method 
       try{

        if(b==0){
        throw new InterruptedException("Division by zero is not allowed.");   // this is the checked exception 
        }
        else{
            int c = a/b;
            System.out.println(c);
        }

    }
        catch(InterruptedException e){
            System.out.println("Interrupted exception: "+e.getMessage());
        }
    }
    public static void main(String []args) 
    {
        Throwandthrows r = new Throwandthrows();
        r.hey(8,2);
    }   
}

*/


// userdefined exception is the custom exception that is the checked exception also so , in this we must create throws also 



// so mostly when we don't have checked exception then we don't use throws and when we don't use throws then their is not necessary 
// to use try-catch mostly




/*

class Throwandthrows{
    void hey(int a, int b) 
    {      // non-static method            // non-static method 

        if(b==0){
        throw new ArithmeticException("Division by zero is not allowed.");   // this is the unchecked exception 
        }
        else{
            int c = a/b;
            System.out.println(c);
        }

    }

    public static void main(String []args) 
    {
        Throwandthrows r = new Throwandthrows();
        r.hey(8,2);
    }   
}


*/





/*

class Throwandthrows{
    void hey(int a, int b) 
    {      // non-static method            // non-static method 

        if(b==0){
        throw new ArithmeticException("Division by zero is not allowed.");   // this is the unchecked exception 
        }
        else{
            int c = a/b;
            System.out.println(c);
        }

    }

    public static void main(String []args) 
    {
        Throwandthrows r = new Throwandthrows();
        r.hey(8,0);
    }   
}

*/

// so in this we can see that above exception is the pre-defined but in this without try-catch we are using this by      new  keyword 
// and after in this throw keyword we are using for thrown the exception to the jvm 





// class Throwandthrows{
//     void hey(int a, int b) 
//     {      // non-static method            // non-static method 

//         if(b==0){
//         new ArithmeticException("Division by zero is not allowed.");   // this is the checked exception 
//         }
//         else{
//             int c = a/b;
//             System.out.println(c);
//         }

//     }

//     public static void main(String []args) 
//     {
//         Throwandthrows r = new Throwandthrows();
//         r.hey(8,0);
//     }   
// }






// class Throwandthrows{
//     void hey(int a, int b) 
//     {      // non-static method            // non-static method 

//         if(b==1){
//         new ArithmeticException("Division by zero is not allowed.");   // this is the checked exception 
//         }
//         else{
//             int c = a/b;
//             System.out.println(c);
//         }

//     }

//     public static void main(String []args) 
//     {
//         Throwandthrows r = new Throwandthrows();
//         r.hey(8,0);
//     }   
// }



// so in this exception will come that is / by zero exception and this exception handled by the compiler not by the user  and not
// created the try-catch block then also 







// class Throwandthrows{
//     void hey(int a, int b) 
//     {      // non-static method            // non-static method 

//         if(b==1){
//         new ArithmeticException("Division by zero is not allowed.");   // this is the checked exception 
//         }
//         else{
//             int c = a/b;
//             System.out.println(c);
//         }

//     }

//     public static void main(String []args) 
//     {
//         Throwandthrows r = new Throwandthrows();
//         r.hey(8,0);
        
//         System.out.println("great");
//     }   
// }



// so in this above program after showing the exception by the compiler because in this we didn't used the try-catch block , so in this 
// here program will be terminate after this 








// class Throwandthrows{
//     void hey(int a, int b) 
//     {      // non-static method            // non-static method 

//         try{
//             if(b==1){
//         new ArithmeticException("Division by zero is not allowed.");   // this is the checked exception 
//         }
//         else{
//             int c = a/b;
//             System.out.println(c);
//         }
//     }
//     catch(ArithmeticException e){
//         System.out.println("EXceptiontha i si ssnodskk : "+e.getMessage());
//     }

//     }

//     public static void main(String []args) 
//     {
//         Throwandthrows r = new Throwandthrows();
//         r.hey(8,0);
        
//         System.out.println("great");
//     }   
// }










/*
class Throwandthrows{
    void hey(int a, int b) 
    {      // non-static method            // non-static method 

        try{
            if(b==1){
        new ArithmeticException("Division by zero is not allowed.");   // this is the checked exception 
        }
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
    catch(ArithmeticException e){
        System.out.println("EXceptiontha i si ssnodskk : "+e.getMessage());
    }

    }

    public static void main(String []args) 
    {
        Throwandthrows r = new Throwandthrows();
        r.hey(8,1);
        
        System.out.println("great");
    }   
}

*/





// this above code is correct but in this we will get output only             great         because in this according to the 1 
// division     in if block will execute and there any exception is not there only message is like exception created , so this will exception 
// should come but in that new it means created exception we didn't used the     throw      for throwing this exception or message  
// because this we have created , this is in not jvm according to situation because in this we have not tell that here 10/0 or something other 
// is happening then also we are creating the exception that is pre-defined but that is not according to the situation it means 
// we have created so            this exception , jvm don't have yet ,      so we have to thorw that exception by using the throw 

// below throw used so output will be              EXceptiontha i si ssnodskk : Division by zero is not allowed.     and   great      will come 


// so in this below according to above output will come becuase after throw also then this will go the jvm and this is also the exception 
// so when exception comes then this will go the catch block so catch block will execute but in this after exception message , e.getMessage()
// will call to the e and then e with go to the Arithmetic Exception and then that Arithmetic exception will come to again if block and then print the 
// left message that is in paranthesis 







/*

class Throwandthrows{
    void hey(int a, int b) 
    {      // non-static method            // non-static method 

        try{
            if(b==1){
        throw new ArithmeticException("Division by zero is not allowed.");   // this is the checked exception 
        // so now we have thrown this above exception to the jvm by using the throw keyword
        }
        else{
            int c = a/b;
            System.out.println(c);
        }
    }
    catch(ArithmeticException e){
        System.out.println("EXceptiontha i si ssnodskk : "+e.getMessage());
    }

    }

    public static void main(String []args) 
    {
        Throwandthrows r = new Throwandthrows();
        r.hey(8,1);
        
        System.out.println("great");
    }   
}

*/














// these above all was from pre-defined exception , now comes to the user-defined exception 

// so in this one thing that user defined exception is the custom exception that is the checked exception , so in this with throw 
// we have to must create the throws also for bypass the handling the exception to the caller ( owner )






// and in this user-defined exceptin we create this in the sub class of Exception , so firstly we extends ( inherit ) the Exception super 
// class and then make the user-defined exception




// so when checked exception then java force to create try-catch if has not created then . otherwise or create the method signature that is 
// throws  
// and when we have checked exception then we know that we have to create the throws and then we have to create the try-catch  ultimately 
// for handle the exception 



   


// so below is the userdefined exception 
// becuase exception is also like a class 

































/*


// class DivisionByZeroException extends Exception  // this is sub class of the Exception class 
// {
//     // so whenever we create the user-defined exception like this , so compulsory we have to create the constructor so 

//     public DivisionByZeroException(String Message)       // constructor 
//     {
//         super(Messgae);
//     }

// }



class Throwandthrows
{
    
    void hi(int a, int b)
    {
        if(b==0){
        int c = a/b;
        System.out.println(c);
    }
    else{

        System.out.println("All is Well");
    }
}


    public static void main(String[] args){
        Throwandthrows r = new Throwandthrows();
        System.out.println("HI user-defined exception is going here! ");
        r.hi(6,1);
        System.out.println("HI user-defined exception is going here! ");
    }
}



*/












// this below code is incorrect


/*
class DivisionByZeroException extends Exception  // this is sub class of the Exception class 
{
    // so whenever we create the user-defined exception like this , so compulsory we have to create the constructor so 
public DivisionByZeroException(String message)       // constructor 
    {
        super(message);          // by this we are calling the constructor of super class
    }

}
class Throwandthrows
{
    void hi(int a, int b) throws DivisionByZeroException{
        try{
        if(b==0){
        throw new DivisionByZeroException("In this we used user-defined Exception"); // user-definedException(custom Exception)
            // checked exception
    }
    else{
        int c = a/b;
        System.out.println(c);
    }
    }
    catch(DivisionByZeroException e){
        System.out.println("Exception isthis is here: "+e.getMessage());
    }
}
    public static void main(String[] args){
        Throwandthrows r = new Throwandthrows();
        System.out.println("HI user-defined exception is going here! ");
        r.hi(6,1);
        System.out.println("HI user-defined exception is going here! ");
    }
}

*/











// class DivisionByZeroException extends Exception  // this is sub class of the Exception class 
// {
//     // so whenever we create the user-defined exception like this , so compulsory we have to create the constructor so 
// public DivisionByZeroException(String message)       // constructor 
//     {
//         super(message);          // by this we are calling the constructor of super class
//     }

// }
// class Throwandthrows
// {
//     void hi(int a, int b) throws DivisionByZeroException{   // so here hi method caller is main method that will handle the exception 
//                                             // so there we will make the try-catch 
//         if(b==0){
//         throw new DivisionByZeroException("In this we used user-defined Exception"); // user-definedException(custom Exception)
//             // checked exception   // this throw we are using explicitly exception 
//     }
//     else{
//         int c = a/b;
//         System.out.println(c);
//     }
// }
//     public static void main(String[] args){    // here main method is handle the exception because this is the caller of hi method 
//         Throwandthrows r = new Throwandthrows();
//         System.out.println("HI user-defined exception is going here! ");
//         try
//         {
//         r.hi(6,1);
//         }
//         catch(DivisionByZeroException e){
//         System.out.println("Exception isthis is here: "+e.getMessage());
//         }
        
//         System.out.println("HI user-defined exception is going here! ");
//     }
// }










// class DivisionByZeroException extends Exception  // this is sub class of the Exception class 
// {
//     // so whenever we create the user-defined exception like this , so compulsory we have to create the constructor so 
// public DivisionByZeroException(String message)       // constructor 
//     {
//         super(message);          // by this we are calling the constructor of super class
//     }

// }
// class Throwandthrows
// {
//     void hi(int a, int b) throws DivisionByZeroException{   // so here hi method caller is main method that will handle the exception 
//                                             // so there we will make the try-catch 
//         if(b==0){
//         throw new DivisionByZeroException("In this we used user-defined Exception"); // user-definedException(custom Exception)
//             // checked exception   // this throw we are using explicitly exception 
//     }
//     else{
//         int c = a/b;
//         System.out.println(c);
//     }
// }
//     public static void main(String[] args){    // here main method is handle the exception because this is the caller of hi method 
//         Throwandthrows r = new Throwandthrows();
//         System.out.println("HI user-defined exception is going here! ");
//         try
//         {
//         r.hi(6,0);
//         }
//         catch(DivisionByZeroException e){
//         System.out.println("Exception isthis is here: "+e.getMessage());
//         }
        
//         System.out.println("HI user-defined exception is going here! ");
//     }
// }






// this below code also the userdefined exception code





class DivisionByZeroException extends Exception  // this is sub class of the Exception class 
{
    // so whenever we create the user-defined exception like this , so compulsory we have to create the constructor so 
public DivisionByZeroException(String message)       // constructor 
    {
        super(message);          // by this we are calling the constructor of super class
    }

}
class Throwandthrows
{
    void hi(int a, int b) throws DivisionByZeroException{   // so here hi method caller is main method that will handle the exception 
                                            // so there we will make the try-catch 
        if(b==0){
        throw new DivisionByZeroException("In this we used user-defined Exception"); // user-definedException(custom Exception)
            // checked exception   // this throw we are using explicitly exception 
    }
    else{
        int c = a/b;
        System.out.println(c);
    }
}
    public static void main(String[] args){    // here main method is handle the exception because this is the caller of hi method 
        Throwandthrows r = new Throwandthrows();
        System.out.println("HI user-defined exception is going here! ");
        try
        {
        r.hi(6,0);
        }
        catch(DivisionByZeroException e){
        System.out.println("Exception isthis is here: ");
        }
        
        System.out.println("HI user-defined exception is going here! ");
    }
}