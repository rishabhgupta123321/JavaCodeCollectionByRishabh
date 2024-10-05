                            /*Delete any item(element) in Array*/

// Requirement - 
// a[4]  = 21, 45, 52, 12
// loc = 1 ----> Deleting element from location index value 1 
// a[4-1] = 21, 52, 12                            




import java.util.Scanner;
class Deleteelementinarray{
    public static void main(String []args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = r.nextInt();
        int a[] = new int[size];     // creating the object for taking the array's elements     // size is the no. of container
        System.out.print("Enter Array's elements: ");
        for(int i = 0;i<size;i++){
            a[i] = r.nextInt();
        }
        System.out.print("Array's elements before deletion: ");
        for(int j : a){
                System.out.print(j+" ");              // for-each loop has used
        }
        System.out.print("\nEnter the location of element: ");
        int loc = r.nextInt();
        for(int i = loc;i<size-1;i++){    // here we are deleting item from loc it means that we will remove container form loc.
            a[i] = a[i+1];
        }
        size--;
        System.out.print("Array's elements After deletion: ");
        for(int i = 0; i<size;i++){
                System.out.print(a[i]+" ");              // for-each loop has used
        }

        r.close();
    }
}






