                                            /*private constructor*/


/*                                            
class Privateconstructor{
    int a; double b; String c;           
     private Privateconstructor(){     // in constructor we initialize values in variable 
        a = 10; b = 0.4; c = "elos";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String [] argsss){
        Privateconstructor reff = new Privateconstructor();
    }
}        // private constructor we can not access outside the class in another class so here we are accessing the constructor in the same class 

*/



// so if we make the another class and access this private access modifier constructor then it will show the security error 

// like below code is incorrect - 


/*
class Privateconstructor{
    int a; double b; String c;           
     private Privateconstructor(){     // in constructor we initialize values in variable 
        a = 10; b = 0.4; c = "elos";
        System.out.println(a+" "+b+" "+c);
    }
}   
class B{
    public static void main(String [] argsss){
        Privateconstructor reff = new Privateconstructor();
    }
}
*/



// but here we can do make the static method in Privateconstructor class and then write the logic there and then we can access that 
// static method in another class also like below 




class Privateconstructor{
    int a; double b; String c;           
     private Privateconstructor(){     // in constructor we initialize values in variable 
        a = 10; b = 0.4; c = "elos";
    }
    static void show(){
        Privateconstructor r = new Privateconstructor();
        System.out.println(r.a+" "+r.b+" "+r.c);
    }
}   
class B{
    public static void main(String [] argsss){
        Privateconstructor.show();
    }
}