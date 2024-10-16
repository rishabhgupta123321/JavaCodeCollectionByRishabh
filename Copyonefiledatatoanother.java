                                                        /*Copy one file data to another*/




// this below code is also incorrect because in this FileWriter class , write method takes value as character or interger (int) , not take as the line 
// and write method in this if we have int value so we don't need to typecast that value to the char , write accept the int value 




/*
import java.io.*;
class Copyonefiledatatoanother{
    public static void main(String[] args){ 
    try{ 
    BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdscaccccacccc.txt"));
    FileWriter fw = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
    String line;
    while((line=fr.readLine())!=null){ 
        System.out.println(fw.write(line));
    }
    fr.close();
    fw.close();
    System.out.println("Successfully read from other file and paste to another file");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
}
}
*/





// this below code is incorrect 

/*

import java.io.*;
class Copyonefiledatatoanother{
    public static void main(String[] args){ 
    try{ 
    FileReader fr = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdscaccccacccc.txt");
    FileWriter fw = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
    int i;
    while((i=fr.read())!=-1){ 
        System.out.print(fw.write((char)i));
    }
    fr.close();
    fw.close();
    System.out.println("Successfully read from other file and paste to another file");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
}
}

*/






// in ths below code is correct but in this second file this data is overwriting 

/*
import java.io.*;
class Copyonefiledatatoanother{
    public static void main(String[] args){ 
    try{ 
    FileReader fr = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdscaccccacccc.txt");
    FileWriter fw = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
    int i;
    while((i=fr.read())!=-1){ 
        fw.write(i);      // in this write can accept the int value so we don't need to change in the char
    }
    fr.close();
    fw.close();
    System.out.println("Successfully read from other file and paste to another file");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
}
}

*/



// so if we want to append the data in second file , not want to overwrite so 



import java.io.*;
class Copyonefiledatatoanother{
    public static void main(String[] args){ 
    try{ 
    FileReader fr = new FileReader("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethirdscaccccacccc.txt");
    FileWriter fw = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt", true);
    int i;
    while((i=fr.read())!=-1){ 
        fw.write(i);      // in this write can accept the int value so we don't need to change in the char
    }
    fr.close();
    fw.close();
    System.out.println("Successfully read from other file and paste to another file");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
}
}


