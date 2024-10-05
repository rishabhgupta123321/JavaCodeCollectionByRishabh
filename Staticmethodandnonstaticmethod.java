                                  /*Static method and non-Static method*/






// This below code is incorrect


/*

class Staticmethodandnonstaticmethod{
    int a = 10;      // instance variable 
    static int b = 20;    // static instance variable or static variable
    static void show(){
        System.out.print(a+" "+b);
    }
    public static void main(String []argss){
        Staticmethodandnonstaticmethod r = new Staticmethodandnonstaticmethod();
        Staticmethodandnonstaticmethod.show();
        r.Disp();
    }
    void Disp(){
        System.out.print(a+" "+b);
    }

}

*/





// this below code is correct


/*

class Staticmethodandnonstaticmethod{
    int a = 10;      // instance variable 
    static int b = 20;    // static instance variable or static variable
    static void show(){
        System.out.println("Show() "+b);      // in static method we can only call the static variable 
    }
    public static void main(String []argss){
        Staticmethodandnonstaticmethod r = new Staticmethodandnonstaticmethod();
        Staticmethodandnonstaticmethod.show();
        r.Disp();
    }
    void Disp(){
        System.out.println("Disp() "+a+" "+b);  // in non-static method we can also call the non-static variable means 
                                    // instance variable with the static variable. 
    }

} 

*/  





class Staticmethodandnonstaticmethod{
    int a = 10;      // instance variable 
    static int b = 20;    // static instance variable or static variable
    static void show(){
        Staticmethodandnonstaticmethod ref = new Staticmethodandnonstaticmethod();
        int c = ref.a;
        System.out.println("Show() "+ c +" "+b);      // in static method we can only 
                                                        // call the static variable 
    }           
        // here above we have applied dthe concetination operator
    public static void main(String []argss){
        Staticmethodandnonstaticmethod r = new Staticmethodandnonstaticmethod();
        Staticmethodandnonstaticmethod.show();
        r.Disp();
    }
    void Disp(){
        System.out.println("Disp() "+a+" "+b);  // in non-static method we can also 
                                                    // all the non-static variable means 
                                    // instance variable with the static variable. 
    }

} 