                                           /*parameterized constructor*/



// constructor we have taken becuase we can initialized value in this and we can call again and again in this.


/*
class A{
    int x; int y;  // this is the instarnce vairable and this will be accessible in the whole class A
    A(int a, int b){       // constructor
        x = a;
        y = b;
    }
    void show(){
        System.out.print(x+" "+y);
    }
}
class Parameterizedconstructor{
    public static void main(String []argss){
        A r = new A(100, 200);
        r.show();
    }
}
    */





/*    
    class A{
        int x; int y;  // this is the instance vairable and this will be accessible in the whole class A
        A(int a, int b){       // constructor
            x = a;
            y = b;
            System.out.println(x+" "+y);
        }
    }
    class Parameterizedconstructor{
        public static void main(String []argss){
            A r = new A(100, 200);
            System.out.println("x: " + r.x + ", y: " + r.y);
        }
    }
*/







/*
class Parameterizedconstructor{
    int x; int y;  // this is the instance vairable and this will be accessible in the whole class A
    Parameterizedconstructor(int a, int b){       // constructor
        x = a;
        y = b;
        System.out.println(x+" "+y);
    }
    public static void main(String []argss){
        Parameterizedconstructor r = new Parameterizedconstructor(100, 200);
        System.out.println("x: " + r.x + ", y: " + r.y);
    }
}
*/






/*

class Parameterizedconstructor{                  // default constructor 
    int x; int y;  // this is the instance vairable and this will be accessible in the whole class A
    public static void main(String []argss){
        Parameterizedconstructor r = new Parameterizedconstructor();
        System.out.println("x: " + r.x + ", y: " + r.y);                // when we have not taken any constructor then if we want to initialized the value 
                                                                // automatically by the compiler by creating the constructor so for this 
                                                                // i have to create the object also then compiler will be able to do so.
    }
}

*/





// when we have two or more than one constructor in the class 

// this below code is incorrect because in this we have created the instance variable g and h

/*
class A{
    int x; int y;  // this is the instarnce vairable and this will be accessible in the whole class A
    A(int a, int b){       // constructor
        x = a;
        y = b;
    }
    A(int g, String h){  // in this we have created the new constructor but we know for creating , we can create only with the class name
        System.out.println("g "+g+" h "+h);
    }

    void show(){
        System.out.println(x+" "+y);
    }
}
class Parameterizedconstructor{
    public static void main(String []argss){
        A r = new A(100, 200);
        A ref = new A(10, "helo");
        System.out.println("x: "+ r.x +" y: "+r.y+" g: "+ref.g+" h: "+ref.h);
        r.show();
    }
}
    */



    
// this below code is correct 
    class A{
        int x; int y; int i; String o;  // this is the instarnce vairable and this will be accessible in the whole class A
        A(int a, int b){       // constructor
            x = a;
            y = b;
        }
        A(int g, String h){  // in this we have created the new constructor but we know for creating , we can create only with the class name
            System.out.println("g "+g+" h "+h);
            i=g;
            o=h;
        }
    
        void show(){
            System.out.println(x+" "+y);
        }
    }
    class Parameterizedconstructor{
        public static void main(String []argss){
            A r = new A(100, 200);
            A ref = new A(10, "helo");
            System.out.println("x: "+ r.x +" y: "+r.y+" g: "+ref.i+" h: "+ref.o);
            r.show();
        }
    }