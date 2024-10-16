                                                /*Rename a file*/


/*

import java.io.*;
class Renamefile{
    public static void main(String[] args){
        try{ 
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        File r = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdssss.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesn't exist");
        }
    }
        catch(Exception e){
            System.out.println("Exception Handled!");
            e.printStackTrace();
        }
    }
}

*/



/*

import java.io.*;
class Renamefile{
    public static void main(String[] args){
        try{ 
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        File r = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdssss.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesn't exist");
        }
    }
        catch(Exception e){
            System.out.println("Exception Handled!");
        }
    }
}

*/








/*

import java.io.*;
class Renamefile{
    public static void main(String[] args){
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");
        File r = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdssss.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesn't exist");
        }
    }
}

*/





import java.io.*;
class Renamefile{
    public static void main(String[] args){
        File f = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdssss.txt");
        File r = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdscaccccacccc.txt");
        if(f.exists()){
            f.renameTo(r);
        }
        else{
            System.out.println("File doesn't exist");
        }
    }
}
