                                                /* Inheritance */




                                                // this below code is correct 
// when we write code outside the main method we have to create the method mostly 


/*
class Structure{     // super class 
    int productp; String productn; // instance variable
    void show(){
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Details extends structure{      // sub class
    public static void main(String[] args){
        Details r = new Details();
        r.productn = "product1";
        r.productp = 9090;
        r.show();
    }
}

*/







// this below code is incorrect because we can not access methods and any instance variable by just creating 
// the object in another class of another class objecct like below so that's why we need extends keyword 
// for doing inheritance this 

/*
class Structure{     // super class 
    int productp; String productn; // instance variable
    void show(){
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Details {      // sub class
    public static void main(String[] args){
        Details r = new Details();
        r.productn = "product1";
        r.productp = 9090;
        r.show();
    }
}
*/





/*
class Structure{     // super class 
    int productp; String productn; // instance variable
    void show(){
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Details extends Structure {      // sub class
    public static void main(String[] args){
        Details r = new Details();
        r.productn = "product1";
        r.productp = 9090;
        r.show();
    }
}
*/





// class Structure{     // super class 
//     int productp; String productn; // instance variable
//     {        // instance block 
//     System.out.print("Enter the produtct details(product name and price):    ");
//     System.out.println(productn+" "+productp);
//     }
// }
// class Details extends Structure {      // sub class
//     public static void main(String[] args){
//         Details r = new Details();
//         r.productn = "product1";
//         r.productp = 9090;
        
//     }
// }




// below code is incorrect because we can not write or initialization without the object reference variable calling
/*
class Structure{     // super class 
    int productp; String productn; // instance variable
    {        // instance block 
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Details extends Structure {      // sub class
    public static void main(String[] args){
        productn = "product1";
        productp = 9090;
        Details r = new Details();
        
    }
}
*/








// above code output will be null 0  









// this is incorrect code because in static block we can not access the instance variable 
/*
class Structure{     // super class 
    int productp; String productn; // instance variable
    static {    // static block 
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Details extends Structure {      // sub class
    public static void main(String[] args){
        Details r = new Details();
        r.productn = "product1";
        r.productp = 9090;
        // r.show();
    }
}
*/






// this code is incorrect because we can not create the method inside the main method like below 
/*

class Structure{     // super class 
    int productp; String productn; // instance variable
    void show(){
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Details extends Structure {      // sub class
    public static void main(String[] args){
        void great(){
            System.out.println("this is the method");
        }
        Details r = new Details();
        r.productn = "product1";
        r.productp = 9090;
        r.show();
    }
}

*/







// this below code is correct

/*
class Structure{     // super class 
    int productp; String productn; // instance variable
    void show(){
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Simpleinheritance extends Structure {      // sub class
    
    void great(){  //  instance method or non-static method , 
                    //this method also we have to call otherwise 
                    // this will also not execute
        System.out.println("this is the method");
    }

    public static void main(String[] args){
        Simpleinheritance r = new Simpleinheritance();
        r.productn = "product1";
        r.productp = 9090;
        r.show();
        r.great();
    }
}

*/






// this code is incorrect because in this we are trying to assign the 
//value of print output statment but this 
// is the a          print method and method value we can not assing value inside the variable 
/*
    class Structure{     // super class 
        int productp; String productn; // instance variable
    
        String a = System.out.print("Enter the produtct details(product name and price):    ");
        String b = System.out.print(productn+" ");
        int c = System.out.print(productp);
    
    }
    class Details extends Structure {      // sub class
        
        void great(){  //  instance method or non-static method , 
                        //this method also we have to call otherwise 
                        // this will also not execute
            System.out.println("this is the method");
        }
    
        public static void main(String[] args){
            Details r = new Details();
            r.productn = "product1";
            r.productp = 9090;
            r.a;
            r.b;
            r.c;
            r.great();
        }
    }

*/









// this code is correct 
/*
import java.util.Scanner;

class Structure {  // Super class
    int productp;    // Instance variable for product price
    String productn; // Instance variable for product name
}

class Details extends Structure {  // Subclass
    
    void great() {  // Instance method
        System.out.println("This is the method.");
    }

    public static void main(String[] args) {
        // Create an instance of Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Details
        Details r = new Details();
        
        // Input product details
        System.out.print("Enter the product name: ");
        r.productn = scanner.nextLine();  // Capture product name

        System.out.print("Enter the product price: ");
        r.productp = scanner.nextInt();  // Capture product price
        
        // Display the entered details
        System.out.println("Product Name: " + r.productn);
        System.out.println("Product Price: " + r.productp);

        // Call the method
        r.great();

        scanner.close();
    }
}
*/







// protected means secure related 

class Structure{     // super class 
    protected int productp; protected String productn; // instance variable
    protected void show(){
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Simpleinheritance extends Structure{      // sub class
    public static void main(String[] args){
        Simpleinheritance r = new Simpleinheritance();
        r.productn = "product1";
        r.productp = 9090;
        r.show();
    }
}






// private means secure related and also can not access in another class 
/*
class Structure{     // super class 
    private int productp; private String productn; // instance variable
    private void show(){
    System.out.print("Enter the produtct details(product name and price):    ");
    System.out.println(productn+" "+productp);
    }
}
class Simpleinheritance extends Structure{      // sub class
    public static void main(String[] args){
        Simpleinheritance r = new Simpleinheritance();
        r.productn = "product1";
        r.productp = 9090;
        r.show();
    }
}
*/