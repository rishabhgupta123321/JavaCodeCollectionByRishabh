                    /*  Insert element in an Array */
// Requirements - a[5] ----->   1, 2, 3, 4, 6
// inserting an element -----> loc = 2 ----> item or element = 30
// then after inserting an element array size will increase ----> a[5+1] = 1, 2, 30, 3, 4, 6  



                    /* This program will be dynamically */

            //  in this size is means that no. of container in an array 


// size - 5(means 5 container and index 0 to 4) ----> 1, 2, 3 , 4, 5  -->  loc - 2 ---->
// item - 34 ----->  1, 2, 34, 3, 4, 5 ----> Now this is done insertion  






/*
import java.util.Scanner;
class InsertelementinArray{
    public static void main(String[] args) {
        int size;
        try(Scanner r = new Scanner(System.in)){
            System.out.print("Enter size of an array: ");
            size = r.nextInt();
            int a[] = new int[size];      // onject creation with new keyword
            System.out.print("Enter Elements of an array: ");     // size value is showing no. of container in array
            for(int i = 0;i<size;i++){
                a[i] = r.nextInt();
            }
            System.out.print("Before insertion Array elements: ");
            for(int i=0;i<size;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
}

*/






/*

import java.util.Scanner;
class InsertelementinArray{
    public static void main(String[] args) {
        int size,loc,item;
        try(Scanner r = new Scanner(System.in)){
            System.out.print("Enter size of an array: ");
            size = r.nextInt();
            int a[] = new int[size+1];      // onject creation with new keyword
                                    // when we insert value then we should have one more extra container , so that's
                                    // why we will add 1 value and then it will contain size+1 container 
            System.out.print("Enter Elements of an array: ");     // size value is showing no. of container in array
            for(int i = 0;i<size;i++){
                a[i] = r.nextInt();
            }
            System.out.print("Before insertion Array elements: ");
            for(int i=0;i<size;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            System.out.print("Enter the location of insert element from 0 to "+size+": ");
            loc = r.nextInt();     // input 
            System.out.print("Enter new item element: ");  // output , so it means in between 
            //we have to not take any statement for taking new line, these both will create new line automatically
            item = r.nextInt();
            // now i have to shift the value 1 shift
            // so here we will do here from last in this in last container
            // we will store the last-before value like this 
            // we will iterate the statement // so it means 
            //we have to take 1 add value it means if we want to insert value 
            // in loc then i have to take add 1 more like till loc+1 it means >loc ,
            // because when we take 1 add value then
            // then we will store loc value in loc+1 like   loc+1 = ((loc+1)-1) 
            //so this (loc+1)-1 value will go to in loc+1 container. 
            // here shifting we will do from backward to fardward. 
            for(int i = size; i>loc; i--){
                a[i] = a[i-1];
            }
            a[loc] = item;
            System.out.print("Array elements after insertion: ");
            for(int i = 0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
}

*/














/*

import java.util.Scanner;
class InsertelementinArray{
    public static void main(String[] args) {
        int size,loc,item;
        try(Scanner r = new Scanner(System.in)){
            System.out.print("Enter size of an array: ");
            size = r.nextInt();
            int a[] = new int[size+1];      // onject creation with new keyword
                                    // when we insert value then we should have one more extra container,
                                    // so that's why we will add 1 value and 
                                    //then it will contain size+1 container 
            System.out.print("Enter Elements of an array: "); //size value is showing no. of container in array
            for(int i = 0;i<size;i++){
                a[i] = r.nextInt();
            }
            System.out.print("Before insertion Array elements: ");
            for(int i=0;i<size;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            System.out.print("Enter the location of insert element from 0 to "+size+": ");
            loc = r.nextInt();     // input 
            System.out.print("Enter new item element: ");  // output , so it means in between we have to not take 
                                         //any statement for taking new line, these both will create new line automatically
            item = r.nextInt();
            // now i have to shift the value 1 shift
            // so here we will do here from last in this in last container 
            // we will store the last-before value like this 
            // we will iterate the statement // so it means we have to take 1 add value it means 
            //if we want to insert value 
            // in loc then i have to take add 1 more like till loc+1 it means >loc ,
            // because when we take 1 add value then
            // then we will store loc value in loc+1 like   loc+1 = ((loc+1)-1) 
            //so this (loc+1)-1 value will go to in loc+1 container. 
            // here shifting we will do from backward to fardward. 
            for(int i = size; i>loc; i--){
                a[i] = a[i-1];
            }
            a[loc] = item;
            size++;
            System.out.print("Array elements after insertion: ");
            for(int i = 0;i<size;i++){          // in this size when 6 then we can take value index 0 to 5 that's 
                                                // why i have taken size++ 
                System.out.print(a[i]+" ");
            }
        }
    }
}

*/






