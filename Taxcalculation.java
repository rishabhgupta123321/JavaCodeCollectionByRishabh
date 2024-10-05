             /*Tax calculation program*/
// input sal<=10000 -----> No Tax
// input sal>10000 b/w sal<=100000 -----> 10% Tax
// input sal>100000 ------> 20% Tax




/**
import java.util.Scanner;
class Taxcalculation{
    public static void main(String[] args){
        int sal;
        double Tax;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        sal = ref.nextInt();
        if(sal<=10000){
            System.out.print(sal + " " + "No Tax");
        }
        else if(sal>10000 && sal<100000){
            Tax = sal*0.1;
            System.out.print(sal + " " + Tax);
        }
        else{
            Tax = sal*0.2;
            System.out.print(sal + " " + Tax);
        }
        ref.close();
    }
}
    */






// Requirements- 
//  input sal <= 10000 --------> Tax
// input sal > 10000 b/w sal <= 100000 --------> 10% tax     
// input sal > 100000  ------->  20 tax
import java.util.Scanner;
class Taxcalculation{
    public static void main(String []aargs){
        int sal; double tax ;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter your salary:  ");
        sal = r.nextInt();
        if(sal<=10000){
            System.out.print(sal + " No tax");
        }
        else if((sal>10000) && (sal < 100000)){
            tax = sal * 0.1;
            System.out.print(sal + " Salary tax is  "+ tax);
        }
        else{
            tax = sal * 0.2;
            System.out.print(sal + " Salary tax is "+ tax);
        }
    r.close();
    }
}
