/* For each loop statement in java  */


// whenever we will use foreach loop then we will must have multiple collection value 
// in the array we wil have always same type data it means same datatype value 

// firstly we have to write syntax so that we will not have any problem for doing program





// class Foreachloop{
//     public static void main(String []agjs){
//         int i[] = {10,20,30,40,50};

//         for( : ){

//         }
//     }
// }






// class Foreachloop{
//     public static void main(String []argss){
//         int a[] = {2,4,5,6,9};
//         for(int b:a){             // in this firstly b will take value from a array first value and store and forward to the statement and again and again this will go like this
//             System.out.println(b+" ");
//         }                                   
//     }

// }



// in terms of array this for-each is better than normal for loop.





// so after this i have proper code below - 


/**
class Foreachloop{
    public static void main(String []agjs){
        int i[] = {10,20,30,40,50};        // in this   int i and int i[]   is different-different 

        for(int b : i){          // in this b is a variable with datatype which store the array element one by one and then pass to the statement in for loop from i that is the array variable it means that is the collection of element.
            System.out.print(b+" ");
        }
    }
}  
*/                      







// in array case foreach loop is better in comparision to normal for loop

// if we don't take for each loop if we want to print array elements with using for loop then- 

/*
class Forloop{
    public static void main(String[] args) {
        int i;  // here i for index and a[] for array and a and a[] is different-different.
        int a[]={2,3,4,5,6,7};    //  in array we have index value that start from 0 
        for(i=0;i<a.length; ++i){ 
        System.out.print(a[i]+ " ");    
        }
    }
}
*/





/*
class Forloop {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7};  // properly initializing the array
        for (int i = 0; i < a.length; ++i) {  // declaring and using 'i' within the loop
            System.out.print(a[i] + " ");
        }
    }
}
*/






//this below code is wrong because of array initialized wrong.
/*
class Forloop{
    public static void main(String[] args) {
        int a,i;
        a[]={2,3,4,5,6,7};    //  in array we have index value that start from 0 
        for(i=0;i<a.length; ++i){ 
        System.out.print(a[i]+ " ");    
        }
    }
}

*/






// if we do this for-each loop program with the help of for loop then -

/**
 * Foreachloop
 */



 /**
 public class Foreachloop {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int n, i;
        n = a.length;
        // array's basic index from 0 and end till n-1 , where n is the length of the array
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");      // a[0] means 1 value when 0 is the index value
        }
    }
}
*/ 





public class Foreachloop {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int i;       // array's basic index from 0 and end till n-1 , where n is the length of the array
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");      // a[0] means 1 value when 0 is the index value
        }
    }
}