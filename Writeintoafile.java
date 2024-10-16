                                                    /* java program to write into a file */




// below code is incorrect


/*

class Writeintoafile{
    public static void main(String[] args){
         
        FileWriter f = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
        f.write("in this file we are writing");
        f.close();

    }
}

*/





// this is also the below code is incorrect becuase in this we have to use the try-catch becuase in this we are accessing the file or inside the file 
// so if further file not found then IOException can come and so with this for handling that exception we have to use the try-catch block or throws


/*

import java.io.*;
class Writeintoafile{
    public static void main(String[] args){
         
        FileWriter f = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
        f.write("in this file we are writing");
        f.close();

    }
}

*/






/*

import java.io.*;
class Writeintoafile{
    public static void main(String[] args){
        try{
        FileWriter f = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");
        f.write("in this file we are writing");
        f.close();
        System.out.println("Successfully wrote in the file");
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }
    }
}

*/




// so now firstly if we want to check that file that that file is exist or not so what we do 
// so we know for that we will use the exists() method but we also know that this exists() method is olny in the File class so know we have to also create the 
// File class object like below 


// and we also know that all these class we will take in the try block itself





/*

import java.io.*;
class Writeintoafile{
    public static void main(String[] args){
        try{
            File fl = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");      // so know this is the super class , so in this object we have to take the path of the file now so and now here 
                                            // we have the  file reference obejct variable  


        FileWriter f = new FileWriter(fl, true); // so because this is the sub class of File and our file path also in File class so here we will take that File class 
                                                // reference variable with we will write True for that showing that allow to write or doing someting inside 
                                                // this file               , so now       fl, True by writing now we have access of File class
                                                
        if(fl.exists()){                                    
        f.write("in this file we are writing");
        f.close();
        System.out.println("Successfully wrote in the file");
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





    // this below code is the incorrect code because we don't need to close the File class only we can close like BufferedWriter or FileWriter class 




/*
    
    import java.io.*;
    class Writeintoafile{
        public static void main(String[] args){
            try{
                File fl = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt"); 
                                            // so know this is the super class , so in this object we have to take the path of the file now so and now here 
                                                // we have the  file reference obejct variable  
    
    
            FileWriter f = new FileWriter(fl, true); // so because this is the sub class of File and our file path also in File class 
                                                     //so here we will take that File class 
                                                    // reference variable with we will write True for that showing that allow to write or doing someting inside 
                                                    // this file               , so now       fl, True by writing now we have access of File class
                                                    
            if(fl.exists()){                                    
            f.write("in this file we are writing");
            f.close();
            fl.close();
            System.out.println("Successfully wrote in the file");
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





        //below code is incorrect 

        /*

        import java.io.*;
        class Writeintoafile{
            public static void main(String[] args){
                try{
                    File fl = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");   
                                                  //   // so know this is the super class , so in this object we have to take the path of the file now so and now here 
                                                    // we have the  file reference obejct variable  
        
        
                FileWriter f = new FileWriter(fl, true); // so because this is the sub class of File and our file path also in 
                                                          //File class so here we will take that File class 
                                                        // reference variable with we will write True for that showing that allow to write or doing someting inside 
                                                        // this file               , so now       fl, True by writing now we have access of File class
                                                        
                if(fl.exists()){                                    
                f.write("in this file we are writing");
                f.close();
                System.out.println("Successfully wrote in the file");
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







            // but in this we have to take if(fl.exists()) checked before the FileWriter class object creation because if we use this after the FileWriter so 
            // if file doesn't exist then also will create or exist then write 



            // so like below code is correct 






/*


 import java.io.*;
    class Writeintoafile{
    public static void main(String[] args){
    try{
        File fl = new File("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");      
                                                // so know this is the super class , so in this object we have to take the path of the file now so and now here 
                         // we have the  file reference obejct variable  
            
        if(fl.exists()){ 
        FileWriter f = new FileWriter(fl, true); // so because this is the sub class of File and our file path also in File class so here we will take that File class 
                        // reference variable with we will write True for that showing that allow to write or doing someting inside 
                                                       // this file               , so now       fl, True by writing now we have access of File class
                                                                                               
                    f.write("in this file we are writing");
                    f.close();
                    System.out.println("Successfully wrote in the file");
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






// below code is incorrect , becasue in this inside try block with either we have to take finally block also or one catch block inside this also 


/*

import java.io.*;
class Writeintoafile{
    public static void main(String[] args){
        try{
            FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");                                                                                 
        try{ 
            file.write("in this file we are writing in this two try block and single catch block have");
        }
        file.close();
        System.out.println("Successfully wrote in the file");
        }
        catch(IOException e){
            System.out.println("Exception handled!");
        }
    }

    }

    */










// so this is the correct code  because in this try inside block we have also taken the finally block with this 



// so basically this is correct but however this second try block doesn't needed so 
/*

    import java.io.*;
    class Writeintoafile{
        public static void main(String[] args){
            try{
                FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");                                                                                 
            try{ 
                file.write("in this file we are writing in this two try block and single catch block have");
            }
            finally{ 
            file.close();
            }
            System.out.println("Successfully wrote in the file");
            }
            catch(IOException e){
                System.out.println("Exception handled!");
            }
        }
    
        }


        */






        // so with single try block correct code below



// in this below code       file.close();         automatically called 



