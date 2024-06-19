// import java.util.Scanner;
// class Inputoutput{
//     public static void main(String[] ar){
//         String a;
//         System.out.println("Enter name: ");
//         Scanner obj = new Scanner(System.in);
//         a = obj.nextLine();
//         System.out.print("This is the name: = " + a);
        // obj.close();
//     }
// }




// import java.util.Scanner;
// class Inputoutput{
//     public static void main(String[] ar){
//         int a;
//         System.out.println("Enter data: ");
//         Scanner obj = new Scanner(System.in);
//         a = obj.nextInt();
//         System.out.print("This is the data: = " + a);
        // obj.close();
//     }
// }





/* in below code when we will give the input then we have to put only
          the same datatype value that in code we have used method 
          name and then if we will put different value then 
          it will show an inputmistmatch exception error */


import java.util.Scanner;
class Inputoutput {
    public static void main(String[] args){
        int a;
        System.out.print("Enter data: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("This is the data: = " + a);
        scanner.close(); 
    }
}