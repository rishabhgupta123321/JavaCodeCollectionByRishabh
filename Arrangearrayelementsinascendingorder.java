                            /* Arrange(sort) array elements in Ascending order*/
// Requirements -    a[5] = 10, 29, 91, 34, 2 ---->  2, 10, 29, 34, 91


/*

import java.util.Scanner;
class Arrangearrayelementsinascendingorder{
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
                if(a[i]>a[j]){             // swaping the values from a[i] to a[j] and a[j] to a[i]
                    a[i] = a[i]+a[j];
                    a[j] = a[i]-a[j];
                    a[i] =a[i]-a[j];
                }
            }
        }
        System.out.println();
        System.out.print("After arranging the array elements: ");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        }
    }
}
    
*/









import java.util.Scanner;
class Arrangearrayelementsinascendingorder{
    public static void main(String []args){
        int i, j,temp;
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
                if(a[i]>a[j]){             // swaping the values from a[i] to a[j] and a[j] to a[i]
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("After arranging the array elements: ");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
        }
    }
}
    
