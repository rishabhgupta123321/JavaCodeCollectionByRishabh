              /*Print Multiplication table--*/
//Input number - 5
// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50



/**
import java.util.Scanner;
class Multiplicationtable{
    public static void main(String []args){
        int n;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number: -- ");
        n = ref.nextInt();
        for(int i=1;i<=10;i++){
            int result = n*i;
            System.out.println(n+" * "+i+" = "+ result);
        }
        ref.close();
    }
}
*/




/**
import java.util.Scanner;
class Multiplicationtable{
    public static void main(String[] args) {
        int n, result;
        System.out.print("Enter any number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for(int i = 1;i<=10;i++){
            result = i * n;
            System.out.println(i +" * "+ n + " = "+result);
        }
    r.close();
    }
}
*/



import java.util.Scanner;
class Multiplicationtable{
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(i +" * "+ n + " = "+n*i);  // in this it is following the precedence operator
        }
    r.close();
    }
}