                                    /* Star pattern (part - 2 )*/


/*

class Starpatternparttwo{
    public static void main(String []args){
        for(int i=1;i<=5;i++){  // rows
            for(int j=i;j<5;j++){    // space
            System.out.print(" ");
            }
            for(int k = 1 ; k<=(i+(i-1)) ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/




/*

class Starpatternparttwo{
    public static void main(String []args){
        for(int i=1;i<=5;i++){  // rows
            for(int j=i;j<5;j++){    // space
            System.out.print("  ");
            }
            for(int k = 1 ; k<=(i+(i-1)) ;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

*/





/*
class Starpatternparttwo{    
    public static void main(String []args){
        int i, j,k;
        for(i=1;i<=5;i++){  // rows
            for(j=i;j<5;j++){    // space
            System.out.print("  ");
            }
            for(k = 1 ; k<=(i+(i-1)) ;k++){  // column
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

*/




/*
class Starpatternparttwo{    
    public static void main(String []args){
        int i, j,k;
        for(i=1;i<=5;i++){  // rows
            for(j=i;j<5;j++){    // space
            System.out.print("  ");
            }
            for(k = i ; k<=(i+(i-1)) ;k++){  // column
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
*/







/* 

class Starpatternparttwo{    
    public static void main(String []args){
        int i, j,k;
        for(i=1;i<=5;i++){  // rows
            for(j=i;j<5;j++){    // space
            System.out.print("  ");   // here i have given two space 
            }
            for(k = i ; k<=(i+(i-1)) ;k++){  // column
                System.out.print(" *"+"  ");     // here i have given two space and one is with * 
            }
            System.out.println();
        }
    }
}

*/



// in this space is going down with big to small space and here * is going down with small to big

    


/*

class Starpatternparttwo{
    public static void main(String[] args) {
        int i,j,k;
        for(i = 1; i<=3;i++){
            for(j = i;j<3;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

*/






/*

class Starpatternparttwo{
    public static void main(String[] args) {
        int i,j,k;
        for(i = 1; i<=3;i++){
            for(j = i;j<3;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

*/




/*
class Starpatternparttwo{
    public static void main(String[] args) {
        int i,j,k;
        for(i = 1; i<=5;i++){
            for(j = i;j<5;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(i+(i-1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/





class Starpatternparttwo{
    public static void main(String[] args) {
        int i,j,k;
        for(i = 1; i<=5;i++){
            for(j = i;j<5;j++){
                System.out.print(" ");
            }
            for(k=1;k<=((2*i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
