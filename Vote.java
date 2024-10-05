                    /*CHECK VOTING ELIGIBILITY */
//INPUT AGE >= 18      ------>  VOTE
// INPUT AGE < 18      ------> NOT ELIGIBLE



/*
import java.util.Scanner;
class Vote
{
    public static void main(String[] args) {
        int age;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter your age: - ");
        age = ref.nextInt();
        String a = "Congratulations, you are eligible for vote";
        String b = "you are not eligible for vote";
        String c = (age>=18)?a:b;
        System.out.print(c);
    ref.close();
}
}
*/



/*
import java.util.Scanner;
class Vote
{
    public static void main(String[] args) {
        int age;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter your age: - ");
        age = ref.nextInt();        
        String c = (age>=18)?"Congratulations, you are eligible for vote":"you are not eligible for vote";
        System.out.print(c);
    ref.close();
}
}
*/



/**
import java.util.Scanner;
class Vote
{
    public static void main(String[] args) {
        int age;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter your age: - ");
        age = ref.nextInt();        
        if(age>=18)
        {
            System.out.print("Congratulations, you are eligible for vote");
        }
        else
        {
            System.out.print("you are not eligible for vote");
        }
    ref.close();
}
}
*/




/**
import java.util.Scanner;
class Vote{
    public static void main(String []args){
    int n;
    Scanner r = new Scanner(System.in);
    System.out.print("Enter any numbers: ");
    n = r.nextInt();
    if(n>=18){
        System.out.print("Congratulations, you are eligible for votes");
    }
    else{
        System.out.print("Sorry, YOu are not eligible for votes");
    }
r.close();

}
}
*/





/**
import java.util.Scanner;
class Vote{
    public static void main(String []args){
    int n;
    Scanner r = new Scanner(System.in);
    System.out.print("Enter any numbers: ");
    n = r.nextInt();
    String result = (n>=18)?("Congratulations, you are eligible for votes"):("Sorry, YOu are not eligible for votes");
    System.out.print(result);
r.close();

}
}
*/

import java.util.Scanner;
class Vote{
    public static void main(String []args){
    int n;
    Scanner r = new Scanner(System.in);
    System.out.print("Enter any numbers: ");
    n = r.nextInt();
    String a = "Congratulations, you are eligible for votes";
    String b = "Sorry, YOu are not eligible for votes";
    String result = (n>=18)?a:b;
    System.out.print(result);
r.close();

}
}