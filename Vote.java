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

