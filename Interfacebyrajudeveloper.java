                                            /* interface introduction */







// this below code is incorrect because we have not used public modifier in the sub class's method according to 
// the interface all methods are public that's why 



/*


import java.util.Scanner;                                            
interface client     // like the super class 
{
void input(); // by default      public and abstract  method in the interface
void output();   // public + abstract 
// so here input and output method in this we have not used { } because this is common and incompleter 
// information that's why we don't implement this code then we use only end this method with the semi-colon 
// and because of this is the incomplete so that's why we make this method as an abstract (incomplete) and 
// by default this is abstract so , if we don't write then also fine , otherwise we can also write abstract 
// and this method is by default is the public means we can access this method from other class also 

// so these all are the client's requirement that we have note down 
}

// import java.util.Scanner;
class Interfacebyrajudeveloper implements client{  // like the sub-class 
    String name;  
    double sal;

    void input(){ // here according to the default public method in the interface it is not public written , by us also 
                        // so that's why this become weak and this method will take by default   default access modifier 
                            // that is very weak to compare to the public so that's why it will give the error 
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = r.nextInt();
        System.out.print("Enter Salary: ");
        sal = r.nextDouble();
        }

    void output(){
        System.out.println(name+" "+sal);
    }
    public static void main(String []argss){
        // because we know that we can not create the object of the interface class like the abstract class 
        // so we can only take reference variable from that interface super class like below 
        // client r = new raju();      // it is also correct // here object only will be the raju because developer raju have only total 
                                        // control of the project  
        Interfacebyrajudeveloper r = new Interfacebyrajudeveloper();                
        r.input();
        r.output();
    }

}
*/









// // this below code is incorrect because we have used default access modifier in the method 


/*
import java.util.Scanner;                                            
interface client     // like the super class 
{
void input(); // by default      public and abstract  method in the interface
void output();   // public + abstract 
// so here input and output method in this we have not used { } because this is common and incompleter 
// information that's why we don't implement this code then we use only end this method with the semi-colon 
// and because of this is the incomplete so that's why we make this method as an abstract (incomplete) and 
// by default this is abstract so , if we don't write then also fine , otherwise we can also write abstract 
// and this method is by default is the public means we can access this method from other class also 

// so these all are the client's requirement that we have note down 
}

// import java.util.Scanner;
class Interfacebyrajudeveloper implements client{  // like the sub-class 
    String name;  
    double sal;

    default void input(){ // here according to the default public method in the interface it is not public written , by us also 
                        // so that's why this become weak and this method will take by default   default access modifier 
                            // that is very weak to compare to the public so that's why it will give the error 
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = r.nextLine();
        System.out.print("Enter Salary: ");
        sal = r.nextDouble();
        }

    default void output(){
        System.out.println(name+" "+sal);
    }
    public static void main(String []argss){
        // because we know that we can not create the object of the interface class like the abstract class 
        // so we can only take reference variable from that interface super class like below 
        // client r = new raju();      // it is also correct // here object only will be the raju because developer raju have only total 
                                        // control of the project  
        Interfacebyrajudeveloper r = new Interfacebyrajudeveloper();                
        r.input();
        r.output();
    }

}
*/








//below code is now correct 

/*
import java.util.Scanner;                                            
interface client     // like the super class 
{
void input(); // by default      public and abstract  method in the interface
void output();   // public + abstract 
// so here input and output method in this we have not used { } because this is common and incompleter 
// information that's why we don't implement this code then we use only end this method with the semi-colon 
// and because of this is the incomplete so that's why we make this method as an abstract (incomplete) and 
// by default this is abstract so , if we don't write then also fine , otherwise we can also write abstract 
// and this method is by default is the public means we can access this method from other class also 

// so these all are the client's requirement that we have note down 
}

// import java.util.Scanner;
class Interfacebyrajudeveloper implements client{  // like the sub-class 
    String name;  
    double sal;

   public void input(){ // here according to the default public method in the interface it is not public written , by us also 
                        // so that's why this become weak and this method will take by default   default access modifier 
                            // that is very weak to compare to the public so that's why it will give the error 
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = r.nextLine();
        System.out.print("Enter Salary: ");
        sal = r.nextDouble();
        }

    public void output(){
        System.out.println(name+" "+sal);
    }
    public static void main(String []argss){
        // because we know that we can not create the object of the interface class like the abstract class 
        // so we can only take reference variable from that interface super class like below 
        // client r = new raju();      // it is also correct // here object only will be the raju because developer raju have only total 
                                        // control of the project  
        Interfacebyrajudeveloper r = new Interfacebyrajudeveloper();                
        r.input();
        r.output();
    }

}

*/






// below code is incorrect because all import package we have to take before the line of program, not the before that 
// class in which we have used the Scanner class 


/*
                                          
interface client     // like the super class 
{
abstract void input(); // by default      public and abstract  method in the interface
abstract void output();   // public + abstract 
}

import java.util.Scanner;
class Interfacebyrajudeveloper implements client{  
    String name;  
    double sal;

   public void input(){ 
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = r.nextLine();
        System.out.print("Enter Salary: ");
        sal = r.nextDouble();
        }

    public void output(){
        System.out.println(name+" "+sal);
    }
    public static void main(String []argss){
        Interfacebyrajudeveloper r = new Interfacebyrajudeveloper();                
        r.input();
        r.output();
    }

}

*/





// below code is correct 

/*
import java.util.Scanner;                                            
interface client     // like the super class 
{
abstract void input(); // by default      public and abstract  method in the interface
abstract void output();   // public + abstract 
}


class Interfacebyrajudeveloper implements client{  
    String name;  
    double sal;

   public void input(){ 
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = r.nextLine();
        System.out.print("Enter Salary: ");
        sal = r.nextDouble();
        }

    public void output(){
        System.out.println(name+" "+sal);
    }
    public static void main(String []argss){
        Interfacebyrajudeveloper r = new Interfacebyrajudeveloper();                
        r.input();
        r.output();
    }

}

*/






// import java.util.Scanner;                                            
// interface client     // like the super class 
// {
// abstract public void input(); // by default      public and abstract  method in the interface
// abstract void output();   // public + abstract 
// }


// class Interfacebyrajudeveloper implements client{  
//     String name;  
//     double sal;

//    public void input(){ 
//         Scanner r = new Scanner(System.in);
//         System.out.print("Enter Username: ");
//         name = r.nextLine();
//         System.out.print("Enter Salary: ");
//         sal = r.nextDouble();
//         }

//     public void output(){
//         System.out.println(name+" "+sal);
//     }
//     public static void main(String []argss){
//         Interfacebyrajudeveloper r = new Interfacebyrajudeveloper();                
//         r.input();
//         r.output();
//     }

// }





import java.util.Scanner;                                            
interface client     // like the super class 
{
    public abstract void input(); // by default      public and abstract  method in the interface
    public abstract void output();   // public + abstract   by default
}


class Interfacebyrajudeveloper implements client{  
    String name;  
    double sal;

   public void input(){ 
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = r.nextLine();
        System.out.print("Enter Salary: ");
        sal = r.nextDouble();
        }

    public void output(){
        System.out.println(name+" "+sal);
    }
    public static void main(String []argss){
        Interfacebyrajudeveloper r = new Interfacebyrajudeveloper();                
        r.input();
        r.output();
    }

}
