                                        /* Smallest element in Array */





import java.util.Scanner;
class Smallestelementinarray{
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner reff = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        for(int i = 0;i<a.length;i++){
            a[i] = reff.nextInt();
        }
        int min = a[0];  // we have just suppose that a[0]  is the minimum value in array
        for(int i = 1;i<a.length;i++){
            if(a[i]<min){       // here in min for converting the value we can also use swap method also
                min = a[i];
            }
        }
        System.out.print("Smallest element in Array is: "+ min);
    reff.close();
    }   
}




// we can use here also for-each loop