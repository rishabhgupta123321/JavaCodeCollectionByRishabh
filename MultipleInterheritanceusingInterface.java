                                    /*multiple Inheritance using interface*/


                    


// below code is incorrect 


/*
class A
{
    void show()
    {
        System.out.println("This is class A");
    }
}
class B
{
    void show()
    {
        System.out.println("This is class B");
    }
}
class MultipleInterheritanceusingInterface extends A,B
{  // sub class 
    public static void main(String []argfs)
    {
        MultipleInterheritanceusingInterface m = new MultipleInterheritanceusingInterface();
        m.show();
    }
}

*/







// below code is incorrect 


/*

interface A
{
    void show();
}
interface B
{
    void show();
}
class MultipleInterheritanceusingInterface implements A,B
{  // sub class 

    @Override 
    void show()
    {
        System.out.println("Interface A & B");
    }

    public static void main(String []argfs)
    {
        MultipleInterheritanceusingInterface m = new MultipleInterheritanceusingInterface();
        m.show();
    }
}

*/









/*

interface A
{
    void show();   // public + abstract
}
interface B
{
    void show();
}
class MultipleInterheritanceusingInterface implements A,B
{  // sub class 

    @Override 
    public void show()
    {
        System.out.println("Interface A & B");
    }

    public static void main(String []argfs)
    {
        MultipleInterheritanceusingInterface m = new MultipleInterheritanceusingInterface();
        m.show();
    }
}

*/






/*

interface A
{
    void show();   // public + abstract
}
interface B
{
    void disp();
}
class MultipleInterheritanceusingInterface implements A,B
{  // sub class 

    @Override 
    public void show()
    {
        System.out.println("Interface A");
    }
   @Override 
    public void disp()
    {
        System.out.println("Interface B");
    }

    public static void main(String []argfs)
    {
        MultipleInterheritanceusingInterface m = new MultipleInterheritanceusingInterface();
        m.show(); m.disp();
    }
}

*/






/*

interface A
{
    void show();   // public + abstract
}
interface B
{
    void disp();
}
class MultipleInterheritanceusing implements A,B
{  // sub class 

    @Override 
    public void show()
    {
        System.out.println("Interface A");
    }
   @Override 
    public void disp()
    {
        System.out.println("Interface B");
    }

}
    class MultipleInterheritanceusingInterface{
        
    public static void main(String []argfs)
    {
        MultipleInterheritanceusing m = new MultipleInterheritanceusing();
        m.show(); m.disp();
    }
}

*/








// below code is incorrect 

/*
 
interface A
{
    void show();   // public + abstract
}
interface B
{
    void disp();
}
class MultipleInterheritanceusing implements A,B  // abstract become
{  // sub class 

    @Override 
    public void show()
    {
        System.out.println("Interface A");
    }


}
    class MultipleInterheritanceusingInterface{
        
    public static void main(String []argfs)
    {
        MultipleInterheritanceusing m = new MultipleInterheritanceusing();
        m.show(); 
    }
}

*/









interface A
{
    void show();   // public + abstract
}
interface B
{
    void disp();
}
abstract class MultipleInterheritance implements A,B  // abstract become
{  // sub class 

    @Override 
    public void show()
    {
        System.out.println("Interface A");
    }

}

class MultipleInterheritanceusing extends MultipleInterheritance
{
    @Override 
    public void disp()
    {
        System.out.println("Interface B");
    }

}
    
class MultipleInterheritanceusingInterface{
        
    public static void main(String []argfs)
    {
        MultipleInterheritanceusing m = new MultipleInterheritanceusing();
        m.show(); m.disp();
    }
}

