                           // How to write comments




                           /* java variables */







                           /** java variables are four types - 
                  1. instance variable 2. static variable 
                  3. local variable 4. final variable 
                  */
                  

                  /*
                   we can write comments in three way or comments has three
                   types - 1. single line comments     //  
                        2. multiline comments     /*  */
                        // 3. Documentation comments    /**  */
                   // */








                   
class Comments{
    int a = 2;  //instance variable
    static int b = 3;  // static variable
    
    public static void main(String[] args){
        int c = 4; // local variable
        final int D = 8; // final variable
        System.out.println(b);
        /* i can able to call b variable easily because b is static 
        but a variable is non-static variable that's why when we call 
        a then we have to create firstly object as a ref for that 
        so that in main methods we can call that variable.
    */
        Comments ref = new Comments();
        System.out.println(ref.a);
        System.out.println(c);
        System.out.println(D);
    }
}