/*
        import java.io.*;
        class Writeintoafile{
            public static void main(String[] args){
                try{
                    FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");                                                                                
                    file.write("in this file we are writing in this two try block and single catch block have");
                    System.out.println("Successfully wrote in the file");
                }
                catch(IOException e){
                    System.out.println("Exception handled!");
                }
            }
        
            }
    
  */      





            // import java.io.*;
            // class Writeintoafile{
            //     public static void main(String[] args){
            //         try{
            //             FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");                                                                                
            //             file.write("in this file we are writing in this two try block and single catch block have");
            //             System.out.println("Successfully wrote in the file");
            //         }
            //         catch(IOException e){
            //             System.out.println("Exception handled!");
            //         }

            //     }
            
            //     }





            // import java.io.*;
            // class Writeintoafile{
            //     public static void main(String[] args){
            //         try{
            //             FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");                                                                                
            //             file.write("in this file we are writing in this two try block and single catch block have");
            //             System.out.println("Successfully wrote in the file");
            //         }

            //         catch(IOException e){
            //             System.out.println("Exception handled!");
            //         }
            //     }
            
            //     }




// this below code is incorrect



/*

import java.io.*;
class Writeintoafile{
    public static void main(String[] argss){
        try{
            
        BufferedWriter buff = new BufferedWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");    // class 
        buff.write("Hey , hi how are doing?");    // method
        System.out.println("Successfully wrote");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
    }
}

*/






// so if we are taking BufferWriter then with this we have to also take or instantiated with the FileWriter object inside the BufferWriter like below 


/*
import java.io.*;
class Writeintoafile{
    public static void main(String[] argss){
        try{
            
        BufferedWriter buff = new BufferedWriter(new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt"));    // class 
        buff.write("Hey , hi how are doing?");    // method
        buff.close();
        System.out.println("Successfully wrote");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
    }
}
    */






    // now FileOutputStream


// this below code is incoorect 


/*
import java.io.*;
class Writeintoafile{
    public static void main(String[] argss){
        try{
            
        FileOutputStrem fos = new FileOutputStream(new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt"));    // class 
        fos.write("Hey , hi how are doing great?");    // method
        fos.close();
        System.out.println("Successfully wrote");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
    }
}
*/






// in this FileOutputStream we don't need to take the FileWriter in the object of FileOutputStream 
// this below code is coorect 

// this FileOutputStream based on the array




/*

import java.io.*;
class Writeintoafile{
    public static void main(String[] argss){
        try{
            
        FileOutputStream fos = new FileOutputStream("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt");    // class
        // this come in the byte so here first we will convert text into byte 
        
        String text = "Hey , hi how are doing great?kslksklsklsksk";
        byte[] textbyte = text.getBytes();        // byte convert
        fos.write(textbyte);    // method
        fos.close();
        System.out.println("Successfully wrote");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
    }
}

*/











// PrintWriter 


/*

import java.io.*;
class Writeintoafile{
    public static void main(String[] argss){
        try{
            
        PrintWriter prtw = new PrintWriter(new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilefirst.txt"));    // class 
        prtw.write("Hey , hi how are doing? print writer");    // method
        prtw.close();
        System.out.println("Successfully wrote");
    }
    catch(IOException e){
        System.out.println("Exception handled!");
    }
    }
}

*/




// BufferedWriter  or FileWriter    file creation code itself

// so in this we was not the file that we have given in the path , so this will create itself and write 

// import java.io.*;
// class Writeintoafile{
//     public static void main(String[] args){
//         try{
//             FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilesecond.txt");                                                                                
//             file.write("in this file we are writing in this two try block and single catch block have");
//             System.out.println("Successfully wrote in the file");
//         }

//         catch(IOException e){
//             System.out.println("Exception handled!");
//         }
//     }

//     }







// import java.io.*;
// class Writeintoafile{
//     public static void main(String[] args){
//         try{
//             FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilesecond.txt");                                                                                
//             file.write("in this file we are writing in this two try block and single catch block have");
//             System.out.println("Successfully wrote");
//         }

//         catch(IOException e){
//             System.out.println("Exception handled!");
//         }
//     }

//     }






// import java.io.*;
// class Writeintoafile{
//     public static void main(String[] args){
//         try{
//             FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilesecond.txt",true);                                                                                
//             file.write("in this file we are writing in this two try block and single catch block have");
//             System.out.println("Successfully wrote");
//         }

//         catch(IOException e){
//             System.out.println("Exception handled!");
//         }
//     }

//     }






// in this below code new file that doesn't exist that will create but in this file nothing will be written 


// so that's why below code is incorrect 


// import java.io.*;
// class Writeintoafile{
//     public static void main(String[] args){
//         try{
//             FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfilethird.txt");                                                                                
//             file.write("in this file we are writing in this two try block and single catch block have");
//             System.out.println("Successfully wrote");
//         }
//         catch(IOException e){
//             System.out.println("Exception handled!");
//         }
//     }

//     }




// this is correct in this file also will create and also text will write and after closing the file that will also show


import java.io.*;
class Writeintoafile{
    public static void main(String[] args){
        try{
            FileWriter file = new FileWriter("C:\\Users\\RISHABH\\OneDrive\\Documents\\Desktop\\Full java programs\\createdfileforth.txt");                                                                                
            file.write("in this file we are writing in this two try block and single catch block have");
            System.out.println("Successfully wrote");
            file.close();  // file closing is the imp. so that's why we are using this 
        }

        catch(IOException e){
            System.out.println("Exception handled!");
        }
    }

    }






