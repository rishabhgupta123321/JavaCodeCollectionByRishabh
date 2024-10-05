                /* All prime numbers between two numbers*/
// input first number - 12 
// input second number - 20
// All prime numbers between from 12 to 20 -->  13 17 19  




/*
import java.util.Scanner;
class Primenumbersbetweentwonumbers{
    public static void main(String[] args) {
        int n1,n2,count;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        n1 = r.nextInt();
        n2 = r.nextInt();
        System.out.print("All prime numbers between from "+n1+ " to "+n2 +" is : ");
        for(int i=n1; i<=n2; i++){  
            count = 0;     // column        // in this loop we have initialized count every time 0 for every  
                                            // iteration , so it will be correct, 
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                   count++;
                }
            }
            if(count == 2){
                System.out.print(i+" ");
            }
        }         
        r.close();
    }
}
*/






// This below given code is wrong because in this , we have taken count = 0 before all for loop but  
//  we have to take count in for loop that is first for loop like above code. 


    // import java.util.Scanner;   
    // class Primenumbersbetweentwonumbers{
    //     public static void main(String[] args) {
    //         int n1,n2,count=0;      // in this we have initialized count only one time so if 
                                    // according to the loop if this will increase in loop then 
                                    // it should be reset for new i value but it will not reset that's why it 
                                    // is wrong method , in this we have to initialized 
                                    // count in for loop for correct output.
                                    
    //         Scanner r = new Scanner(System.in);
    //         System.out.print("Enter two numbers: ");
    //         n1 = r.nextInt();
    //         n2 = r.nextInt();
    //         System.out.print("All prime numbers between from "+n1+ " to "+n2 +" is : ");
    //         for(int i=n1; i<=n2; i++){       // column
    //             for(int j = 1; j<=i; j++){
    //                 if(i%j==0){
    //                    count++;
    //                 }
    //             }
    //             if(count == 2){
    //                 System.out.print(i+" ");
    //             }
    //         }         
    //         r.close();
    //     }
    // }

    



// Second approach of finding the all prime numbers between two numbers
  


/*
import java.util.Scanner;
class Primenumbersbetweentwonumbers{
    public static void main(String[] args) {
        int n1,n2,i,j;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        n1 = r.nextInt();
        n2 = r.nextInt();
        System.out.print("All prime numbers between from "+n1+ " to "+n2 +" is : ");
        for(i=n1; i<=n2; i++){  
            
            for(j = 2; j<=i; j++){    // here we know that every number is divide by 1 so we have remove that number and 
                                         // started from 2 and now in from outer for loop we are getting the values one by one from n1 to 
                                         // n2 so in inner for loop when one value comes from outer for loop that is i here, 
                                         // so we have to think that if in inner for loop if this value is prime number it means it 
                                         // will divide with itself (it means from 2 to that i number itself it will divide only one time) except 1 number , 
                                         // so that's why we in inner for loop we will check that if i%j == 0 then it means that, that j number can be a prime number it means 
                                         // i can be a prime number but for checking this we have to check this in if statement only one time and then we have to do break;
                                         // the loop and then we have to think that if i will be prime number then it will divide only by itself because we have remove firstly 1 that can also divide , 
                                        // so it means when i will divide only by itself means that when we have break the loop after satisfying the if statement one time then we have to check that 
                                        // this number is j is that is divide with i and is giving remainder 0 it is prime or not , it menas 
                                        // it means for prime number it should be equal to the itself number it means we will check that i == j , if correct then 
                                        // it will be prime number i and then we have to print that number with the help of output print statement
                if(i%j==0)
                   break;
                
            }
            if(i == j)
                System.out.print(j+" ");
            
        }         
        r.close();
    }
}
*/





/*  
import java.util.Scanner;
class Primenumbersbetweentwonumbers{
    public static void main(String[] args) {
        int n1,n2,i,j;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        n1 = r.nextInt();
        n2 = r.nextInt();
        System.out.print("All prime numbers between from "+n1+ " to "+n2 +" is : ");
        for(i=n1; i<=n2; i++){  
            
            for(j = 2; j<=i; j++){
                if(i%j==0)
                   break;
                
            }
            if(i == j)
                System.out.print(i+" ");           
        }         
        r.close();
    }
}
*/




/*
import java.util.Scanner;
class Primenumbersbetweentwonumbers{
    public static void main(String []args){
        int n1,n2;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = r.nextInt();
        n2 = r.nextInt();
        System.out.print("Prime number is : ");
        for(int i=n1; i<=n2;i++){
            int count = 0;           
                                      // in this when we take any variable so in for loop we have to know that if we have declare any variable 
                                      // in method main method but outside for loop then it will show error because in this we have to know 
                                      // that in for loop we have to take and declare variable so that in for loop we can access the variable like count and 
                                      // it will also not show any error.

            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i+" ");
            }
            }
        r.close();
    }
}
    */



/*
import java.util.Scanner;
class Primenumbersbetweentwonumbers{
    public static void main(String []args){
        int n1,n2,j;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = r.nextInt();
        n2 = r.nextInt();
        System.out.print("Prime number is : ");
        for(int i=n1; i<=n2;i++){

            for(j = 2; j<=i; j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.print(i+" ");
            }
            }
        r.close();
    }
}
*/





import java.util.Scanner;
class Primenumbersbetweentwonumbers{
    public static void main(String []args){
        int n1,n2,i,j;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter two number: ");
        n1 = r.nextInt();
        n2 = r.nextInt();
        System.out.print("Prime number is : ");
        for(i=n1; i<=n2;i++){

            for(j = 2; j<=i; j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.print(i+" ");
            }
            }
        r.close();
    }
}

