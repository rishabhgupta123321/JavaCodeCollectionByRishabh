                                        /*Interface variables */




// below code is incorrect because of not initialized the interface variable

/*                                      
interface Customerraj   // interface and this is the like the client // super class 
{
    // now below this will be the requirement of the client that is common and incomplete
    int amt;  // public + static + final also 
    void purchase();   // public + abstract 
}

class InterfaceSellersanju implements Customerraj{   //it is like the developer and in this it is also like the sub class
                        // and in this basically it will be clear and complete information 
                        // so here we will implement the code in the class 
                        // so here we will write the same method of above class so that's why we say we do override 
                        // it is also the necessary to do override the method ( all methds ) 
                    // and here we know that purchase method is in the costomerraj interface(class) are with the 
                    // semi-colon it means it is the abstract method 
@Override
public void purchase(){
    System.out.println("Raj need "+amt+" kg rice");    // amt is the interface variable and it is by default 
                        // public so that's why we are able to access this in another class 
                        // and with this it is static that's why for this we don't need to create the object 
                        // and with this their is not need to call that is we can see here 
                        // and with this amt is the final also it means that's amt we have to be initialized and 
                        // then it will be final we can not change this amt vale ( client requirement ) 
}
// in this class also we can create the main method and then create the object and then call but we can also make 
// the new class and do all things their 

}

class CheckInterface{
    public static void main(String [] argss){
        // InterfaceSellersanju r = new InterfaceSellersanju();  // this way also we can create the object 
                                            // and with this we know that we can also take the reference variable 
        Customerraj r = new InterfaceSellersanju();   //but not object of the interface ( as a super class (like abstract class ))

        r.purchase();     
    }
}
*/








// this is also the incorrect because we have not declare the main method in the sub class InterfaceSellersanju class , 


/*
interface Customerraj   // interface and this is the like the client // super class 
{
    // now below this will be the requirement of the client that is common and incomplete
    int amt=5;  // public + static + final also // it is compulsory to initialized the variable
    void purchase();   // public + abstract 
}

class InterfaceSellersanju implements Customerraj{   //it is like the developer and in this it is also like the sub class
                        // and in this basically it will be clear and complete information 
                        // so here we will implement the code in the class 
                        // so here we will write the same method of above class so that's why we say we do override 
                        // it is also the necessary to do override the method ( all methds ) 
                    // and here we know that purchase method is in the costomerraj interface(class) are with the 
                    // semi-colon it means it is the abstract method 
// @Override
public void purchase(){
    System.out.println("Raj need "+amt+" kg rice");    // amt is the interface variable and it is by default 
                        // public so that's why we are able to access this in another class 
                        // and with this it is static that's why for this we don't need to create the object 
                        // and with this their is not need to call that is we can see here 
                        // and with this amt is the final also it means that's amt we have to be initialized and 
                        // then it will be final we can not change this amt vale ( client requirement ) 
}
// in this class also we can create the main method and then create the object and then call but we can also make 
// the new class and do all things their 
}

class CheckInterface{
    public static void main(String []argss){
        // InterfaceSellersanju r = new InterfaceSellersanju();  // this way also we can create the object 
                                            // and with this we know that we can also take the reference variable 
        Customerraj r = new InterfaceSellersanju();   //but not object of the interface ( as a super class (like abstract class ))

        r.purchase();     
    }
}


*/







// interface Customerraj   // interface and this is the like the client // super class 
// {
//     // now below this will be the requirement of the client that is common and incomplete
//     int amt=5;  // public + static + final also // it is compulsory to initialized the variable
//     void purchase();   // public + abstract 
// }

// class InterfaceSellersanju implements Customerraj{   //it is like the developer and in this it is also like the sub class
//                         // and in this basically it will be clear and complete information 
//                         // so here we will implement the code in the class 
//                         // so here we will write the same method of above class so that's why we say we do override 
//                         // it is also the necessary to do override the method ( all methds ) 
//                     // and here we know that purchase method is in the costomerraj interface(class) are with the 
//                     // semi-colon it means it is the abstract method 
// // @Override
// public void purchase(){
//     System.out.println("Raj need "+amt+" kg rice");    // amt is the interface variable and it is by default 
//                         // public so that's why we are able to access this in another class 
//                         // and with this it is static that's why for this we don't need to create the object 
//                         // and with this their is not need to call that is we can see here 
//                         // and with this amt is the final also it means that's amt we have to be initialized and 
//                         // then it will be final we can not change this amt vale ( client requirement ) 
// }
// // in this class also we can create the main method and then create the object and then call but we can also make 
// // the new class and do all things their 

// public static void main(String []argss){
//     // InterfaceSellersanju r = new InterfaceSellersanju();  // this way also we can create the object 
//                                         // and with this we know that we can also take the reference variable 
//     Customerraj r = new InterfaceSellersanju();   //but not object of the interface ( as a super class (like abstract class ))

//     r.purchase();     
// }


// }








// so by this, this proves that by default interface variable is the public static final varible 










