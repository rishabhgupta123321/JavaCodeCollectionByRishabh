                                                        /*throws keyword in java */






// this below code is incorrect



/*

class ThrowsDemo{
    public static void main(String[] args){
        for(int i=0;i<=9;i++){
            System.out.println(i);
            Thread.sleep(1000);          // here Thread  is a class and sleep is the method of this class 
        }
    }
}

*/



// this code is correct below



/*

class ThrowsDemo{
    public static void main(String[] args) throws InterruptedException // chekced exception // and this will go to the jvm and jvm will handle this exception
    {
        for(int i=0;i<=9;i++){
            System.out.println(i);
            Thread.sleep(1000);    // here Thread  is a class and sleep is the method of this class 
                                         // this method sleep is for wait during execution of the program
        }
    }
}

*/





// but here best approach to handle the exception is try-catch        , 






// class ThrowsDemo{
//     public static void main(String[] args)
//     {
//         try{
//         for(int i=0;i<=9;i++){
//             System.out.println(i);
//             Thread.sleep(1000);    // here Thread  is a class and sleep is the method of this class 
//                                          // this method sleep is for wait during execution of the program
//         }
//     }
//     catch(InterruptedException e){
//         System.out.println(e.getMessage());
//     }
//     }
// }




// class ThrowsDemo{
//     public static void main(String[] args)
//     {
//         try{
//         for(int i=0;i<=9;i++){
//             System.out.println(i);
//             Thread.sleep(1);    // here Thread  is a class and sleep is the method of this class 
//                                          // this method sleep is for wait during execution of the program
//         }
//     }
//     catch(InterruptedException e){
//         System.out.println(e);
//     }
//     }
// }





// import java.lang.Thread;
// class ThrowsDemo{
//     public static void main(String[] args)
//     {
//         try{
//         for(int i=0;i<=9;i++){
//             System.out.println(i);
//             Thread.sleep(0);    // here Thread  is a class and sleep is the method of this class 
//                                          // this method sleep is for wait during execution of the program
//         }
//     }
//     catch(InterruptedException e){
//         System.out.println(e);
//     }
//     }
// }