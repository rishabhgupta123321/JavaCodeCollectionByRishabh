                                                      /*Static block*/



// class Staticblock{ 
//     static {           // static block 
//         System.out.println("learn coding");
//     }
//     public static void main(String []args){

//     }
// }


// as we know that static block don't need the object it excute first of all but
// we have to create with this main method for starting point and ending point


// if we don't take main method then this static method will also be not execute 

// this below code is incorrect 


// class Staticblock{ 
//     static {           // static block 
//         System.out.println("learn coding");
//     }
// }




class Staticblock{
    int a, b;  // instance variable 
    {          // instance block 
        System.out.println("learn coding ");
        a = 4;
        b = 2;
    }
                                    // we can not access instance vairable in static block 
                                    //  without any object reference but in instance block we can access the instance variable 
    static{          // static block
        System.out.println("Hello java");
    }
    public static void main(String []argss){
        Staticblock r = new Staticblock();
        System.out.println(r.a+" "+r.b);
    }
}