// interface Customerraj   
// {
   
//     int amt=5;  // public + static + final also // it is compulsory to initialized the variable
//     abstract void purchase();   // public + abstract 
// }

// class InterfaceSellersanju implements Customerraj{  
// // @Override
// public void purchase(){
//     System.out.println("Raj need "+amt+" kg rice");  
// }

// public static void main(String []argss){
    
//     Customerraj r = new InterfaceSellersanju();   

//     r.purchase();     
// }

// }








// so because of that variable is final , so we can't change this if we will try to change this then let's see error 

// incorrect code below and give error because of we can't update the final variable value


/*
interface Customerraj   
{
   
    int amt=5;  // public + static + final also // it is compulsory to initialized the variable
    abstract void purchase();   // public + abstract 
}

class InterfaceSellersanju implements Customerraj{  
// @Override
public void purchase(){
    amt = 8;  // we can't reinitialized value ( other value ) in the interface varible that is final 
    System.out.println("Raj need "+amt+" kg rice");  
}

public static void main(String []argss){
    
    Customerraj r = new InterfaceSellersanju();   

    r.purchase();     
}

}

*/









// interface Customerraj   // interface and this is the like the client // super class 
// {
    
//     int amt=5;  // public + static + final also // it is compulsory to initialized the variable
//     void purchase();   // public + abstract 
// }

// class InterfaceSellersanju implements Customerraj{   
// public void purchase(){
//     System.out.println("Raj need "+amt+" kg rice");   
// }

// }

// class CheckInterface{        // so here we have to  understand that the main method is declare in the check class so then we know that program also 
//                 // start and end the program form main method so that's why we have saved the file name as the Check file and with this code also we 
//                 // have to execute with the name of the Check class  
//     public static void main(String []argss){
        
//         Customerraj r = new InterfaceSellersanju();   //but not object of the interface ( as a super class (like abstract class ))

//         r.purchase();     
//     }
// }













// interface Customerraj   // interface and this is the like the client // super class 
// {
    
//     int amt=5;  // public + static + final also // it is compulsory to initialized the variable
//     void purchase();   // public + abstract 
// }

// class InterfaceSellersanju implements Customerraj{   
// public void purchase(){
//     System.out.println("Raj need "+amt+" kg rice");   
//     System.out.println(Customerraj.amt);
// }

// }

// class CheckInterface{        // so here we have to  understand that the main method is declare in the check class so then we know that program also 
//                 // start and end the program form main method so that's why we have saved the file name as the Check file and with this code also we 
//                 // have to execute with the name of the Check class  
//     public static void main(String []argss){
        
//         Customerraj r = new InterfaceSellersanju();   //but not object of the interface ( as a super class (like abstract class ))

//         r.purchase();     
//     }
// }








// interface Customerraj   // interface and this is the like the client // super class 
// {
    
//     int amt=5;  // public + static + final also // it is compulsory to initialized the variable
//     void purchase();   // public + abstract 
// }

// class InterfaceSellersanju implements Customerraj{   
// @Override                // this override is the like the comment in this 
// public void purchase(){
//     // amt = 5    final variable 
//     System.out.println("Raj need "+amt+" kg rice");   
// }

// }
// class CheckInterface{        // so here we have to  understand that the main method is declare in the check class so then we know that program also 
//                 // start and end the program form main method so that's why we have saved the file name as the Check file and with this code also we 
//                 // have to execute with the name of the Check class  
//     public static void main(String []argss){
        
//         Customerraj r = new InterfaceSellersanju();   //but not object of the interface ( as a super class (like abstract class ))
//         System.out.println(Customerraj.amt); // static variable 
//         r.purchase();     
//     }
// }












interface Customerraj   // interface and this is the like the client // super class 
{
    
    int amt=5;  // public + static + final also // it is compulsory to initialized the variable
    public abstract void purchase();   // public + abstract 
}

class InterfaceSellersanju implements Customerraj{   
@Override                // this override is the like the comment in this 
public void purchase(){
    // amt = 5    final variable 
    System.out.println("Raj need "+amt+" kg rice");   
}

}

class CheckInterface{        // so here we have to  understand that the main method is declare in the check class so then we know that program also 
                // start and end the program form main method so that's why we have saved the file name as the Check file and with this code also we 
                // have to execute with the name of the Check class  
    public static void main(String []argss){
        
        Customerraj r = new InterfaceSellersanju();   //but not object of the interface ( as a super class (like abstract class ))
        System.out.println(Customerraj.amt); // static variable 
        r.purchase();     
    }
}








// we know that static variable that is also the interface variable, so it means that we can call that variable from the class also 
// and in this we have not need to create the object for this 


// in the interface also like similiar to the abstract class, where we can make only reference from the interface class but we can not 
// make the object from the interface class 



// method is also the public so that's why we are able to access that method from other class and abstract also, because it is the incomplete information
// and with this if method will not be abstract and then we apply the semi-colon instead of {} then we will get the error

