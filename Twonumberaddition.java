/* Add two numbers in java */



import java.util.Scanner;
class Twonumberaddition
{
    public static void main(String[] args)
    {
        int i,j;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter two numbers- ");
        i = r.nextInt();
        j = r.nextInt();         // in this method is for taking input for scanner.
        int sum = i+j;
        System.out.println("Addition- "+sum);
        r.close();
    }
}