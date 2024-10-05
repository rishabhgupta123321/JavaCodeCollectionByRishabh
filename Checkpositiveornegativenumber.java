                /*Check number is positive or negative*/
// requirement - 
// input  n>0   +ve number
// input n<0   -ve number
// input n= 0    neither +ve nor -ve





/*
import java.util.Scanner;
class Checkpositiveornegativenumber{
    public static void main(String []args){
        int num;
        System.out.print("Enter any number ");
        Scanner reff = new Scanner(System.in);     //  object creation.
        num = reff.nextInt();    // taking method and then taking input 
        if(num<0){
            System.out.print("Given number is -ve number");
        }
        else if(num==0){
            System.out.print("Given number is neither +ve number nor -ve number, it means it is Zero");
        }
        else{
            System.out.print("Given number is +ve number");
        }
    reff.close();
    }
}
*/



import java.util.Scanner;     
class Checkpositiveornegativenumber{
    public static void main(String[] args) {
        int num;
        System.out.print("Enter any number: ");
        Scanner ref = new Scanner(System.in);
        num = ref.nextInt();
        if(num>0){
            System.out.println("positive number +ve");
        }
    else if(num<0) 
    {
        System.out.println("negative number -ve");
    }
    else{
        System.out.println("neither +ve nor -ve");
    }
        ref.close();
    }
}




















