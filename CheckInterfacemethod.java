                                        /* Interface Methods */








// this below code is incorrect 

/*

interface Client{ // as an the super class 
    void webdesign();   // public + abstract 
    void webdevelope();
}
class RajTech implements Client   // sub class
{
    void webdesign(){          // in this class all methods is implemented so this class will not become the abstract class 
        System.out.println("Green, Top menu, three dot button");
    }
    void webdevelope(){
        System.out.println("Html, Css, JavaScript");
    }
} 
class Check{
    public static void main(String []args){
        RajTech r = new RajTech();
        r.webdesign();
        r.webdevelope();
    }
}

*/









// in this we have to remember that in the interface we have to use interface keyword and where i will be in the small letter 


/*

interface Clients{ // as an the super class 
    void webdesign();   // public + abstract 
    void webdevelope();   // public + abstract 
}
class RajTech implements Clients   // sub class
{
    public void webdesign(){          // in this class all methods is implemented so this class will not become the abstract class 
        System.out.println("Green, Top menu, three dot button");
    }
    public void webdevelope(){
        System.out.println("Html, Css, JavaScript");
    }
} 
class CheckInterfacemethod{
    public static void main(String []args){
        RajTech r = new RajTech();
        r.webdesign();
        r.webdevelope();
    }
}

*/








// interface Clients{ // as an the super class 
//     void webdesign();   // public + abstract 
//     void webdevelope();   // public + abstract 
// }
// class RajTech implements Clients   // sub class
// {
//     public void webdesign(){          // in this class all methods is implemented so this class will not become the abstract class 
//         System.out.println("Green, Top menu, three dot button");
//     }
//     public void webdevelope(){
//         System.out.println("Html, Css, JavaScript");
//     }
//     public static void main(String []args){
//         RajTech r = new RajTech();
//         r.webdesign();
//         r.webdevelope();
//     }
// } 








// so in the hypothetical situation, when if developer runs out from this by left this incomplete program, then this program also become 
// abstract it means this class RajTech will be become the abstract because in the like abstract class in also we have not override both
// methods so i have to do that so i know that if we don't do override all method from the interface to the class (implementing class) 
// then this class also become abstract now, because of this become the abstract class make new class and this abstract class we extends 
// with the  extends keyword for inheriting ,   in this we will not use the implement because we have now class not interface 





// so now if developer leaves the work half then 













// this below code is incorrect because when this RajTech class became the object then we have to write the abstract their 

/*

interface Clients
{ // as an the super class 
    void webdesign();   // public + abstract 
    void webdevelope();   // public + abstract 
}

class RajTech implements Clients   // sub class   // so now this become also the abstract class where because we have not implement all methods in this class
{
    @Override
    public void webdesign()
    {          // in this class all methods is implemented so this class will not become the abstract class 
        System.out.println("Green, Top menu, three dot button");
    }
} 

class RahulTech extends RajTech  // so now this is class have all code and control of the program 
{
    @Override
    public void webdevelope()
    {
        System.out.println("Html, Css, JavaScript");
    }
}

class CheckInterfacemethod
{
    public static void main(String []args)
    {
        RahulTech r = new RahulTech();
        r.webdesign();
        r.webdevelope();
    }
}

*/












/*

interface Clients
{ // as an the super class 
    void webdesign();   // public + abstract 
    void webdevelope();   // public + abstract 
}

abstract class RajTech implements Clients   // sub class   // so now this become also the abstract class where because we have not implement all methods in this class
{
    @Override
    public void webdesign()
    {          // in this class all methods is implemented so this class will not become the abstract class 
        System.out.println("Green, Top menu, three dot button");
    }
} 

class RahulTech extends RajTech  // so now this is class have all code and control of the program 
{
    @Override
    public void webdevelope()
    {
        System.out.println("Html, Css, JavaScript");
    }
}

class CheckInterfacemethod
{
    public static void main(String []args)
    {
        RahulTech r = new RahulTech();
        r.webdesign();
        r.webdevelope();
    }
}

*/










/*

interface Clients
{ // as an the super class 
    void webdesign();   // public + abstract 
    void webdevelope();   // public + abstract 
}

abstract class RajTech implements Clients   // sub class   // so now this become also the abstract class where because we have not implement all methods in this class
{
    @Override
    public void webdesign()
    {          // in this class all methods is implemented so this class will not become the abstract class 
        System.out.println("Green, Top menu, three dot button");
    }
} 

class RahulTech extends RajTech  // so now this is class have all code and control of the program 
{
    @Override
    public void webdevelope()
    {
        System.out.println("Html, Css, JavaScript");
    }
}

class CheckInterfacemethod
{
    public static void main(String []args)
    {
        RajTech r = new RahulTech();   // we can take reference variable of the super class also like that 
        r.webdesign();
        r.webdevelope();
    }
}

*/













interface Clients
{ // as an the super class 
    void webdesign();   // public + abstract 
    void webdevelope();   // public + abstract 
}

abstract class RajTech implements Clients   // sub class   // so now this become also the abstract class where because we have not implement all methods in this class
{
    @Override
    public void webdesign()
    {          // in this class all methods is implemented so this class will not become the abstract class 
        System.out.println("Green, Top menu, three dot button");
    }
} 

class RahulTech extends RajTech  // so now this is class have all code and control of the program 
{
    @Override
    public void webdevelope()
    {
        System.out.println("Html, Css, JavaScript");
    }
}

class CheckInterfacemethod
{
    public static void main(String []args)
    {
        Clients r = new RahulTech();   // we can take reference variable of the super class also like that 
        r.webdesign();
        r.webdevelope();
    }
}