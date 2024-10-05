                            /*Find average of an Array elements*/
// Requirement-  a[5] = 10, 20, 30, 40, 50 ------> sum -----> 150 
// Avg = sum/a.length = 150/5 ---->  30.0





/*

import java.util.Scanner;
class Averageofanarrayelements{
    public static void main(String[] argss){
        int sum = 0; double avg;
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt();
        }  
        for(int i = 0;i<a.length;i++){
            sum += a[i];
        }  
        avg = sum/a.length;                                // in this if we take this a.length means 5 then it is integer value
                                                        // so that's why we are dividing with integer to integer value then 
                                                        // it will give the integer output and then we are converting to double
                                                        // so we will get output in decimal but this is not come full division 
                                                        // so that's why we have to take in this size in double before diving to integer

        System.out.print("Average of Array elements is: "+ avg);
        r.close();
    }
}

*/









import java.util.Scanner;
class Averageofanarrayelements{
    public static void main(String[] argss){
        int sum = 0; double avg;
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        for(int i = 0;i<a.length;i++){
            a[i] = r.nextInt();
        }  
        for(int i = 0;i<a.length;i++){
            sum += a[i];
        }  
        avg = sum/5.0;                             

        System.out.print("Average of Array elements is: "+ avg);
        r.close();
    }
}