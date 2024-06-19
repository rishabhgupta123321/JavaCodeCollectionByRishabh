                  /* Assignment operator Example..........      */



// it is a unary operator and in this we can perform operation with single operants.



// assignment operators are two types - 1. simple assignment and 2. compound assignment operator



class Assignmentoperator{
    public static void main(String[] ar){
        int a;
        a = 10;  // simple assignment operator 
          // here = is a assignment operator. if i need to put any value in jvm memory so in this firstly 
                    // i have to take any variable and then in variable i have to assign that value so this assigning the 
                    // value done by the assignment operator.
    System.out.println(a);



    // now comes compound assignment operator that made by combination of two operators.-
            // with the help of compound assignment operator we can easily can do perform direct increment and decrement operator.
        
            
        a += 10;   // compound assignment (a = a+10)
    System.out.println(a);
        
        a -= 10;    // compound assignment (a = a-10)
    System.out.println(a);
        }

}