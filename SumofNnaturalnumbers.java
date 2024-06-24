                    /* Sum of first N natural numbers in java- */


/*
import java.util.Scanner;
class SumofNnaturalnumbers{
    public static void main(String[] args) {
        int n,i,sum = 0;
        System.out.print("Enter the number of terms:- ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for(i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum of first N natural number is - "+sum);
    ref.close();
    }
}
*/




import java.util.Scanner;
class SumofNnaturalnumbers{
    public static void main(String[] args) {
        int n,i,sum = 0;
        System.out.print("Enter the number of terms:- ");
        try (Scanner ref = new Scanner(System.in)){
        n = ref.nextInt();
        for(i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("Sum of first N natural number is - "+sum);
    ref.close();
        }
    }
}