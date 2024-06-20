/* If else-if ladder statement....! -  */




// this we apply when we have many conditions then we can apply.


import java.util.Scanner;
class Ifelseifladderstatement{
    public static void main(String[] args) {
        int marks; 
        System.out.print("Enter your marks:- ");
        Scanner ref = new Scanner(System.in);
        marks = ref.nextInt();
        if(marks>=80){
            System.out.println("Topper Student");
        }
        else if (marks<80 && marks >= 60){
            System.out.println("First Student");
        }
        else{
            System.out.println("Second Student");
        }
        ref.close();
    }
}