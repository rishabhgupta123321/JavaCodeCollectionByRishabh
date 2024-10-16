                                            /*Display the file information*/



                                            // whenever we work with file so we have to take try-catch but in this we are not doing inside the file just checking 
                                            // the file information in this
                                            

/*

import java.io.*;                                            
class Displaythefileinformation
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfileforth.txt"); 
        if(f.exists()){                // file check that exist or not
                            // File class contain exists() method
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Size: "+f.length());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }    
}

*/












// this below code is incorrect becasue in this we have yet imported the package


/*

class Displaythefileinformation
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfileforth.txt"); 
        if(f.exists()){                // file check that exist or not
                            // File class contain exists() method
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Size: "+f.length());
            System.out.println("File Removed: "+f.delete());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }    
}

*/





// this below code is correct



/*

import java.io.*;
class Displaythefileinformation
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfileforth.txt"); 
        if(f.exists()){                // file check that exist or not
                            // File class contain exists() method
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Size: "+f.length());
            System.out.println("File Removed: "+f.delete());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }    
}

*/



/*

import java.io.*;
class Displaythefileinformation
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfileforth.txt"); 
        if(f.exists()){                // file check that exist or not
                            // File class contain exists() method
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Size: "+f.length());
            System.out.println("File Removed: "+f.delete());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }    
}


*/






// below code is incorrect

/*

import java.io.*;
class Displaythefileinformation
{
    public static void main(String[] args)
    {
        try{ 
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilesecond.txt"); 
        if(f.exists()){                // file check that exist or not
                            // File class contain exists() method
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Size: "+f.length());
            System.out.println("File Removed: "+f.delete());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
    }    
}

*/





// below code is correct

/*

import java.io.*;
class Displaythefileinformation
{
    public static void main(String[] args)
    {
        try{ 
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilesecond.txt"); 
        if(f.exists()){                // file check that exist or not
                            // File class contain exists() method
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Size: "+f.length());
            System.out.println("File Removed: "+f.delete());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }
    catch(Exception e){
        System.out.println("Exception handled!");
    }
    }    
}

*/