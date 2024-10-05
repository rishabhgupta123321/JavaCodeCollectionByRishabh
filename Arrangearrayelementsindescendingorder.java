                                  /*Sort array elements in Descending order */
//  Requirements --> a[5] = 23, 53, 12, 91, 12    ---->    91, 53, 23, 12, 12



/*

import java.util.Scanner;
class Arrangearrayelementsindescendingorder{
    public static void main(String []args){
        int i, j;
        int a[] = new int[4];
        try(Scanner r = new Scanner(System.in)){
        System.out.print("Enter Array elements: ");
        for(i=0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        System.out.print("Before arranging the array elements: ");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(i=0;i<a.length;i++){
            for(j = i+1;j<a.length;j++){
                if(a[i]<a[j]){             // swaping the values from a[i] to a[j] and a[j] to a[i]
                    a[i] = a[i]+a[j];         // this is not the standard method of swaping 
                    a[j] = a[i]-a[j];      // in standing method we take temporiry vairable and then we swap the values
                    a[i] =a[i]-a[j];
                }
            }
        }
        System.out.println();
        System.out.print("After arranging the array elements in Descending order: ");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        }
    }
}

*/









import java.util.Scanner;
class Arrangearrayelementsindescendingorder{
    public static void main(String []args){
        int i, j,temp;
        int a[] = new int[5];
        try(Scanner r = new Scanner(System.in)){
        System.out.print("Enter Array elements: ");
        for(i=0;i<a.length;i++){
            a[i] = r.nextInt();
        }
        System.out.print("Before arranging the array elements: ");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(i=0;i<a.length;i++){
            for(j = i+1;j<a.length;j++){
                if(a[i]<a[j]){            
                    temp = a[i];       
                    a[i]= a[j];     
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("After arranging the array elements in Descending order: ");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        }
    }
}
