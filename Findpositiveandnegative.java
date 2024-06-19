// finding the number that it is +ve or  -ve number. 

import java.util.Scanner;
class Findpositiveandnegative{
    int n;
    public static void main(String[] args){
        System.out.println("Enter any number..!");
        Ifelsestatement ref = new Ifelsestatement();
        int x = ref.n;
        Scanner orr = new Scanner(System.in);
        x = orr.nextInt(); 
        if(x>=0){
            System.out.println("+ve number");
        }
        else{
            System.out.println("-ve number");
        }
        orr.close();
    }
}
