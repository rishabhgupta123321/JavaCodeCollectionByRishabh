                                                //*User defined exception*/



class InvalidageException extends Exception{
    InvalidageException(String msg){     // constructor 
        // System.out.println(msg+"super!");
        super(msg);
    }
}
class Userdefinedexception{
    public static void vote(int age) throws InvalidageException
    {
        if(age<18){
            throw new InvalidageException("this is the throw excetion new");   // unchecked exception so compulsory to make throws 
        }
        else{
            System.out.println("cool cool ");
        }
    }

    
    public static void main(String[] args){      // so now main method has exception that throws from vote method 
        try{                       //   now for handle the exception we have to use the try-catch 
        vote(16);
        }
        catch(InvalidageException e){
            System.out.println("Exception this! "+e.getMessage());
        }
    }
}