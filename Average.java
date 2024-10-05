                /*Calculate Total marks and Average marks-- */


/**
import java.util.Scanner;
class Average{
        public static void main(String[] args) {
            int a,b,c,d,e;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter Five numbers: - ");
            a = obj.nextInt();
            b = obj.nextInt();
            c = obj.nextInt();
            d = obj.nextInt();
            e = obj.nextInt();
            int total = a+b+c+d+e;     // because average is equal to sum of all number and then divide by no. of numbers.
            System.out.println("Total value of five number is " + total);
            double avg = total/5.0;  // here double because average value can be in the fractional, that's why this is double or float and         
                                        // with this 5.0 also taken by seen of fraction value outcome.\
            System.out.println("Average value of five number is " + avg);
            obj.close();
        }
    }
*/
    


    
/*like this in this, if we will put 80 77 30 99 80    then in this we will get average value is 
 * so in this we will get total value is 366 and average value is 73.2 and this value we can
 * also see like this way that this is the percentage 73.2% in 100%, because if we assume here  the total marks 
 * can be come is 500 (100 for each subject) so here it means that 366 marks got from 500 marks and so 
 * like that we have divided from 5 it means we have divided from 500 with multiplication of 100 
 * because this 73.2% came from 100%.
*/



 // in floating point number default value we take usaully double but if we want float then we can apply f or F in last of the number.

 

 /*
 In Java, the default type for floating-point literals is double. So,
when you write a floating-point number like 3.14, it is considered a double by default.
To explicitly specify a float, you need to add an f or F at the end of the number, for example, 3.14f.

*/





/*
import java.util.Scanner;
class Average{
        public static void main(String[] args) {
            int a,b,c,d,e;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter Five numbers: - ");
            a = obj.nextInt();
            b = obj.nextInt();
            c = obj.nextInt();
            d = obj.nextInt();
            e = obj.nextInt();
            int total = a+b+c+d+e;     
            System.out.println("Total value of five number is " + total);
            float avg = total/5f;       
            System.out.println("Average value of five number is " + avg);
            obj.close();
        }
    }
*/







/*
import java.util.Scanner;
class Average{
        public static void main(String[] args) {
            int a,b,c,d,e;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter Five numbers: - ");
            a = obj.nextInt();
            b = obj.nextInt();
            c = obj.nextInt();
            d = obj.nextInt();
            e = obj.nextInt();
            int total = a+b+c+d+e;     
            System.out.println("Total value of five number is " + total);
            float avg = total/5F;       
            System.out.println("Average value of five number is " + avg);
            obj.close();
        }
    }
*/










/** 
import java.util.Scanner;
class Average{
    public static void main(String []args){
        int a, b, c, d, e;
        System.out.print("Enter number of Five Subjects: ");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        c = r.nextInt();
        d = r.nextInt();
        e = r.nextInt();
        int total = a+b+c+d+e;
        System.out.print("Total number is : "+ total+" \n");
        double avg = total/5;
        System.out.print("Average number of subjects is : "+ avg);
        r.close();

        
    }
}
    */


/**
in this above code and below code difference is only the divisor that is in below is 5.0  (double value) but in 
above is 5 , so in above when we put any 5 integer value and then when we divide with 5 then we only get integer value that is 
integer and then after coming integer value without decimal , that value according to the double avg   assigning operator that value impliclitly
change to the from integer to double that is in decimal so in this that this will come .0 as a decimal form , but 

when we come in below where we are dividing the integer total value with by floating point number that is double   5.0  then in this when integer value we will divide 
with this so this will automatically firstly become total value also in double and then this will divide so that 
after division the value come that is in double so that this will not be like always .0  it can be different also and then after that this value will assign in double 
datatype variable.

*/






/**
    import java.util.Scanner;
    class Average{
        public static void main(String []args){
            int a, b, c, d, e;
            System.out.print("Enter number of Five Subjects: ");
            Scanner r = new Scanner(System.in);
            a = r.nextInt();
            b = r.nextInt();
            c = r.nextInt();
            d = r.nextInt();
            e = r.nextInt();
            int total = a+b+c+d+e;
            System.out.print("Total number is : "+ total+" \n");
            double avg = total/5;
            System.out.print("Average number of subjects is : "+ avg);
            r.close();
    
            
        }
    }
        */




/**
        import java.util.Scanner;
        class Average{
            public static void main(String []args){
                int a, b, c, d, e;
                System.out.print("Enter number of Five Subjects: ");
                Scanner r = new Scanner(System.in);
                a = r.nextInt();
                b = r.nextInt();
                c = r.nextInt();
                d = r.nextInt();
                e = r.nextInt();
                int total = a+b+c+d+e;
                System.out.print("Total number is : "+ total+" \n");
                float avg = total/5f;
                System.out.print("Average number of subjects is : "+ avg);
                r.close();
        
                
            }
        }
            */





            import java.util.Scanner;
            class Average{
                public static void main(String []args){
                    int a, b, c, d, e;
                    System.out.print("Enter number of Five Subjects: ");
                    Scanner r = new Scanner(System.in);
                    a = r.nextInt();
                    b = r.nextInt();
                    c = r.nextInt();
                    d = r.nextInt();
                    e = r.nextInt();
                    int total = a+b+c+d+e;
                    System.out.print("Total number is : "+ total+" \n");
                    float avg = total/5F;
                    System.out.print("Average number of subjects is : "+ avg);
                    r.close();
            
                    
                }
            }