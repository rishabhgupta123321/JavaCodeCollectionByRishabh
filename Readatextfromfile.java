                                                  /* Java Program to read a text from file */
                                                                    





// this exception is the warning by the compiler that in further if file not found then IOException or FileNotFoundExceptin can come and with this here in this 

// IOException means that input(read)output(write)exception

// in this above when we used this in file try-catch so with this i have to also take finally because then i can take and i know that  after creating the file 
// i have to close that file , and we know that closing code that we want that 100% execute that we can also write in the finally block so below 

// and in this whenever we are doing inside in the file something, then we have to close the file also after the opertion so that we will able to release the 
// resources and use that and able to see the inside the file text or something 









// so for read the file , we can use the         FileReader() or BufferedReader()  method 







// this below code is incorrect because readLine() method exist in the BufferedReader class not in the FileReader class but as well we know 
//  if we use BuffererdReader class then we must use with that FileReader class also for path







/*

import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        FileReader f = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        String line;
        while((line = f.readLine()) != null){
            System.out.println(line);
        }
        f.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}

*/






/*

import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        BufferedReader f = new BufferedReader(new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt"));
        String line;
        while((line = f.readLine()) != null){
            System.out.println(line);
        }
        f.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}

*/





// this below code is incorrect because BufferedReader class doesn't contain the second boolean 


/*

import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        FileReader fl = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        BufferedReader f = new BufferedReader(fl, true);
        String line;
        while((line = f.readLine()) != null){
            System.out.println(line);
        }
        f.close();

        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}

*/








// this below code is correct


/*

import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        FileReader fl = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        BufferedReader f = new BufferedReader(fl);
        String line;
        while((line = f.readLine()) != null){
            System.out.println(line);
        }
        f.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}

*/








/*

import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        FileReader fl = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        BufferedReader f = new BufferedReader(fl);
        String line;
        while((line = f.readLine()) != null){
            System.out.println(line);
        }
        f.close();
        fl.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}

*/








// in this FileReader class we use read() method or other class we use readLine() method  



// below code is incorrect 

/*
import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        FileReader fl = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        int i;
        while((i = fl.read()) != 0){
            System.out.println((char)i);
        }
        fl.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}

*/





// below code is incorrect 

/*
import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        FileReader fl = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        int i;
        while((i = fl.read()) != 0){
            System.out.print((char)i);
        }
        fl.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}

*/






// below code is correct 

/*

import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        FileReader fl = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        int i;
        while((i = fl.read()) != -1){  // here in the file read() method -1 show that file has reached to the end if we use here 0 then o in this is a valid 
                                    // character so this will return the infinite loop or characters that we don't want 
            System.out.print((char)i);
        }
        fl.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}

*/





// below code is incorrect 

/*

import java.io.*;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        Scanner f = new Scanner(new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt"));
        String line;
        while((line = f.readLine()) != null){
            System.out.println(line);
        }
        f.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}



*/


// Scanner
// in this we are using Scanner and this is exist in different package that is 

// this below code is correct 

/*
import java.io.*;
import java.util.Scanner;
class Readatextfromfile{
    public static void main(String[] args)
    {
        try{ 
        Scanner f = new Scanner(new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt"));
        String line;
        while(f.hasNextLine()){
            line = f.nextLine();
            System.out.println(line);
        }
        f.close();
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }

}
*/





// FileInputStream class
// because it is stream so we can take either byte or character so we will take the byte



/*
import java.io.FileInputStream;
class Readatextfromfile{
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("C:\\\\Users\\\\RISHABH\\\\OneDrive\\\\Documents\\\\Desktop\\\\Full java programs\\\\createdfilethird.txt");
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            f.close();
            System.out.println("Successfully read");
        }
        catch(Exception e){
            System.out.println("Exception handled!");
        }
    }
}
*/





// below the incorrect code

/*
import java.io.FileInputStream;
class Readatextfromfile{
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("C:\\\\Users\\\\RISHABH\\\\OneDrive\\\\Documents\\\\Desktop\\\\Full java programs\\\\createdfilethird.txt");
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            f.close();
            System.out.println("Successfully read");
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }
    }
}
    */





// below the correct code

/*

import java.io.FileInputStream;
import java.io.IOException;
class Readatextfromfile{
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("C:\\\\Users\\\\RISHABH\\\\OneDrive\\\\Documents\\\\Desktop\\\\Full java programs\\\\createdfilethird.txt");
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            f.close();
            System.out.println("Successfully read");
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }
    }
}

*/





// below the incorrect code

/*

import java.io.FileInputStream;
import java.io.IOException;
class Readatextfromfile{
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("C:\\\\Users\\\\RISHABH\\\\OneDrive\\\\Documents\\\\Desktop\\\\Full java programs\\\\createdfilethird.txt");
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            f.close();
            System.out.println("Successfully read");
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }
        catch(FileNotFoundException e){
            System.out.println("Exception handled!");
        }
    }
}

*/


/*

import java.io.*;
class Readatextfromfile{
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("C:\\\\Users\\\\RISHABH\\\\OneDrive\\\\Documents\\\\Desktop\\\\Full java programs\\\\createdfilethird.txt");
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            f.close();
            System.out.println("Successfully read");
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }
    }
}

*/








import java.io.*;
class Readatextfromfile{
    public static void main(String[] args){
        try{
            FileInputStream f = new FileInputStream("C:\\\\Users\\\\RISHABH\\\\OneDrive\\\\Documents\\\\Desktop\\\\Full java programs\\\\createdfilethird.txt");
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            f.close();
            System.out.println("Successfully read");
        }
        catch(IOException e){
            System.out.println("Exception handled!");
            e.printStackTrace();           // Print stack trace for debugging
        }
    }
}