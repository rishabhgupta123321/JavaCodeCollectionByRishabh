                           /*How to use methods in java */


import java.util.Scanner;
class Methodss{
    int n1,n2,add,sub,multi,div,rem;  // instance variable // this instance variable and also static variable 
                                        // we can call these in the non-static method
    
    // Scanner r = new Scanner(System.in);      // if we create here object for taking input so we can take input 
                                            // in any method                                     
    public static void main(String []arts) 
    {
        Methodss ref = new Methodss();
        ref.input(); 
        ref.process();
        ref.output();



    } 
    void input()          // for callling these non-static method we have create object reference variable
                            // the main method for accessing 
    {
        Scanner r = new Scanner(System.in);     // here we have created object reference variable so can
        System.out.print("Enter two numbers: ");                                        // access this only in this inside this method
        n1 = r.nextInt();
        n2 = r.nextInt();
        r.close();
    }

    void process()
    {
        // int add = n1+n2;  // so here i have defined add variable integer in only this process method so 
                            // here if i want to access this add variable outside this process method then 
                            // i will not able to do it , so i have to take this as a public variable
    
    add = n1+n2;
    sub = n1-n2;
    multi = n1*n2;
    div = n1/n2;
    rem = n1%n2;   
    }
    void output()
    {
        System.out.println("Sum of two numbers: "+add);
        System.out.println("sub of two numbers: "+sub);
        System.out.println("multi of two numbers: "+multi);
        System.out.println("div of two numbers: "+div);
        System.out.println("rem of two numbers: "+rem);

    }
    
}


// in these all non-static method i have not created object for taking variable that is instance variable 
// because i know that in non-static method we can access or call the static and also instance variable.