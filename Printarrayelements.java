                                /* Different ways to Print Array elements in java */

                            // in this we have to different way to print elements without taking any array method- 

                            // 1.  By for loop 2. By for-each loop 




                                    /* For loop */





// for loop 


/*

class Printarrayelements{
    public static void main(String []args){
        int a[] = new int[4];   // here 4 means size and 4 means 4 elements and because of assign in array reference variable so 4 is no. of container also. 
        a[0] = 16;
        a[1] = 12;
        a[2] = 3;
        a[3] = 6;
        for(int i = 0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

*/






                                /* For-each loop */





// For-each loop  , this loop has made for specially array so we have to use this loop mostly , recommended


/*

class Printarrayelements{
    public static void main(String []args){
        int a[] = new int[4];   // here 4 means size and 4 means 4 elements and because of assign in array reference variable so 4 is no. of container also. 
        a[0] = 16;
        a[1] = 12;
        a[2] = 3;
        a[3] = 6;
        for(int b : a){    // in this value is going one by one from a array to b variable and then it is printing
            System.out.print(b +" ");
        }
    }
}

*/