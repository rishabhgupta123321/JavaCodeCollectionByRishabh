          /* Greatest number among three numbers- */
// input -----> (10,20,30) - 30 (Max)      // Requirements


// class Greatestnumberinthreenumber{
//     public static void main(String[] args){
//     int a = 2,b=9,c=8;
//     if(a>b){      // 2>9
//         if(a>c){
//             System.out.print(a);
//         }
//         else{
//             System.out.print(c);
//         }
//     }
//         else{  // 2<9
//             if(b>c){  // 9>8
//                 System.out.print(b);
//             }
//             else{
//                 System.out.print(c);
//             }
//         }
//     }
// }



// in above code we have take curly bracket in if else statement but we know that if in     if or else
// statement we have only one statement then if we want then if we don't use curly bracket then 
// also this will correct code because in this if statement we have only one statement but like if in       if 
// statement we have more than one sentence then we have to must mandatory use curly bracket .
// like below code also-



/*
class Greatestnumberinthreenumber{
    public static void main(String[] args){
    int a = 2,b=9,c=8;
    if(a>b){
        if(a>c)
            System.out.print(a);  // in this only we have one sentence that's why if we don't use curly bracket then also this will be run.
        
        else
            System.out.print(c);
        
    }
        else{
            if(b>c)
                System.out.print(b);
            
            else
                System.out.print(c);
            
        }
    }
}
*/






// here we can also use ternary operator.

/**
class Greatestnumberinthreenumber{
    public static void main(String[] args) {
        int a = 2, b = 4, c = 1;
        if(a>b){
            if(a>c){
                System.out.print(a);
            }
            else{
                System.out.print(c);
            }
        }
        else{
            if(b>c){
                System.out.print(b);
            }
            else{
                System.out.print(c);
            }
        }
    }
}
*/


// ternary operator we can also apply in this.
class Greatestnumberinthreenumber{
    public static void main(String[] args) {
        int a = 2, b = 15, c = 9;
        int result = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.print("result is: "+ result);
    }
}







