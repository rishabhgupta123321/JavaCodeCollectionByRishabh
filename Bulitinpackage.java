                                        /*Built in package*/



                                        // in this we will read the text by using the Scanner class 




// this is the incorrect code 

// class Bulitinpackage
// {
//     public static void main(String[] arasd){
//         try{
//             File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
//             Scanner r = new Scanner(f);
//             if(r.hasNextLine()){
//                 System.out.println(r.nextLine());
//             }
//         }
//     }
// }





  // in this mostly for reading we use the while loop not if block

  // below code is incorrect because File class doesn't have close() method only Scanner class have this close() method 



/*

import java.lang.System;
import java.lang.String;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

class Bulitinpackage
{
    public static void main(String[] arasd){
        try{
            File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                System.out.println(r.nextLine());
            }
            System.out.println("Successfully Read");
            f.close();
        }
        catch(IOException e){
            System.out.println("Exception handled");
        }
    }
}

*/








// below code is correct



/*

import java.lang.System;
import java.lang.String;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

class Bulitinpackage
{
    public static void main(String[] arasd){
        try{
            File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                System.out.println(r.nextLine());
            }
            System.out.println("Successfully Read");
            r.close();
        }
        catch(IOException e){
            System.out.println("Exception handled");
        }
    }
}

*/





// this below code is incorrect code 

/*

import java.lang.System;
import java.lang.String;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

class Bulitinpackage
{
    public static void main(String[] arasd){
        try{
            File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                System.out.println(r.nextLine());
            }
            System.out.println("Successfully Read");
            r.close();
        }
        catch(IOException e){
            System.out.println("Exception handled");
            e.PrintStackTrace(); // this is for automatically exception debug
        }
    }
}

*/





// below code is correct in this we used small p in this e.printStackTrace(); instead of this caption P with PrintStackTrace();




/*

import java.lang.System;
import java.lang.String;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

class Bulitinpackage
{
    public static void main(String[] arasd){
        try{
            File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                System.out.println(r.nextLine());
            }
            System.out.println("Successfully Read");
            r.close();
        }
        catch(IOException e){
            System.out.println("Exception handled");
            e.printStackTrace(); // this is for automatically exception debug
        }
    }
}

*/





// this is incorrect code




/*

import java.lang.System;
import java.lang.String;

// import java.io.File;

// import java.io.IOException;
import java.lang.Exception;
import java.util.Scanner;

class Bulitinpackage
{
    public static void main(String[] arasd){
        try{
            // File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            Scanner r = new Scanner("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            while(r.hasNextLine()){
                System.out.println(r.nextLine());
            }
            System.out.println("Successfully Read");
            r.close();
        }
        // catch(IOException e){    
            catch(Exception e){
            System.out.println("Exception handled");
            e.printStackTrace(); // this is for automatically exception debug
        }
    }
}

*/






/*

import java.lang.System;
import java.lang.String;

import java.io.File;

import java.io.IOException;
import java.lang.Exception;
import java.util.Scanner;

class Bulitinpackage
{
    public static void main(String[] arasd){
        try{
            File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                System.out.println(r.nextLine());
            }
            System.out.println("Successfully Read");
            r.close();
        }
        catch(IOException e){    
            // catch(Exception e){
            System.out.println("Exception handled");
            e.printStackTrace(); // this is for automatically exception debug
        }
    }
}

*/






/*

import java.lang.System;
import java.lang.String;

import java.io.File;

import java.io.IOException;
import java.lang.Exception;
import java.util.Scanner;

class Bulitinpackage
{
    public static void main(String[] arasd){
        try{
            File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                System.out.println(r.nextLine());
            }
            System.out.println("Successfully Read");
            r.close();
        }
        catch(IOException e){    
            // catch(Exception e){
            System.out.println("Exception handled");
        }
    }
}

*/







/*


import java.io.File;

import java.io.IOException;

import java.util.Scanner;

class Bulitinpackage
{
    public static void main(String[] arasd){
        try{
            File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                System.out.println(r.nextLine());
            }
            System.out.println("Successfully Read");
            r.close();
        }
        catch(IOException e){    
            // catch(Exception e){
            System.out.println("Exception handled");
        }
    }
}

*/