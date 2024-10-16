                                                        /*Create a file in file handling */



// below code is incorrect 






/*

// import java.io.File;
import java.io.*;
class Createafile
{
    public static void main(String[] args)
    {
        // so we know that for creating the file we take a class of the file in the main method

        // File f = new File(C:\Users\RISHABH\OneDrive\Documents\Desktop\Full java programs)

        // this above we have created the file object with super class File and in this paranthesis we have to take the path where we want to create the file 
        // so below is correct because in path we have to take \\ instead of \  (backslash) in path 

        // File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\");   // in this path we have to write the name of the file 
                                                                                                    // that we want to create , write with \\        like below

        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
        // so now this above we have created the object of file and reference variable object also

        // so we know that here two condition can be that that file we are creating that is already exist or that is not exist 

        if(f.createNewFile()){     // here we have used the method and with this in this file name we have not given because in path we have given 
            System.out.print("file succesfully created");
        }
        else{ // if file already exist then this will execute
            System.out.println("File is already exist");
        }                                                                                       

    }
}


*/






// so this above code is correct but in this we have to report that if further any if file not found then IOException can come , so how we will handle so 
// that's why we have to write this code ( risky code ) either with try-catch or throws 





// below code is correct 










/*


// import java.io.File;
import java.io.*;
class Createafile
{
    // so IOException is coming by this all if else  code so 

    public static void main(String[] args)
    {
        // so we know that for creating the file we take a class of the file in the main method

        // File f = new File(C:\Users\RISHABH\OneDrive\Documents\Desktop\Full java programs)

        // this above we have created the file object with super class File and in this paranthesis we have to take the path where we want to create the file 
        // so below is correct because in path we have to take \\ instead of \  (backslash) in path 

        // File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\");   // in this path we have to write the name of the file 
                                                                                                    // that we want to create , write with \\        like below

            // this File class we have created object like Scanner class that is also inside the class and taken by package of this java.io package

        

        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
        // so now this above we have created the object of file and reference variable object also

        // so we know that here two condition can be that that file we are creating that is already exist or that is not exist 


        try{
            
        if(f.createNewFile()){     // here we have used the method and with this in this file name we have not given because in path we have given 
            System.out.print("file succesfully created");
        }
        else{ // if file already exist then this will execute
            System.out.println("File is already exist");
        }   
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }                                                                                    


    }
}



*/

// so now we can write like this and now this that throw







/*



// import java.io.File;
import java.io.*;
class Createafile
{
    // so IOException is coming by this all if else  code so 

    public static void main(String[] args) throws IOException   // so in this we bypass the exception to the caller of the main that is jvm 
    {
        // so we know that for creating the file we take a class of the file in the main method

        // File f = new File(C:\Users\RISHABH\OneDrive\Documents\Desktop\Full java programs)

        // this above we have created the file object with super class File and in this paranthesis we have to take the path where we want to create the file 
        // so below is correct because in path we have to take \\ instead of \  (backslash) in path 

        // File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\");   // in this path we have to write the name of the file 
                                                                                                    // that we want to create , write with \\        like below

            // this File class we have created object like Scanner class that is also inside the class and taken by package of this java.io package

        

        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
        // so now this above we have created the object of file and reference variable object also

        // so we know that here two condition can be that that file we are creating that is already exist or that is not exist 



        if(f.createNewFile()){     // here we have used the method and with this in this file name we have not given because in path we have given 
            System.out.print("file succesfully created");
        }
        else{ // if file already exist then this will execute
            System.out.println("File is already exist");
        }   
        }
    }




*/















// this below code is incorrect because we have written to close file but here we have just created the file and not open the file 



/*


// import java.io.File;
import java.io.*;
class Createafile
{
    // so IOException is coming by this all if else  code so 

    public static void main(String[] args)
    {
        // so we know that for creating the file we take a class of the file in the main method

        // File f = new File(C:\Users\RISHABH\OneDrive\Documents\Desktop\Full java programs)

        // this above we have created the file object with super class File and in this paranthesis we have to take the path where we want to create the file 
        // so below is correct because in path we have to take \\ instead of \  (backslash) in path 

        // File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\");   // in this path we have to write the name of the file 
                                                                                                    // that we want to create , write with \\        like below

            // this File class we have created object like Scanner class that is also inside the class and taken by package of this java.io package

        

        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
        // so now this above we have created the object of file and reference variable object also

        // so we know that here two condition can be that that file we are creating that is already exist or that is not exist 


        try{
            
        if(f.createNewFile()){     // here we have used the method and with this in this file name we have not given because in path we have given 
            System.out.print("file succesfully created");
        }
        else{ // if file already exist then this will execute
            System.out.println("File is already exist");
        }   
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }     
        finally{
            f.close();     // so here we have to close the file reference variable      
        }


    }
}

*/









// this below code is correct 



/*

// import java.io.File;
import java.io.*;
class Createafile
{
    // so IOException is coming by this all if else  code so 

    public static void main(String[] args)
    {
        // so we know that for creating the file we take a class of the file in the main method

        // File f = new File(C:\Users\RISHABH\OneDrive\Documents\Desktop\Full java programs)

        // this above we have created the file object with super class File and in this paranthesis we have to take the path where we want to create the file 
        // so below is correct because in path we have to take \\ instead of \  (backslash) in path 

        // File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\");   // in this path we have to write the name of the file 
                                                                                                    // that we want to create , write with \\        like below

            // this File class we have created object like Scanner class that is also inside the class and taken by package of this java.io package

        

        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
        // so now this above we have created the object of file and reference variable object also

        // so we know that here two condition can be that that file we are creating that is already exist or that is not exist 


        try{
            
        if(f.createNewFile()){     // here we have used the method and with this in this file name we have not given because in path we have given 
            System.out.print("file succesfully created");
        }
        else{ // if file already exist then this will execute
            System.out.println("File is already exist");
        }   
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }     
    }
}

*/



