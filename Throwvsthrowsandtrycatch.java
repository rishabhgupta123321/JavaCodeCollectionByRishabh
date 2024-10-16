                                    /* Throw vs Throws & try-catch */

                                    






class Throwvsthrowsandtrycatch 
{
    public static void vote(int age) throws ArithmeticException        // so with this vote method is caller is main method so main method has now exception 
    {
        if(age<18){
            System.out.print(10/0);
        }
        else{
            System.out.println("Good to Go");
        }

    }
    public static void main(String[] args)     // so now main method should handle the exception 
    {
        try{
        vote(16);
        }
        catch(Exception e){
            System.out.println("great exception! "+ e.getMessage());
        }
    }
}