                                  /*Nested if-else statement*
                                  This is the type four of our decision making(conditional statement)
                                

                                  */



// for finding the maximum number in between three number where we use nested if-else statement.


class Nestedifelsestatement{
    public static void main(String []args){
        int a = 9, b = 4, c = 1;
        System.out.println("This is your maximum number:- ");
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if(b>c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}