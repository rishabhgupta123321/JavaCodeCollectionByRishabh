                            /*copy constructor*/

        


/*

class A{
    int x; int y;
    A(){
        x = 10; y = 20;
        System.out.println("constructor value: "+x+" "+y);
    }
    A(A ref){    // this copy constructor also will we same name because constructor become from class name that is same
        x = ref.x;
        y = ref.y;
        System.out.println("copy constructor value: "+x+" "+y);
    }
}
class Copyconstructor{
    public static void main(String []ragas){
        A r = new A();    // in this we have made the object also and we are calling also the A() constructor 
        A r2 = new A(r);
    }
}

*/





class A{
    int x; int y;
    int a; int b;
    A(){
        x = 10; y = 20;
        System.out.println("constructor value: "+x+" "+y);
    }
    A(A ref){    // this copy constructor also will we same name because constructor become from class name that is same
        a = ref.x;
        b = ref.y;
        System.out.println("copy constructor value: "+a+" "+b);
    }
}
class Copyconstructor{
    public static void main(String []ragas){
        A r = new A();    // in this we have made the object also and we are calling also the A() constructor 
        A r2 = new A(r);
        System.out.println("copy constructor value: "+r2.a+" "+r2.b);
    }
}